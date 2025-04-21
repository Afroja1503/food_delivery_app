package cse213.Afroja.ControllerClass.cse213.Afroja;
import cse213.Afroja.AppendableObjectOutputStream;
import cse213.Afroja.UserNonUser.Customer;
import cse213.Afroja.UserNonUser.Profile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public  class MyProflieViewController {


        @FXML
        private Label profileInformationLabel;

        @FXML
        private TextField addressTextField;

        @FXML
        private TextField customerNameTextField;

        @FXML
        private TextField emailTextField;

        @FXML
        private TextField mobileNumberTextField;

        @FXML
        private TextField newPasswordTextField;

        @FXML
        private Label updatedProfileInformationLabel;
        ArrayList<Profile> UpdatedProfileList;

        @FXML
        public void initialization() {
                ArrayList<Profile> UpdatedProfileList = new ArrayList<>();

        }

        @FXML
        void addUpdatedProfileOnActionButton(ActionEvent event) {

                if (customerNameTextField.getText().isEmpty()
                        || emailTextField.getText().isEmpty()
                        || mobileNumberTextField.getText().isEmpty()
                        || addressTextField.getText().isEmpty()
                        || newPasswordTextField.getText().isEmpty()) {
                        Alert a = new Alert(Alert.AlertType.ERROR);
                        a.setContentText("Fill up properly");
                        a.show();
                        return;

                }
                if (!emailTextField.getText().contains("@") || !emailTextField.getText().endsWith(".com")) {
                        Alert a = new Alert(Alert.AlertType.ERROR);
                        a.setContentText("Invalid email format. Must contain '@' and end with a valid domain like .com.");
                        a.show();
                        return;

                }
                if (!mobileNumberTextField.getText().startsWith("+880") || mobileNumberTextField.getText().length() != 14) {
                        Alert a = new Alert(Alert.AlertType.ERROR);
                        a.setContentText("Mobile number must start with +880 and be 11 digits after that");
                        a.show();
                        return;

                }
                if (newPasswordTextField.getText().length() < 12) {
                        Alert a = new Alert(Alert.AlertType.ERROR);
                        a.setContentText("Password must be at least 12 characters long");
                        a.show();
                        return;

                }

                boolean hasUpper = false, hasLower = false, hasDigit = false;
                for (char ch : newPasswordTextField.getText().toCharArray()) {
                        if (Character.isUpperCase(ch)) hasUpper = true;
                        else if (Character.isLowerCase(ch)) hasLower = true;
                        else if (Character.isDigit(ch)) hasDigit = true;
                }

                if (!hasUpper || !hasLower || !hasDigit) {
                        Alert a = new Alert(Alert.AlertType.ERROR);
                        a.setContentText("Password must contain uppercase, lowercase letters, and numbers");
                        a.show();
                        return;

                }

                Profile updatedProfileToBeAdded = new Profile(
                        customerNameTextField.getText(),
                        emailTextField.getText(),
                        mobileNumberTextField.getText(),
                        addressTextField.getText(),
                        newPasswordTextField.getText()


                );
                UpdatedProfileList.add(updatedProfileToBeAdded);
                customerNameTextField.clear();
                emailTextField.clear();
                mobileNumberTextField.clear();
                addressTextField.clear();
                newPasswordTextField.clear();


        }

        @FXML
        public void loadUpdateProfileOnActionButton(ActionEvent event) {
                FileInputStream fis = null;
                ObjectInputStream ois = null;

                try {

                        File f = new File("UpdateProfile.bin");
                        if (f.exists()) {
                                fis = new FileInputStream(f);
                        } else {
                                Alert a = new Alert(Alert.AlertType.ERROR);
                                a.setContentText("File does not Exist");
                                a.show();
                                return;
                        }
                        if (fis != null) {
                                ois = new ObjectInputStream(fis);
                        }
                        updatedProfileInformationLabel.setText(" ");

                        while (true) {
                                Profile p = (Profile) ois.readObject();
                                String oldText = updatedProfileInformationLabel.getText();
                                String newText = oldText +
                                        "Name:" + p.getUserName() + "," +
                                        "Email:" + p.getEmail() + ',' +
                                        "PhoneNumber:" + p.getPhoneNumber() + ',' +
                                        "Address:" + p.getAddress() + "," +
                                        "New Password:" + p.getNewPassword() + ".";

                                profileInformationLabel.setText(newText);


                        }


                } catch (Exception e) {
                        try {

                                if (ois != null) {
                                        ois.close();
                                }
                        } catch (Exception e2) {

                        }


                }
                Alert a = new Alert(Alert.AlertType.CONFIRMATION);
                a.setContentText("Profile Updated Successfully");
                a.show();
                return;

        }

        @FXML

        public void saveArrayListToBinaryFileForUpdatedProfile(ActionEvent event) {


                try {
                        File f = new File("UpdatedProfile.bin");
                        FileOutputStream fos = null;
                        ObjectOutputStream oos = null;
                        if (f.exists()) {
                                fos = new FileOutputStream(f, true);
                                oos = new AppendableObjectOutputStream(fos);

                        } else {
                                fos = new FileOutputStream(f);
                                oos = new ObjectOutputStream(fos);
                        }
                        for (Profile c : UpdatedProfileList) {
                                oos.writeObject(c);
                        }
                        oos.close();
                } catch (Exception e) {
                        //


                }


        }

        @FXML
        public void showProfileInformationOnActionButton(ActionEvent event1) {
                FileInputStream fis1 = null;
                ObjectInputStream ois1 = null;
                try {

                        File f = new File("CustomerProfile.bin");
                        if (f.exists()) {
                                fis1 = new FileInputStream(f);
                        } else {
                                Alert a = new Alert(Alert.AlertType.ERROR);
                                a.setContentText("File does not Exist");
                                a.show();
                                return;
                        }
                        if (fis1 != null) {
                                ois1 = new ObjectInputStream(fis1);
                        }
                        profileInformationLabel.setText(" ");

                        while (true) {
                                Customer customer = (Customer) ois1.readObject();
                                String oldText = profileInformationLabel.getText();
                                String newText = oldText +
                                        "Name: " + customer.getCustomerId() + "\n" +
                                        "Email: " + customer.getEmail() + "\n" +
                                        "Phone: " + customer.getPhoneNumber() + "\n\n";

                                profileInformationLabel.setText(newText);


                        }


                }
                catch (Exception e) {
                        try {

                                if (ois1 != null) {
                                        ois1.close();
                                }
                        } catch (Exception e2) {

                        }

                }


        }
}





