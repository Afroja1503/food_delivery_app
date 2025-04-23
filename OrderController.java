package fooddelivery.fooddeliveryapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.Collections;

public class OrderController {

    @FXML
    private TableView<Order> orderTable;
    @FXML
    private TableColumn<Order, Integer> orderIdCol;
    @FXML
    private TableColumn<Order, String> customerCol;
    @FXML
    private TableColumn<Order, String> statusCol;
    @FXML
    private TableColumn<Order, String> addressCol;
    @FXML
    private TableColumn<Order, Double> totalCol;
    @FXML
    private ComboBox<String> statusCombo;
    @FXML
    private Label lblMessage;

    ArrayList<Order> orderList = new ArrayList<>();

    @FXML
    public void initialize() {
        orderIdCol.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        customerCol.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        addressCol.setCellValueFactory(new PropertyValueFactory<>("deliveryAddress"));
        totalCol.setCellValueFactory(new PropertyValueFactory<>("totalAmount"));

        statusCombo.getItems().addAll("Preparing", "Out for Delivery", "Delivered");

        // Dummy orders
        orderList.add(new Order(101, "Anika", Collections.emptyList(), 1200.0, "Preparing", "Dhaka"));
        orderList.add(new Order(102, "Simin", Collections.emptyList(), 950.0, "Preparing", "Chittagong"));

        updateOrderTable();
    }

    private void updateOrderTable() {
        orderTable.getItems().clear();
        orderTable.getItems().addAll(orderList);
    }

    @FXML
    public void handleUpdateStatus(ActionEvent actionEvent) {
        Order selected = orderTable.getSelectionModel().getSelectedItem();
        String newStatus = statusCombo.getValue();

        if (selected == null || newStatus == null || newStatus.isEmpty()) {
            lblMessage.setText("Please select an order and status.");
            lblMessage.setStyle("-fx-text-fill: red;");
        } else {
            if (selected.getStatus().equals("Delivered")) {
                lblMessage.setText("Cannot update a delivered order.");
                lblMessage.setStyle("-fx-text-fill: red;");
            } else {
                selected.setStatus(newStatus);
                updateOrderTable();
                lblMessage.setText("Order status updated to: " + newStatus);
                lblMessage.setStyle("-fx-text-fill: green;");
            }
        }
    }
}

