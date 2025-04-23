package fooddelivery.fooddeliveryapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MarketingSocialMediaController {

    @FXML private TextField txtPlatform;
    @FXML private TextField txtBudget;
    @FXML private TextField txtAudience;
    @FXML private TextField txtDuration;
    @FXML private TextField txtMediaFile;
    @FXML private TextArea txtAdCopy;
    @FXML private Label lblAdMessage;

    @FXML
    public void handleLaunchAd(ActionEvent event) {
        String platform = txtPlatform.getText();
        String budgetStr = txtBudget.getText();
        String audience = txtAudience.getText();
        String duration = txtDuration.getText();
        String media = txtMediaFile.getText();
        String copy = txtAdCopy.getText();

        if (platform.isEmpty() || budgetStr.isEmpty() || audience.isEmpty() ||
                duration.isEmpty() || media.isEmpty() || copy.isEmpty()) {
            lblAdMessage.setText("❌ Please fill all fields.");
            return;
        }

        try {
            double budget = Double.parseDouble(budgetStr);

            if (budget < 100) {
                lblAdMessage.setText("❌ Budget too low.");
                return;
            }

            MarketingAdCampaign ad = new MarketingAdCampaign(
                    platform, budget, audience, duration, media, copy
            );

            lblAdMessage.setText("✅ Ad on " + platform + " launched successfully!");

        } catch (NumberFormatException e) {
            lblAdMessage.setText("❌ Budget must be a number.");
        }
    }
}
