package cse213.Afroja.ControllerClass.cse213.Afroja;
import cse213.Afroja.AppendableObjectOutputStream;
import cse213.Afroja.UserNonUser.Order;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class UpdateOrderStatusViewController {
    @FXML
    private ComboBox<String> chooseNewStatusComboBox;

    @FXML
    private ComboBox<String> currentStatusComboBox;

    @FXML
    private DatePicker dateOfUpdatedStatusDatePicker;

    @FXML
    private TextField orderIdTextField;

    @FXML
    private Label updatedStatusInformationLabel;
    ArrayList<Order> updatedOrderStatusArrayList ;
    ArrayList<Order> orderList ;

    @FXML
    public void initialize() {
        chooseNewStatusComboBox.getItems().addAll("Delivered","Cancelled","Preparing","Out for Delivery");
        currentStatusComboBox.getItems().addAll("Pending","Delivered","Cancelled","Preparing","Out for Delivery");
        ArrayList<Order> updatedOrderStatusArrayList = new ArrayList<>();
        ArrayList<Order> orderList = new ArrayList<>();
        dateOfUpdatedStatusDatePicker.setValue(LocalDate.now());



    }

    @FXML
    void addToArryListForUpdatedOrderStatusOnActionButton(ActionEvent event) {
        if (orderIdTextField.getText().isEmpty() || currentStatusComboBox.getValue() == null
        || chooseNewStatusComboBox.getValue() == null || dateOfUpdatedStatusDatePicker.getValue() == null ){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill up all field.");
            alert.show();
            return;

        }
        boolean found = false;

        for (Order order : orderList) {
            if (order.getOrderId().equals(orderIdTextField.getText())) {
                order.setStatus(chooseNewStatusComboBox.getValue());
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setContentText("Order status updated successfully to: " + chooseNewStatusComboBox.getValue());
                alert.show();
                found = true;
                break;
            }
        }

        if (!found) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Invalid Order Id.");
            alert.show();
            return;

        }
        Order order = new Order(
                orderIdTextField.getText(),
                currentStatusComboBox.getValue(),
                chooseNewStatusComboBox.getValue(),
                dateOfUpdatedStatusDatePicker.getValue()

        );

    }

    @FXML
    void loadUpdatedStatusOnAction(ActionEvent event) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {

            File f = new File("UpdateOrderStatus.bin");
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
            updatedStatusInformationLabel.setText(" ");

            while (true) {

                Order c = (Order) ois.readObject();
                String oldText = updatedStatusInformationLabel.getText();
                String newText = oldText +
                        "Order Id:" + c.getOrderId() + "," +
                        "Date Of Updated Status:" + c.getDateOfUpdatedStatus() + ',' +
                        "Current Status:" + c.getCurrentStatus() + ',' +
                        "New Status:" + c.getNewStatus();

                updatedStatusInformationLabel.setText(newText);
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
        a.setContentText("Order Status updated successfully");
        a.show();
        return;
    }





    @FXML
    void saveArrayListToBinaryFileForUpdatedOrderStatusOnActionButton(ActionEvent event, Order[] updatedOrderStatusArrayList) {
        try {
            File f = new File("UpdateOrderStatus.bin");
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            for (Order c : updatedOrderStatusArrayList) {
                oos.writeObject(c);
            }
            oos.close();
        } catch (Exception e) {

            //
        }
    }
}


