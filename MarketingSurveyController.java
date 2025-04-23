package fooddelivery.fooddeliveryapp;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MarketingSurveyController {

    @FXML private TextField txtFormat;
    @FXML private TextField txtQuestion;
    @FXML private TextField txtTargetGroup;
    @FXML private Label lblSurveyMessage;

    @FXML
    public void handleLaunchSurvey(ActionEvent event) {
        String format = txtFormat.getText();
        String question = txtQuestion.getText();
        String audience = txtTargetGroup.getText();

        if (format.isEmpty() || question.isEmpty() || audience.isEmpty()) {
            lblSurveyMessage.setText("❌ All fields required.");
            return;
        }

        MarketingSurvey survey = new MarketingSurvey(format, question, audience);
        lblSurveyMessage.setText("✅ Survey launched for: " + audience);
    }
}
