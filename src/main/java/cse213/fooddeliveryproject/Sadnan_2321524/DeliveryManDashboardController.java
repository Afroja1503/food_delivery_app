package cse213.fooddeliveryproject.Sadnan_2321524;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class DeliveryManDashboardController {

    @FXML
    private Label statusLabel;

    private void switchScene(ActionEvent event, String fxmlPath, String title) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle(title);
            stage.show();
        } catch (IOException e) {
            System.out.println("Error loading " + title + ": " + e.getMessage());
            statusLabel.setText("Error loading " + title);
            e.printStackTrace();
        }
    }

    @FXML
    void handleAssignedOrders(ActionEvent event) {
        System.out.println("Navigating to Assigned Orders screen...");
        statusLabel.setText("Viewing assigned orders...");
        switchScene(event, "/cse213/fooddeliveryproject/AssignedOrders.fxml", "Assigned Orders");
    }

    @FXML
    void handleUpdateOrderStatus(ActionEvent event) {
        System.out.println("Navigating to Update Order Status screen...");
        statusLabel.setText("Update an order's status.");
        switchScene(event, "/cse213/fooddeliveryproject/UpdateOrderStatus.fxml", "Update Order Status");
    }

    @FXML
    void handleDeliveryHistory(ActionEvent event) {
        System.out.println("Navigating to Delivery History screen...");
        statusLabel.setText("Viewing delivery history.");
        switchScene(event, "/cse213/fooddeliveryproject/DeliveryHistory.fxml", "Delivery History");
    }

    @FXML
    void handleEarnings(ActionEvent event) {
        System.out.println("Navigating to Earnings screen...");
        statusLabel.setText("Viewing earnings...");
        switchScene(event, "/cse213/fooddeliveryproject/DeliveryEarnings.fxml", "Earnings");
    }

    @FXML
    void handleContactSupport(ActionEvent event) {
        System.out.println("Navigating to Contact Support screen...");
        statusLabel.setText("Submit a support request.");
        switchScene(event, "/cse213/fooddeliveryproject/DeliverySupport.fxml", "Support");
    }

    @FXML
    void handleUpdateAvailability(ActionEvent event) {
        System.out.println("Navigating to Update Availability screen...");
        statusLabel.setText("Toggling availability status.");
        switchScene(event, "/cse213/fooddeliveryproject/DeliveryAvailability.fxml", "Update Availability");
    }

    @FXML
    void handleViewRoutes(ActionEvent event) {
        System.out.println("Navigating to View Routes screen...");
        statusLabel.setText("Viewing delivery routes.");
        switchScene(event, "/cse213/fooddeliveryproject/DeliveryRoutes.fxml", "Delivery Routes");
    }

    @FXML
    void handleCustomerFeedback(ActionEvent event) {
        System.out.println("Navigating to Customer Feedback screen...");
        statusLabel.setText("Reading customer reviews.");
        switchScene(event, "/cse213/fooddeliveryproject/CustomerFeedback.fxml", "Customer Feedback");
    }

    @FXML
    void handleBackAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/fooddeliveryproject/Login.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Delivery Man");
            stage.show();
        } catch (IOException e) {
            System.err.println("Failed to load Delivery Man");
            e.printStackTrace();
        }
    }
}