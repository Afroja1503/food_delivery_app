package fooddelivery.fooddeliveryapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MarketingLoyaltyController {

    @FXML private TextField txtRewardType;
    @FXML private TextField txtConditions;
    @FXML private TextField txtExpiry;
    @FXML private Label lblLoyaltyMessage;

    @FXML
    public void handleLoyaltyLaunch(ActionEvent event) {
        String reward = txtRewardType.getText();
        String condition = txtConditions.getText();
        String expiry = txtExpiry.getText();

        if (reward.isEmpty() || condition.isEmpty() || expiry.isEmpty()) {
            lblLoyaltyMessage.setText("❌ Please fill out all fields.");
            return;
        }

        MarketingLoyaltyProgram program = new MarketingLoyaltyProgram(reward, condition, expiry);
        lblLoyaltyMessage.setText("✅ Loyalty program launched with: " + reward);
    }
}
