package cse213.fooddeliveryproject.Sadnan_2321524;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private ComboBox<String> roleComboBox;

    @FXML
    private Label statusLabel;

    @FXML
    public void initialize() {
        roleComboBox.getItems().addAll("Admin", "Delivery Man");
        roleComboBox.setValue("Admin");
    }

    @FXML
    void handleLogin(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String role = roleComboBox.getValue();

        // For demonstration, using fixed credentials (replace with real auth in future)
        if (username.equals("admin") && password.equals("admin123") && role.equals("Admin")) {
            System.out.println("Admin login successful!");
            switchScene(event, "/cse213/fooddeliveryproject/AdminDashboard.fxml", "Admin Dashboard");
        } else if (username.equals("delivery") && password.equals("del123") && role.equals("Delivery Man")) {
            System.out.println("Delivery Man login successful!");
            switchScene(event, "/cse213/fooddeliveryproject/DeliveryManDashboard.fxml", "Delivery Dashboard");
        } else {
            statusLabel.setText("Invalid credentials or role.");
            System.out.println("Login failed. Username: " + username + ", Role: " + role);
        }
    }

    private void switchScene(ActionEvent event, String fxmlPath, String title) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle(title);
            stage.show();
        } catch (Exception e) {
            statusLabel.setText("Error loading " + title);
            e.printStackTrace();
        }
    }
}
