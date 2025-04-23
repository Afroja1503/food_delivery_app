package fooddelivery.fooddeliveryapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML private TextField txtUsername;
    @FXML private PasswordField txtPassword;
    @FXML private ComboBox<String> roleSelector;
    @FXML private Label lblLoginMessage;

    @FXML
    public void initialize() {
        roleSelector.getItems().addAll("Seller", "Marketing Manager");
    }

    @FXML
    public void handleLogin(ActionEvent event) {
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String role = roleSelector.getValue();

        if (username.isEmpty() || password.isEmpty() || role == null) {
            lblLoginMessage.setText("❌ Please fill all fields.");
            return;
        }

        // Simulated login success (you can add real validation here)
        try {
            String fxmlFile = role.equals("Seller")
                    ? "seller_dashboard.fxml"
                    : "marketing_dashboard.fxml";

            Parent root = FXMLLoader.load(getClass().getResource("/fooddelivery/fooddeliveryapp/" + fxmlFile));
            Stage stage = (Stage) txtUsername.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle(role + " Dashboard");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
