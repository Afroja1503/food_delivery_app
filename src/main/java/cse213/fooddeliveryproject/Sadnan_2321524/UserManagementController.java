package cse213.fooddeliveryproject.Sadnan_2321524;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import java.io.IOException;

public class UserManagementController {

    @FXML private TextField searchField;
    @FXML private Button addUserButton;
    @FXML private Button editUserButton;
    @FXML private Button deleteUserButton;
    @FXML private Button backButton;
    @FXML private Label statusLabel;

    @FXML private TableView<User> userTable;
    @FXML private TableColumn<User, Integer> idColumn;
    @FXML private TableColumn<User, String> nameColumn;
    @FXML private TableColumn<User, String> emailColumn;
    @FXML private TableColumn<User, String> roleColumn;

    private ObservableList<User> userList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        roleColumn.setCellValueFactory(new PropertyValueFactory<>("role"));

        userList.addAll(
                new User(1, "Alice Johnson", "alice@example.com", "Customer"),
                new User(2, "Bob Smith", "bob@example.com", "Seller"),
                new User(3, "Carol White", "carol@example.com", "Admin")
        );

        userTable.setItems(userList);

        searchField.textProperty().addListener((obs, oldText, newText) -> filterUsers(newText));
    }

    private void filterUsers(String searchText) {
        ObservableList<User> filtered = FXCollections.observableArrayList();
        for (User u : userList) {
            if (u.getName().toLowerCase().contains(searchText.toLowerCase()) ||
                    u.getEmail().toLowerCase().contains(searchText.toLowerCase())) {
                filtered.add(u);
            }
        }
        userTable.setItems(filtered);
    }

    @FXML
    void handleAddUser(ActionEvent event) {
        User newUser = new User(userList.size() + 1, "New User", "newuser@example.com", "Customer");
        userList.add(newUser);
        userTable.setItems(userList);
        statusLabel.setText("New user added.");
    }

    @FXML
    void handleEditUser(ActionEvent event) {
        User selected = userTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setName(selected.getName() + " (Edited)");
            userTable.refresh();
            statusLabel.setText("User edited.");
        } else {
            statusLabel.setText("No user selected.");
        }
    }

    @FXML
    void handleDeleteUser(ActionEvent event) {
        User selected = userTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            userList.remove(selected);
            userTable.setItems(userList);
            statusLabel.setText("User deleted.");
        } else {
            statusLabel.setText("No user selected.");
        }
    }

    @FXML
    void handleBackAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/fooddeliveryproject/AdminDashboard.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Admin Dashboard");
            stage.show();
        } catch (IOException e) {
            statusLabel.setText("Failed to load Admin Dashboard.");
            e.printStackTrace();
        }
    }
}
