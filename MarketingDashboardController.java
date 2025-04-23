package fooddelivery.fooddeliveryapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MarketingDashboardController {

    @FXML
    private AnchorPane mainContent;

    private void loadView(String fxmlName) {
        try {
            AnchorPane view = FXMLLoader.load(getClass().getResource("/fooddelivery/fooddeliveryapp/" + fxmlName));
            mainContent.getChildren().setAll(view);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void loadCampaigns() {
        loadView("marketing_campaign_view.fxml");
    }

    @FXML
    public void loadAnalytics() {
        loadView("marketing_analytics_view.fxml");
    }

    @FXML
    public void loadSocialMedia() {
        loadView("marketing_socialmedia_view.fxml");
    }

    @FXML
    public void loadLoyalty() {
        loadView("marketing_loyalty_view.fxml");
    }

    @FXML
    public void loadSurveys() {
        loadView("marketing_survey_view.fxml");
    }

    @FXML
    public void loadPartnerships() {
        loadView("marketing_partnership_view.fxml");
    }

    @FXML
    public void loadDiscounts() {
        loadView("marketing_discount_view.fxml");
    }

    @FXML
    public void loadBrand() {
        loadView("marketing_brand_view.fxml");
    }

    @FXML
    public void handleLogout() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fooddelivery/fooddeliveryapp/login_view.fxml"));
            Stage stage = (Stage) mainContent.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Login");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
