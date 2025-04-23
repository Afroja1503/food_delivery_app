package fooddelivery.fooddeliveryapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ProfileController {

    @FXML private TextField txtName;
    @FXML private TextField txtAddress;
    @FXML private TextField txtPhone;
    @FXML private TextField txtHours;
    @FXML private TextField txtCuisine;
    @FXML private TextField txtLogo;
    @FXML private TextArea txtDescription;

    @FXML private Label lblMessage;
    @FXML private Label displayName;
    @FXML private Label displayAddress;
    @FXML private Label displayPhone;
    @FXML private Label displayCuisine;
    @FXML private Label displayHours;
    @FXML private Label displayLogo;
    @FXML private TextArea displayDescription;

    @FXML
    public void handleUpdateProfile(ActionEvent event) {
        String phone = txtPhone.getText();
        boolean phoneInvalid = false;

        if (phone.length() != 11 || !phone.startsWith("01")) {
            phoneInvalid = true;
        } else {
            for (int i = 0; i < phone.length(); i++) {
                if (phone.charAt(i) < '0' || phone.charAt(i) > '9') {
                    phoneInvalid = true;
                    break;
                }
            }
        }

        if (txtName.getText().isEmpty() ||
                txtAddress.getText().isEmpty() ||
                phone.isEmpty() ||
                txtHours.getText().isEmpty() ||
                txtCuisine.getText().isEmpty()) {

            lblMessage.setText("Please fill up all required fields.");
            lblMessage.setStyle("-fx-text-fill: red;");

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Validation Error");
            alert.setContentText("Fields cannot be empty.");
            alert.show();
        }
        else {
            if (phoneInvalid) {
                lblMessage.setText("Phone number must be 11 digits and start with 01.");
                lblMessage.setStyle("-fx-text-fill: red;");

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Invalid Phone");
                alert.setContentText("Phone number format is invalid.");
                alert.show();
            }
            else {
                // Update display section
                displayName.setText("Name: " + txtName.getText());
                displayAddress.setText("Address: " + txtAddress.getText());
                displayPhone.setText("Phone: " + phone);
                displayCuisine.setText("Cuisine: " + txtCuisine.getText());
                displayHours.setText("Hours: " + txtHours.getText());
                displayLogo.setText("Logo: " + txtLogo.getText());
                displayDescription.setText(txtDescription.getText());

                lblMessage.setText("Profile Updated Successfully");
                lblMessage.setStyle("-fx-text-fill: green;");

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Success");
                alert.setContentText("Profile updated successfully.");
                alert.show();
            }
        }
    }
}
