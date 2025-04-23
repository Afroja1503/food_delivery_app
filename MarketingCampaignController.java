package fooddelivery.fooddeliveryapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MarketingCampaignController {

    @FXML private TextField txtPromoCode;
    @FXML private TextField txtDiscountType;
    @FXML private TextField txtDiscountPercent;
    @FXML private TextField txtEligibleItems;
    @FXML private TextField txtDuration;
    @FXML private TextField txtTargetAudience;
    @FXML private Label lblMessage;

    @FXML
    public void handleLaunchCampaign(ActionEvent event) {
        String promoCode = txtPromoCode.getText();
        String discountType = txtDiscountType.getText();
        String percentText = txtDiscountPercent.getText();
        String eligibleItems = txtEligibleItems.getText();
        String duration = txtDuration.getText();
        String audience = txtTargetAudience.getText();

        if (promoCode.isEmpty() || discountType.isEmpty() || percentText.isEmpty() ||
                eligibleItems.isEmpty() || duration.isEmpty() || audience.isEmpty()) {
            lblMessage.setText("❌ Please fill out all fields.");
            return;
        }

        try {
            double percent = Double.parseDouble(percentText);

            if (percent > 50.0) {
                lblMessage.setText("❌ Discount cannot exceed 50%.");
                return;
            }

            MarketingPromotionCampaign campaign = new MarketingPromotionCampaign(
                    promoCode, discountType, percent, eligibleItems, duration, audience
            );


            lblMessage.setText("✅ Campaign '" + promoCode + "' launched successfully!");

        } catch (NumberFormatException e) {
            lblMessage.setText("❌ Discount percent must be a valid number.");
        }
    }
}
