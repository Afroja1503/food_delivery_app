package fooddelivery.fooddeliveryapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class AvailabilityController {

    @FXML
    private TextField txtOpeningTime;
    @FXML
    private TextField txtClosingTime;
    @FXML
    private CheckBox chkOpen;
    @FXML
    private Label lblStatus;
    @FXML
    private Label lblMessage;

    private Availability currentAvailability;

    @FXML
    public void initialize() {
        currentAvailability = new Availability("09:00", "22:00", true);

        txtOpeningTime.setText(currentAvailability.getOpeningTime());
        txtClosingTime.setText(currentAvailability.getClosingTime());
        chkOpen.setSelected(currentAvailability.isOpen());

        updateStatusLabel();
    }

    @FXML
    public void handleUpdateAvailability(ActionEvent actionEvent) {
        String openTime = txtOpeningTime.getText();
        String closeTime = txtClosingTime.getText();
        boolean openCheck = chkOpen.isSelected();

        boolean emptyField = openTime.isEmpty() || closeTime.isEmpty();

        if (emptyField) {
            lblMessage.setText("Please fill both opening and closing times.");
            lblMessage.setStyle("-fx-text-fill: red;");
        }
        else {
            boolean timeInvalid = openTime.compareTo(closeTime) >= 0;

            if (timeInvalid) {
                lblMessage.setText("Opening time must be before closing time.");
                lblMessage.setStyle("-fx-text-fill: red;");
            }
            else {
                currentAvailability.setOpeningTime(openTime);
                currentAvailability.setClosingTime(closeTime);
                currentAvailability.setOpen(openCheck);

                updateStatusLabel();
                lblMessage.setText("Availability updated successfully.");
                lblMessage.setStyle("-fx-text-fill: green;");
            }
        }
    }

    private void updateStatusLabel() {
        if (currentAvailability.isOpen()) {
            lblStatus.setText("Restaurant is OPEN");
            lblStatus.setStyle("-fx-text-fill: green;");
        } else {
            lblStatus.setText("Restaurant is CLOSED");
            lblStatus.setStyle("-fx-text-fill: red;");
        }
    }
}
