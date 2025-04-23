package cse213.fooddeliveryproject.Sadnan_2321524;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class DeliveryHistoryController {

    @FXML
    private TableView<DeliveryRecord> deliveryHistoryTable;

    @FXML
    private TableColumn<DeliveryRecord, String> orderIdCol;

    @FXML
    private TableColumn<DeliveryRecord, String> customerCol;

    @FXML
    private TableColumn<DeliveryRecord, String> deliveryDateCol;

    @FXML
    private TableColumn<DeliveryRecord, String> paymentStatusCol;

    @FXML
    private Label statusLabel;

    private final ObservableList<DeliveryRecord> deliveryData = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        orderIdCol.setCellValueFactory(data -> data.getValue().orderIdProperty());
        customerCol.setCellValueFactory(data -> data.getValue().customerProperty());
        deliveryDateCol.setCellValueFactory(data -> data.getValue().dateProperty());
        paymentStatusCol.setCellValueFactory(data -> data.getValue().paymentStatusProperty());

        loadDeliveryData();
    }

    private void loadDeliveryData() {
        deliveryData.clear();
        deliveryData.addAll(
                new DeliveryRecord("2001", "Alice Green", "2024-03-05", "Paid"),
                new DeliveryRecord("2002", "Bob Smith", "2024-03-06", "Pending"),
                new DeliveryRecord("2003", "Cathy Brown", "2024-03-07", "Paid")
        );
        deliveryHistoryTable.setItems(deliveryData);
        statusLabel.setText("Delivery history loaded.");
    }

    @FXML
    void handleRefresh() {
        loadDeliveryData();
    }

    @FXML
    void handleBackAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/fooddeliveryproject/DeliveryManDashboard.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Delivery History");
            stage.show();
        } catch (IOException e) {
            System.err.println("Failed to load Delivery History.");
            e.printStackTrace();
        }
    }
}
