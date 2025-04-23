package fooddelivery.fooddeliveryapp;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class MarketingAnalyticsController {

    @FXML private ComboBox<String> timeFilter;
    @FXML private ComboBox<String> regionFilter;
    @FXML private ComboBox<String> userTypeFilter;
    @FXML private TableView<MarketingAnalyticsReport> analyticsTable;
    @FXML private TableColumn<MarketingAnalyticsReport, String> metricCol;
    @FXML private TableColumn<MarketingAnalyticsReport, String> valueCol;
    @FXML private TableColumn<MarketingAnalyticsReport, String> periodCol;
    @FXML private Label lblMessage;

    private  ArrayList<MarketingAnalyticsReport> reportData = new ArrayList<>();

    @FXML
    public void initialize() {

        metricCol.setCellValueFactory(new PropertyValueFactory<MarketingAnalyticsReport, String>("metric"));
        valueCol.setCellValueFactory(new PropertyValueFactory<MarketingAnalyticsReport, String>("value"));
        periodCol.setCellValueFactory(new PropertyValueFactory<MarketingAnalyticsReport, String>("period"));


        analyticsTable.getItems().addAll(reportData);


        timeFilter.getItems().addAll("Today", "This Week", "This Month");
        regionFilter.getItems().addAll("All", "Dhaka", "Chittagong", "Sylhet");
        userTypeFilter.getItems().addAll("All", "New", "Returning");
    }

    @FXML
    public void handleFilter() {
        reportData.clear();  // Clear existing report data

        // Get selected filters from ComboBoxes
        String selectedTimeRange = timeFilter.getValue();
        String selectedRegion = regionFilter.getValue();  // Get selected region
        String selectedUserType = userTypeFilter.getValue();


        if ("All".equals(selectedRegion) || selectedRegion == null) {
            selectedRegion = "All Regions";
        }

        // Adding report data for metrics, values, and periods (based on filters)
        reportData.add(new MarketingAnalyticsReport("Website Visits - " + selectedRegion, "12,340", selectedTimeRange));
        reportData.add(new MarketingAnalyticsReport("Order Conversions - " + selectedRegion, "2,150", selectedTimeRange));
        reportData.add(new MarketingAnalyticsReport("Promo Redemptions - " + selectedRegion, "620", selectedTimeRange));
        reportData.add(new MarketingAnalyticsReport("Bounce Rate - " + selectedRegion, "38%", selectedTimeRange));

        lblMessage.setText("✅ Report generated for " + selectedTimeRange + " in " + selectedRegion);
        updateAnalyticsTable();
    }

    @FXML
    public void handleExport() {
        lblMessage.setText("✅ Report exported (simulated)");
    }

    private void updateAnalyticsTable() {
        analyticsTable.getItems().clear();
        analyticsTable.getItems().addAll(reportData);
    }
}
