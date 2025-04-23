package fooddelivery.fooddeliveryapp;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class MarketingBrandController {

    @FXML private ComboBox<String> areaSelector;
    @FXML private TableView<MarketingBrandInsight> insightTable;
    @FXML private TableColumn<MarketingBrandInsight, String> areaCol;
    @FXML private TableColumn<MarketingBrandInsight, String> statusCol;
    @FXML private TableColumn<MarketingBrandInsight, String> suggestionCol;
    @FXML private Label lblBrandMessage;

    private  ArrayList<MarketingBrandInsight> insightList = new ArrayList<>();

    @FXML
    public void initialize() {

        areaCol.setCellValueFactory(new PropertyValueFactory<MarketingBrandInsight, String>("area"));
        statusCol.setCellValueFactory(new PropertyValueFactory<MarketingBrandInsight, String>("currentStatus"));
        suggestionCol.setCellValueFactory(new PropertyValueFactory<MarketingBrandInsight, String>("suggestion"));


        updateInsightTable();

        // Populate ComboBox with filter options
        areaSelector.getItems().addAll("User Interface", "Tone of Voice", "Visual Branding", "Responsiveness");
    }

    @FXML
    public void handleAnalyzeBrand() {
        String area = areaSelector.getValue();
        if (area == null || area.isEmpty()) {
            lblBrandMessage.setText("❌ Select an area to analyze.");
            return;
        }

        insightList.clear();  // Clear the existing insights

        // Dummy data based on selected area
        switch (area) {
            case "User Interface":
                insightList.add(new MarketingBrandInsight(area, "Cluttered", "Use cleaner layouts"));
                break;
            case "Tone of Voice":
                insightList.add(new MarketingBrandInsight(area, "Inconsistent", "Standardize messaging tone"));
                break;
            case "Visual Branding":
                insightList.add(new MarketingBrandInsight(area, "Weak Logo Presence", "Reinforce logo usage"));
                break;
            case "Responsiveness":
                insightList.add(new MarketingBrandInsight(area, "Slow feedback", "Improve review replies"));
                break;
        }

        lblBrandMessage.setText("✅ Insights loaded for: " + area);
        updateInsightTable();  // Manually update the table with new data
    }

    private void updateInsightTable() {
        insightTable.getItems().clear();  // Clear the existing items in the TableView
        insightTable.getItems().addAll(insightList);  // Manually add items from the ArrayList to the TableView
    }
}
