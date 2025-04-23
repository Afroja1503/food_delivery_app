package fooddelivery.fooddeliveryapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class SalesReportController {

    @FXML private TableView<Order> salesTable;
    @FXML private TableColumn<Order, Integer> orderIdCol;
    @FXML private TableColumn<Order, String> customerCol;
    @FXML private TableColumn<Order, String> statusCol;
    @FXML private TableColumn<Order, Double> totalCol;

    @FXML private ComboBox<String> dateRangeCombo;

    @FXML private Label lblTotalOrders;
    @FXML private Label lblTotalRevenue;
    @FXML private Label lblBestItem;
    @FXML private Label lblMessage;

    private final ArrayList<Order> reportList = new ArrayList<>();

    @FXML
    public void initialize() {
        orderIdCol.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        customerCol.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        totalCol.setCellValueFactory(new PropertyValueFactory<>("totalAmount"));

        updateSalesTable(); // First update when initializing

        dateRangeCombo.getItems().addAll("Today", "This Week", "This Month");
    }

    private void updateSalesTable() {
        salesTable.getItems().clear();
        salesTable.getItems().addAll(reportList);  // Manually add all items from ArrayList
    }

    @FXML
    public void handleGenerateReport(ActionEvent actionEvent) {
        String selectedRange = dateRangeCombo.getValue();
        if (selectedRange == null || selectedRange.isEmpty()) {
            lblMessage.setText("Please select a date range.");
            return;
        }

        reportList.clear();  // Clear existing report list
        // Add dummy data for now (replace with actual logic later)
        reportList.add(new Order(301, "Anika", null, 1500.0, "Delivered", "Dhaka"));
        reportList.add(new Order(302, "Simin", null, 900.0, "Delivered", "Chittagong"));

        // Calculate total orders and revenue
        int totalOrders = reportList.size();
        double totalRevenue = 0;
        for (Order o : reportList) {
            totalRevenue += o.getTotalAmount();
        }

        lblTotalOrders.setText("Orders: " + totalOrders);
        lblTotalRevenue.setText("Revenue: BDT " + totalRevenue);
        lblBestItem.setText("Best Item: Burger 🍔");  // Placeholder logic for now
        lblMessage.setText("Report generated for: " + selectedRange);

        updateSalesTable();  // Update the TableView after report generation
    }
}
