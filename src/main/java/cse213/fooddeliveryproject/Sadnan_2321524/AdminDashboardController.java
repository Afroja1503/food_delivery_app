package cse213.fooddeliveryproject.Sadnan_2321524;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AdminDashboardController {

    @FXML private Button userManagementBtn;
    @FXML private Button systemSettingsBtn;
    @FXML private Button systemLogsBtn;
    @FXML private Button permissionsBtn;
    @FXML private Button reportsBtn;
    @FXML private Button backupsBtn;
    @FXML private Button systemHealthBtn;
    @FXML private Button tosBtn;

    @FXML
    void handleUserManagement(ActionEvent event) {
        System.out.println("Navigating to User Management...");
        // Add scene loading logic here
    }

    @FXML
    void handleSystemSettings(ActionEvent event) {
        System.out.println("Navigating to System Settings...");
    }

    @FXML
    void handleSystemLogs(ActionEvent event) {
        System.out.println("Navigating to System Logs...");
    }

    @FXML
    void handlePermissions(ActionEvent event) {
        System.out.println("Navigating to Permissions...");
    }

    @FXML
    void handleReports(ActionEvent event) {
        System.out.println("Navigating to Reports...");
    }

    @FXML
    void handleBackups(ActionEvent event) {
        System.out.println("Navigating to Backups...");
    }

    @FXML
    void handleSystemHealth(ActionEvent event) {
        System.out.println("Navigating to System Health...");
    }

    @FXML
    void handleTOS(ActionEvent event) {
        System.out.println("Navigating to Terms of Service...");
    }
}
