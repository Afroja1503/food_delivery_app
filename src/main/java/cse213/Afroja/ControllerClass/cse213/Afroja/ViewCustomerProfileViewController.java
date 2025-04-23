package cse213.Afroja.ControllerClass.cse213.Afroja;

import cse213.Afroja.HelloApplication;
import cse213.Afroja.UserNonUser.Customer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;


public class ViewCustomerProfileViewController {

    @FXML
    private TextField customerIdTextField;
    ArrayList<Customer>customerArrayList ;
    @FXML
    public void initialize(){
        ArrayList<Customer>customerArrayList = new ArrayList<>() ;


    }

    @FXML
    void loadCustomerProfileOnActionButton(ActionEvent event) {
        if (customerIdTextField.getText().isEmpty() ) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill up the  field.");
            alert.show();
            return;
        }
        if (!customerIdTextField.getText().isEmpty()) {
            if (!customerIdTextField.getText().matches("\\d{8}")) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Invalid Customer ID format. Must be 8 digits.");
                alert.show();
                return;
            }
        }
        boolean customerFound = false;


        for (Customer customer : customerArrayList) {
            if (!customerIdTextField.getText().isEmpty() && customer.getCustomerId().equals(customerIdTextField.getText())) {
                customerFound = true;

                break;

            }
        }

        if (!customerFound) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("No customer found.");
            alert.show();
            return;
        }
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213.Afroja/LoadCustomerProfile.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Load Customer Profile Details");
            stage.setScene(scene);
            LoadCustomerProfileController nextController = fxmlLoader.getController();
            nextController.receiveCustomerProfileFromController(customerIdTextField.getText());

            stage.show();
        } catch (Exception e) {
            //;

        }
    }
}





