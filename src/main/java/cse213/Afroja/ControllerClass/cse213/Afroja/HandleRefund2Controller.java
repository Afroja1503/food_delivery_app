package cse213.Afroja.ControllerClass.cse213.Afroja;
import cse213.Afroja.AppendableObjectOutputStream;
import cse213.Afroja.UserNonUser.Refund;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class HandleRefund2Controller {
    @FXML
    private TextField refundAmountTextField;

    @FXML
    private ComboBox<String> selectPaymentMethodComboBox;
    ArrayList<Refund>RefundArrayList;

    @FXML
    void initialize() {
        ArrayList<Refund>RefundArrayList=new ArrayList<>();

        selectPaymentMethodComboBox.getItems().addAll("Cash","Debit Card","Credit Card","Mobile Banking");
    }


    @FXML
    void refundRequestOnActionButton(ActionEvent event, Object paymentMethod) {
        if (selectPaymentMethodComboBox.getValue() == null || refundAmountTextField.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Your refund policy is not applicable");
            alert.show();
            return;
        }
        try {
            double refundAmount = Double.parseDouble(refundAmountTextField.getText());
            if (refundAmount <= 0) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Refund amount must be greater than 0.");
                alert.show();
                return;
            }

            boolean success = processRefund(selectPaymentMethodComboBox.getValue(), Double.parseDouble(refundAmountTextField.getText()));

            if (success) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Refund is successfully initiated in the system");
                alert.show();
                return;

            }
            else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Refund Failed.Retry or escalate to billing team");
                alert.show();
                return;

            }
        }
        catch (Exception e){
            //
        }





        Refund rf = new Refund(
                selectPaymentMethodComboBox.getValue(),
                refundAmountTextField.getText()
        );
        RefundArrayList.add(rf);
        selectPaymentMethodComboBox.setValue(null);
        refundAmountTextField.setText(null);


        try {
            File f = new File("RefundProcess.bin");
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            for (Refund c : RefundArrayList) {
                oos.writeObject(c);
            }
            oos.close();
        } catch (Exception e) {
            //
        }
    }

    private boolean processRefund(String paymentMethod, double amounting ) {
        return true;
    }


}


