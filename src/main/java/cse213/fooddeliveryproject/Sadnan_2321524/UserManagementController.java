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

import java.io.*;
import java.util.ArrayList;

public class UserManagementController {

    @FXML private TextField nameField;
    @FXML private TextField emailField;
    @FXML private ComboBox<String> roleComboBox;
    @FXML private Button addUserButton;
    @FXML private Button deleteUserButton;
    @FXML private Button backButton;
    @FXML private Label statusLabel;

    @FXML private TableView<User> userTable;
    @FXML private TableColumn<User, Integer> idColumn;
    @FXML private TableColumn<User, String> nameColumn;
    @FXML private TableColumn<User, String> emailColumn;
    @FXML private TableColumn<User, String> roleColumn;

    private ObservableList<User> userList = FXCollections.observableArrayList();
    private ObservableList<User> archivedUsers = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        roleColumn.setCellValueFactory(new PropertyValueFactory<>("role"));

        roleComboBox.setItems(FXCollections.observableArrayList("Customer", "Seller", "Admin"));

        // Populate the initial user list
        userList.addAll(
                new User(1, "Alice Johnson", "alice@example.com", "Customer"),
                new User(2, "Bob Smith", "bob@example.com", "Seller"),
                new User(3, "Carol White", "carol@example.com", "Admin")
        );

        userTable.setItems(userList);
    }

    @FXML
    void handleAddUser(ActionEvent event) {
        String name = nameField.getText();
        String email = emailField.getText();
        String role = roleComboBox.getValue();

        if (name.isEmpty() || email.isEmpty() || role == null) {
            statusLabel.setText("Please fill in all fields.");
            return;
        }

        int newId = userList.size() + 1;
        User newUser = new User(newId, name, email, role);
        userList.add(newUser);
        userTable.setItems(userList);

        nameField.clear();
        emailField.clear();
        roleComboBox.getSelectionModel().clearSelection();
        statusLabel.setText("New user added.");
    }

    @FXML
    void handleDeleteUser(ActionEvent event) {
        User selected = userTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            userList.remove(selected);              // Remove from active list
            archivedUsers.add(selected);            // Add to archive
            userTable.setItems(userList);           // Refresh TableView
            saveArchivedUsersToBinFile();           // Save archive
            statusLabel.setText("User deleted and archived.");
        } else {
            statusLabel.setText("No user selected.");
        }
    }

    @FXML
    public void saveArchivedUsersToBinFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("archived_users.bin"))) {
            oos.writeObject(new ArrayList<>(archivedUsers));
            System.out.println("Archived users saved to binary file.");
            statusLabel.setText("Archived users saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            statusLabel.setText("Error saving archive.");
        }
    }

    @FXML
    void handleBackAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/fooddeliveryproject/AdminDashboard.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("User Management");
            stage.show();
        } catch (IOException e) {
            statusLabel.setText("Failed to load User Management.");
            e.printStackTrace();
        }
    }
}
