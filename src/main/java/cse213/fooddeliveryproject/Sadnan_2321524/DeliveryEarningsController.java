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

public class DeliveryEarningsController {

    @FXML
    private TableView<EarningRecord> earningsTable;

    @FXML
    private TableColumn<EarningRecord, String> weekCol;

    @FXML
    private TableColumn<EarningRecord, String> deliveriesCol;

    @FXML
    private TableColumn<EarningRecord, String> earningsCol;

    @FXML
    private TableColumn<EarningRecord, String> bonusCol;

    @FXML
    private Label statusLabel;

    private final ObservableList<EarningRecord> earningsData = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        weekCol.setCellValueFactory(data -> data.getValue().weekProperty());
        deliveriesCol.setCellValueFactory(data -> data.getValue().deliveriesProperty());
        earningsCol.setCellValueFactory(data -> data.getValue().earningsProperty());
        bonusCol.setCellValueFactory(data -> data.getValue().bonusProperty());

        loadEarningsData();
    }

    private void loadEarningsData() {
        earningsData.clear();
        earningsData.addAll(
                new EarningRecord("Mar 01–Mar 07", "24", "$120.00", "$10.00"),
                new EarningRecord("Mar 08–Mar 14", "30", "$150.00", "$15.00"),
                new EarningRecord("Mar 15–Mar 21", "27", "$135.00", "$12.00")
        );
        earningsTable.setItems(earningsData);
        statusLabel.setText("Earnings updated.");
    }

    @FXML
    void handleRefresh() {
        loadEarningsData();
    }

    @FXML
    void handleBackAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/fooddeliveryproject/DeliveryManDashboard.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Delivery Earnings");
            stage.show();
        } catch (IOException e) {
            System.err.println("Failed to load Delivery Earnings.");
            e.printStackTrace();
        }
    }
}
