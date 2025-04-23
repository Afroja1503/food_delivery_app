package cse213.Afroja.ControllerClass.cse213.Afroja;
import cse213.Afroja.UserNonUser.Customer;
import cse213.Afroja.UserNonUser.Issue;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LoadCustomerProfileController {

    @FXML
    private Label customerIdLabel;

    @FXML
    private Label dateOfBirthLabel;

    @FXML
    private Label emailLabel;

    @FXML
    private Label phoneNumberLabel;

    @FXML
    private Label registrationDateLabel;

    public void receiveCustomerProfileFromController(String customerId){
        customerIdLabel.setText(customerId);
        Customer c = getCustomerProfileFromBinaryFile(customerId);
        customerIdLabel.setText(c.getCustomerId());
        emailLabel.setText(c.getEmail());
        phoneNumberLabel.setText(c.getPhoneNumber());
        dateOfBirthLabel.setText(c.getDateOfBirth().toString());
        registrationDateLabel.setText(c.getRegistrationDate().toString());

    }
    public Customer getCustomerProfileFromBinaryFile(String customerId){
        ArrayList<Customer> profileList = new ArrayList<>();

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            File f = new File("CustomerProfile.bin");
            if (f.exists()) {
                fis = new FileInputStream(f);
            }
            else {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("File does not Exist");
                a.show();
                return null;
            }
            if (fis != null) {
                ois = new ObjectInputStream(fis);
            }

        }
        catch (Exception e) {
            try {

                if (ois != null) {
                    ois.close();
                }

            } catch (Exception e2) {
            }
        }
        Customer profileToFound = null;
        for (Customer c : profileList) {
            if(c.getCustomerId().equals(customerId)) {
                profileToFound = c;

            }
        }
        return profileToFound;
    }


}





