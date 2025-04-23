package fooddelivery.fooddeliveryapp;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class MarketingDiscountController {

    @FXML private ComboBox<String> metricFilter;
    @FXML private TableView<MarketingDiscountStrategy> strategyTable;
    @FXML private TableColumn<MarketingDiscountStrategy, String> nameCol;
    @FXML private TableColumn<MarketingDiscountStrategy, String> performanceCol;
    @FXML private TableColumn<MarketingDiscountStrategy, String> recommendationCol;
    @FXML private Label lblStrategyMessage;

    private final ArrayList<MarketingDiscountStrategy> strategyList = new ArrayList<>();

    @FXML
    public void initialize() {

        nameCol.setCellValueFactory(new PropertyValueFactory<MarketingDiscountStrategy, String>("strategyName"));
        performanceCol.setCellValueFactory(new PropertyValueFactory<MarketingDiscountStrategy, String>("performance"));
        recommendationCol.setCellValueFactory(new PropertyValueFactory<MarketingDiscountStrategy, String>("recommendation"));

        // Manually add items to the TableView from the ArrayList
        updateStrategyTable();

        // Populate the metric filter ComboBox
        metricFilter.getItems().addAll("ROI", "Redemption", "Click Rate");
    }

    @FXML
    public void handleGenerateInsights() {
        strategyList.clear();  // Clear existing insights

        String selectedMetric = metricFilter.getValue();

        if (selectedMetric == null || selectedMetric.isEmpty()) {
            lblStrategyMessage.setText("❌ Select a metric first.");
            return;
        }


        switch (selectedMetric) {
            case "ROI":
                strategyList.add(new MarketingDiscountStrategy("Flat 20%", "Good", "Extend Duration"));
                strategyList.add(new MarketingDiscountStrategy("BOGO", "Low", "A/B Test Alternatives"));
                break;
            case "Redemption":
                strategyList.add(new MarketingDiscountStrategy("Free Delivery", "Moderate", "Target New Users"));
                strategyList.add(new MarketingDiscountStrategy("BOGO", "High", "Increase Awareness"));
                break;
            case "Click Rate":
                strategyList.add(new MarketingDiscountStrategy("Flat 10%", "Good", "Focus on Repeat Users"));
                strategyList.add(new MarketingDiscountStrategy("BOGO", "Moderate", "Analyze Customer Segments"));
                break;
        }

        lblStrategyMessage.setText("✅ Insights generated for metric: " + selectedMetric);
        updateStrategyTable();  // Manually update the table with new data
    }

    private void updateStrategyTable() {
        strategyTable.getItems().clear();  // Clear existing items in the TableView
        strategyTable.getItems().addAll(strategyList);  // Manually add all items from the ArrayList to the TableView
    }
}
