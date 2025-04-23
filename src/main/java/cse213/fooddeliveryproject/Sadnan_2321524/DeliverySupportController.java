package cse213.fooddeliveryproject.Sadnan_2321524;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.UUID;

public class DeliverySupportController {

    @FXML
    private TextField orderIdField;

    @FXML
    private TextArea issueField;

    @FXML
    private Label confirmationLabel;

    @FXML
    void handleSubmit() {
        String orderId = orderIdField.getText().trim();
        String issue = issueField.getText().trim();

        if (orderId.isEmpty() || issue.isEmpty()) {
            confirmationLabel.setText("Please complete all fields.");
            confirmationLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        // Simulate ticket generation
        String ticketId = "TKT-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();

        // Simulate storing support request (in real system, call a DB or API here)
        System.out.println("Support Request Submitted:");
        System.out.println("Order ID: " + orderId);
        System.out.println("Issue: " + issue);
        System.out.println("Ticket ID: " + ticketId);

        confirmationLabel.setText("Ticket created: " + ticketId);
        confirmationLabel.setStyle("-fx-text-fill: green;");
        orderIdField.clear();
        issueField.clear();
    }
    @FXML
    void handleBackAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/fooddeliveryproject/DeliveryManDashboard.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Delivery Support");
            stage.show();
        } catch (IOException e) {
            System.err.println("Failed to load Delivery Support.");
            e.printStackTrace();
        }
    }
}
