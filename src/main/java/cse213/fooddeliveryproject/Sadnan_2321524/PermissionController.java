package cse213.fooddeliveryproject.Sadnan_2321524;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.stage.Stage;

import java.io.IOException;

public class PermissionController {

    @FXML private TableView<UserPermission> userPermissionTable;
    @FXML private TableColumn<UserPermission, String> usernameColumn;
    @FXML private TableColumn<UserPermission, String> roleColumn;
    @FXML private TableColumn<UserPermission, Boolean> canViewEarningsColumn;
    @FXML private TableColumn<UserPermission, Boolean> canChangePricesColumn;
    @FXML private Label statusLabel;

    private ObservableList<UserPermission> permissionList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        usernameColumn.setCellValueFactory(data -> data.getValue().usernameProperty());
        roleColumn.setCellValueFactory(data -> data.getValue().roleProperty());
        canViewEarningsColumn.setCellValueFactory(data -> data.getValue().canViewEarningsProperty());
        canChangePricesColumn.setCellValueFactory(data -> data.getValue().canChangePricesProperty());

        canViewEarningsColumn.setCellFactory(CheckBoxTableCell.forTableColumn(canViewEarningsColumn));
        canChangePricesColumn.setCellFactory(CheckBoxTableCell.forTableColumn(canChangePricesColumn));

        permissionList.addAll(
                new UserPermission("alice", "Admin", true, true),
                new UserPermission("bob", "Seller", true, false),
                new UserPermission("carol", "Customer", false, false)
        );

        userPermissionTable.setItems(permissionList);
    }

    @FXML
    void handleSavePermissions() {
        for (UserPermission up : permissionList) {
            // In a real app, persist each user's permissions to DB or config file
            System.out.println("Saving permissions for " + up.getUsername());
        }
        statusLabel.setText("Permissions updated.");
    }

    public static class UserPermission {
        private final StringProperty username = new SimpleStringProperty();
        private final StringProperty role = new SimpleStringProperty();
        private final BooleanProperty canViewEarnings = new SimpleBooleanProperty();
        private final BooleanProperty canChangePrices = new SimpleBooleanProperty();

        public UserPermission(String username, String role, boolean view, boolean change) {
            this.username.set(username);
            this.role.set(role);
            this.canViewEarnings.set(view);
            this.canChangePrices.set(change);
        }

        public StringProperty usernameProperty() { return username; }
        public StringProperty roleProperty() { return role; }
        public BooleanProperty canViewEarningsProperty() { return canViewEarnings; }
        public BooleanProperty canChangePricesProperty() { return canChangePrices; }

        public String getUsername() { return username.get(); }
        public String getRole() { return role.get(); }
        public boolean isCanViewEarnings() { return canViewEarnings.get(); }
        public boolean isCanChangePrices() { return canChangePrices.get(); }
    }
    @FXML
    void handleBackAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/fooddeliveryproject/AdminDashboard.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Permission");
            stage.show();
        } catch (IOException e) {
            statusLabel.setText("Failed to load Permission.");
            e.printStackTrace();
        }
    }
}
