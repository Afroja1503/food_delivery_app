package fooddelivery.fooddeliveryapp;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MarketingPartnershipController {

    @FXML private TextField txtRestaurantName;
    @FXML private TextField txtDealType;
    @FXML private TextArea txtDealDetails;
    @FXML private TextField txtDuration;
    @FXML private Label lblPartnerMessage;

    @FXML
    public void handleSendDeal(ActionEvent event) {
        String name = txtRestaurantName.getText();
        String type = txtDealType.getText();
        String details = txtDealDetails.getText();
        String duration = txtDuration.getText();

        if (name.isEmpty() || type.isEmpty() || details.isEmpty() || duration.isEmpty()) {
            lblPartnerMessage.setText("❌ Fill in all fields.");
            return;
        }

        MarketingPartnerDeal deal = new MarketingPartnerDeal(name, type, details, duration);
        lblPartnerMessage.setText("✅ Proposal sent to: " + name + ". Waiting for confirmation.");
    }
}
