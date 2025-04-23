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

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DeliverySupportController {

    @FXML
    private TextField orderIdField;

    @FXML
    private TextArea issueField;

    @FXML
    private Label confirmationLabel;

    private static final String FILE_NAME = "support_tickets.bin";

    @FXML
    void handleSubmit() {
        String orderId = orderIdField.getText().trim();
        String issue = issueField.getText().trim();

        if (orderId.isEmpty() || issue.isEmpty()) {
            confirmationLabel.setText("Please complete all fields.");
            confirmationLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        String ticketId = "TKT-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();

        SupportTicket ticket = new SupportTicket(ticketId, orderId, issue);

        saveTicket(ticket);

        confirmationLabel.setText("Ticket created: " + ticketId);
        confirmationLabel.setStyle("-fx-text-fill: green;");
        orderIdField.clear();
        issueField.clear();
    }

    private void saveTicket(SupportTicket ticket) {
        List<SupportTicket> tickets = loadTickets();
        tickets.add(ticket);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(tickets);
        } catch (IOException e) {
            e.printStackTrace();
            confirmationLabel.setText("Error saving ticket.");
            confirmationLabel.setStyle("-fx-text-fill: red;");
        }
    }

    @SuppressWarnings("unchecked")
    private List<SupportTicket> loadTickets() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<SupportTicket>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
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
