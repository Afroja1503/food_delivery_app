package cse213.fooddeliveryproject.Sadnan_2321524;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AdminDashboardController {

    @FXML
    private void handleUserManagement(ActionEvent event) {
        System.out.println("Navigating to User Management...");
        switchScene(event, "/cse213/fooddeliveryproject/UserManagement.fxml");
    }

    @FXML
    private void handleSystemSettings(ActionEvent event) {
        System.out.println("Navigating to System Settings...");
        switchScene(event, "/cse213/fooddeliveryproject/SystemSetting.fxml");
    }

    @FXML
    private void handleSystemLogs(ActionEvent event) {
        System.out.println("Navigating to System Logs...");
        switchScene(event, "/cse213/fooddeliveryproject/SystemLogs.fxml");
    }

    @FXML
    private void handlePermissions(ActionEvent event) {
        System.out.println("Navigating to Permissions...");
        switchScene(event, "/cse213/fooddeliveryproject/Permission.fxml");
    }

    @FXML
    private void handleReports(ActionEvent event) {
        System.out.println("Navigating to Reports...");
        switchScene(event, "/cse213/fooddeliveryproject/Report.fxml");
    }

    @FXML
    private void handleBackups(ActionEvent event) {
        System.out.println("Navigating to Backups...");
        switchScene(event, "/cse213/fooddeliveryproject/Backup.fxml");
    }

    @FXML
    private void handleSystemHealth(ActionEvent event) {
        System.out.println("Navigating to System Health...");
        switchScene(event, "/cse213/fooddeliveryproject/Health.fxml");
    }

    @FXML
    private void handleTOS(ActionEvent event) {
        System.out.println("Navigating to Terms of Service...");
        switchScene(event, "/cse213/fooddeliveryproject/Terms.fxml");
    }

    private void switchScene(ActionEvent event, String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error while switching scenes: " + e.getMessage());
        }
    }
}
