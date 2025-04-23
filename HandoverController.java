package fooddelivery.fooddeliveryapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

public class HandoverController {

    @FXML
    private TableView<Order> prepOrderTable;
    @FXML
    private TableColumn<Order, Integer> orderIdCol;
    @FXML
    private TableColumn<Order, String> itemsCol;
    @FXML
    private TableColumn<Order, String> addressCol;
    @FXML
    private TableColumn<Order, String> statusCol;
    @FXML
    private Label lblMessage;

    private final ArrayList<Order> preparingOrders = new ArrayList<>();

    @FXML
    public void initialize() {
        orderIdCol.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        itemsCol.setCellValueFactory(new PropertyValueFactory<>("itemsString"));
        addressCol.setCellValueFactory(new PropertyValueFactory<>("deliveryAddress"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        // Dummy data
        preparingOrders.add(new Order(201, "Alice", Collections.emptyList(), 500.0, "Preparing", "Banani"));
        preparingOrders.add(new Order(202, "Bob", Collections.emptyList(), 700.0, "Preparing", "Dhanmondi"));

        updateTableView();
    }

    private void updateTableView() {
        prepOrderTable.getItems().clear();
        prepOrderTable.getItems().addAll(preparingOrders);
    }

    @FXML
    public void handleMarkAsReady(ActionEvent event) {
        Order selected = prepOrderTable.getSelectionModel().getSelectedItem();
        if (selected == null) {
            lblMessage.setText("Please select an order.");
            return;
        }
        if (!selected.getStatus().equals("Preparing")) {
            lblMessage.setText("Only 'Preparing' orders can be marked as ready.");
            return;
        }

        selected.setStatus("Ready for Pickup");
        selected.setRiderName("John");
        selected.setRiderContact("+8801XXXXXXXXX");
        updateTableView();
        lblMessage.setText("Order marked as Ready. Rider assigned.");
    }

    @FXML
    public void handleConfirmHandover(ActionEvent event) {
        Order selected = prepOrderTable.getSelectionModel().getSelectedItem();
        if (selected == null) {
            lblMessage.setText("Please select an order.");
            return;
        }

        if (!selected.getStatus().equals("Ready for Pickup")) {
            lblMessage.setText("Only 'Ready for Pickup' orders can be handed over.");
            return;
        }

        selected.setStatus("Out for Delivery");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        selected.setHandoverTimestamp(LocalDateTime.now().format(formatter));

        updateTableView();
        lblMessage.setText("Order handed over to rider successfully.");
    }
}
