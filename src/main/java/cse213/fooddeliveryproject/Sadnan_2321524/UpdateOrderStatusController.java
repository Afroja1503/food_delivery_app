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

public class UpdateOrderStatusController {

    @FXML
    private TableView<OrderStatus> orderStatusTable;

    @FXML
    private TableColumn<OrderStatus, String> orderIdCol;

    @FXML
    private TableColumn<OrderStatus, String> customerNameCol;

    @FXML
    private TableColumn<OrderStatus, String> currentStatusCol;

    @FXML
    private TableColumn<OrderStatus, String> updateCol;

    @FXML
    private Label statusLabel;

    private final ObservableList<OrderStatus> orderStatusList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        orderIdCol.setCellValueFactory(data -> data.getValue().orderIdProperty());
        customerNameCol.setCellValueFactory(data -> data.getValue().customerNameProperty());
        currentStatusCol.setCellValueFactory(data -> data.getValue().statusProperty());
        updateCol.setCellValueFactory(data -> data.getValue().statusDropdownProperty());
        
        updateCol.setCellFactory(col -> new TableCell<>() {
            private final ComboBox<String> comboBox = new ComboBox<>();

            {
                comboBox.getItems().addAll("Pending", "Picked Up", "Delivered");
                comboBox.setOnAction(e -> {
                    OrderStatus os = getTableView().getItems().get(getIndex());
                    os.setStatusDropdown(comboBox.getValue());
                });
            }

            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    comboBox.setValue(item);
                    setGraphic(comboBox);
                }
            }
        });

        loadOrderStatusData();
    }

    private void loadOrderStatusData() {
        orderStatusList.clear();
        orderStatusList.addAll(
                new OrderStatus("1001", "John Doe", "Pending"),
                new OrderStatus("1002", "Emily Carter", "Picked Up"),
                new OrderStatus("1003", "Liam Wilson", "Pending")
        );
        orderStatusTable.setItems(orderStatusList);
        statusLabel.setText("Orders loaded. You may update status.");
    }

    @FXML
    void handleSubmit() {
        for (OrderStatus os : orderStatusList) {
            String newStatus = os.getStatusDropdown();
            os.setStatus(newStatus);
        }
        orderStatusTable.refresh();
        statusLabel.setText("Statuses updated successfully.");
    }

    @FXML
    void handleBackAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/fooddeliveryproject/DeliveryManDashboard.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Update Order Status");
            stage.show();
        } catch (IOException e) {
            System.err.println("Failed to load Update Order Status.");
            e.printStackTrace();
        }
    }
}
