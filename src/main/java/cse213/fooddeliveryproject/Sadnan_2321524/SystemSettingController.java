package cse213.fooddeliveryproject.Sadnan_2321524;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class SystemSettingController {

    @FXML private CheckBox paymentCheckbox;
    @FXML private TextField deliveryFeeField;
    @FXML private TextField hoursField;
    @FXML private Button saveSettingsBtn;
    @FXML private Label statusLabel;

    private boolean paymentEnabled = true;
    private double deliveryFee = 5.0;
    private String operationalHours = "9AM - 9PM";

    @FXML
    public void initialize() {
        // Load initial values
        paymentCheckbox.setSelected(paymentEnabled);
        deliveryFeeField.setText(String.valueOf(deliveryFee));
        hoursField.setText(operationalHours);
    }

    @FXML
    void handleSaveSettings() {
        try {
            paymentEnabled = paymentCheckbox.isSelected();
            deliveryFee = Double.parseDouble(deliveryFeeField.getText());
            operationalHours = hoursField.getText();

            // Here you would typically update your database or config file

            statusLabel.setText("Settings saved successfully.");
        } catch (NumberFormatException e) {
            statusLabel.setText("Invalid delivery fee.");
            statusLabel.setStyle("-fx-text-fill: red;");
        }
    }
}
