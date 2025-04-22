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

public class AssignedOrdersController {

    @FXML
    private TableView<Order> ordersTable;

    @FXML
    private TableColumn<Order, String> orderIdCol;

    @FXML
    private TableColumn<Order, String> customerNameCol;

    @FXML
    private TableColumn<Order, String> addressCol;

    @FXML
    private TableColumn<Order, String> deliveryTimeCol;

    @FXML
    private Label statusLabel;

    private final ObservableList<Order> orders = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        orderIdCol.setCellValueFactory(data -> data.getValue().orderIdProperty());
        customerNameCol.setCellValueFactory(data -> data.getValue().customerNameProperty());
        addressCol.setCellValueFactory(data -> data.getValue().addressProperty());
        deliveryTimeCol.setCellValueFactory(data -> data.getValue().deliveryTimeProperty());

        loadOrders();
    }

    private void loadOrders() {
        orders.clear();
        orders.addAll(
                new Order("1001", "John Doe", "123 Main St", "10:00 AM"),
                new Order("1002", "Jane Smith", "456 Park Ave", "11:30 AM"),
                new Order("1003", "Emily Carter", "789 Elm St", "1:15 PM")
        );
        ordersTable.setItems(orders);
        statusLabel.setText("Orders loaded successfully.");
    }

    @FXML
    void handleRefresh() {
        loadOrders();
    }

    @FXML
    void handleBackAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/fooddeliveryproject/DeliveryManDashboard.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Assigned Orders");
            stage.show();
        } catch (IOException e) {
            statusLabel.setText("Failed to load Assigned Orders.");
            e.printStackTrace();
        }
    }
}
