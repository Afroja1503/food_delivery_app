package cse213.fooddeliveryproject.Sadnan_2321524;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.Node;

import java.io.IOException;

public class SystemSettingController {

    @FXML private CheckBox paymentCheckbox;
    @FXML private TextField deliveryFeeField;
    @FXML private TextField hoursField;
    @FXML private Button saveSettingsBtn;
    @FXML private Button backButton;
    @FXML private Label statusLabel;

    private boolean paymentEnabled = true;
    private double deliveryFee = 5.0;
    private String operationalHours = "9AM - 9PM";

    @FXML
    public void initialize() {
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


            statusLabel.setText("Settings saved successfully.");
            statusLabel.setStyle("-fx-text-fill: green;");
        } catch (NumberFormatException e) {
            statusLabel.setText("Invalid delivery fee.");
            statusLabel.setStyle("-fx-text-fill: red;");
        }
    }

    @FXML
    void handleBackAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/fooddeliveryproject/AdminDashboard.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Admin Dashboard");
            stage.show();
        } catch (IOException e) {
            statusLabel.setText("Failed to load Admin Dashboard.");
            statusLabel.setStyle("-fx-text-fill: red;");
            e.printStackTrace();
        }
    }
}
