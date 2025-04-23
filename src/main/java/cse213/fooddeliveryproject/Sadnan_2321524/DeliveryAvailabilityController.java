package cse213.fooddeliveryproject.Sadnan_2321524;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;

import java.io.IOException;

public class DeliveryAvailabilityController {

    @FXML
    private ToggleButton availabilityToggle;

    @FXML
    private Label statusLabel;

    private boolean isAvailable = false;

    @FXML
    public void initialize() {
        updateToggleLabel();
    }

    @FXML
    private void handleToggleAvailability() {
        isAvailable = !isAvailable;
        updateToggleLabel();

        System.out.println("Availability updated: " + (isAvailable ? "Available" : "Unavailable"));

        statusLabel.setText("Your availability is now set to: " + (isAvailable ? "Available" : "Unavailable"));
        statusLabel.setStyle("-fx-text-fill: green;");
    }

    private void updateToggleLabel() {
        availabilityToggle.setText(isAvailable ? "Available" : "Unavailable");
    }

    @FXML
    void handleBackAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/fooddeliveryproject/DeliveryManDashboard.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Delivery Availability");
            stage.show();
        } catch (IOException e) {
            System.err.println("Failed to load Delivery Availability.");
            e.printStackTrace();
        }
    }
}
