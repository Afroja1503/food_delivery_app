package cse213.Afroja.ControllerClass.cse213.Afroja;
import cse213.Afroja.AppendableObjectOutputStream;
import cse213.Afroja.HelloApplication;
import cse213.Afroja.UserNonUser.Order;
import cse213.Afroja.UserNonUser.Refund;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class HandleRefundViewController {
    @FXML
    private TextField emailTextField;

    @FXML
    private DatePicker orderDateDatePicker;

    @FXML
    private TextField orderIdTextField;

    @FXML
    private ComboBox<String> paymentMethodComboBox;

    @FXML
    private TextField phoneNumberTextField;

    @FXML
    private ComboBox<String> reasonForReturnComboBox;
    ArrayList <Refund> refundArrayList ;
    ArrayList <Refund> orderList ;

    @FXML
    public void initialize(){
        ArrayList <Refund> refundArrayList = new ArrayList<>();
        ArrayList <Refund> orderList = new ArrayList<>();


        paymentMethodComboBox.getItems().addAll("Cash","Debit Card","Credit Card","Mobile Banking");
        reasonForReturnComboBox.getItems().addAll("Wrong Item","Wrong Address","Wrong Delivery Time","Other","Defective Item","Late Delivery","Order Cancelled");

    }

    @FXML
    void addToArraylistForRefundOnActionButton(ActionEvent event, Order Order) {
        boolean orderFound = false;
        Order matchedOrder = null;

        for (Refund order : orderList) {
            if (order.getOrderId().equals(orderIdTextField.getText())) {
                orderFound = true;
                matchedOrder = Order;
                break;
            }
        }

        if (!orderFound) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Order Id is not found");
            alert.show();
            return;
        }

        LocalDate currentDate = LocalDate.now();
        LocalDate orderDate = matchedOrder.getOrderDate();
        long daysSinceOrder = ChronoUnit.DAYS.between(orderDate, currentDate);

        if (daysSinceOrder > 7 ) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Refund Policy");
            alert.setContentText("Your refund policy is not applicable");
            alert.show();
            return;
        }

        Refund rf = new Refund(
                orderIdTextField.getText(),
                emailTextField.getText()
        );
        refundArrayList.add(rf);
        orderIdTextField.getText().isEmpty();
        emailTextField.getText().isEmpty();
        phoneNumberTextField.getText().isEmpty();
        paymentMethodComboBox.setValue(null) ;
        reasonForReturnComboBox.setValue(null);


    }

    @FXML
    void loadHandleRefundOnActionButton(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213.Afroja/handleRefund2.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setScene(scene);
            nextStage.setTitle("Handle Refund");
            nextStage.show();
        } catch (Exception e) {
            //
        }


    }

    @FXML
    void saveArrayListToBinaryFileForRefundOnActionButton(ActionEvent event) {
        try {
            File f = new File("HandleRefund.bin");
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            for (Refund c : refundArrayList) {
                oos.writeObject(c);
            }
            oos.close();
        } catch (Exception e) {
            //
        }


    }

}


