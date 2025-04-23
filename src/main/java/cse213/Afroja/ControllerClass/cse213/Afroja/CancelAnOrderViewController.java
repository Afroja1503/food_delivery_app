package cse213.Afroja.ControllerClass.cse213.Afroja;
import cse213.Afroja.AppendableObjectOutputStream;
import cse213.Afroja.UserNonUser.Cart;
import cse213.Afroja.UserNonUser.Customer;
import cse213.Afroja.UserNonUser.Order;
import cse213.Afroja.UserNonUser.OrderStatus;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.ArrayList;

import static javafx.beans.binding.Bindings.isEmpty;

public class CancelAnOrderViewController {
    @FXML
    private Label cancelOrderLabel;

    @FXML
    private TextField orderIdTextField;

    @FXML
    private TextField reasonForCancellationTextField;
    ArrayList<Order> CancelOrderArrayList;
    ArrayList<Order> orderArrayList;
    ArrayList<Customer> customerArrayList ;
    ArrayList<OrderStatus> orderStatusArrayList ;



    @FXML
    public void initialize() {
        ArrayList<Order> CancelOrderArrayList = new ArrayList<>();
        ArrayList<Order> orderArrayList = new ArrayList<>();
        ArrayList<Customer> customerArrayList = new ArrayList<>();
        ArrayList<OrderStatus> orderStatusArrayList = new ArrayList<>();





    }

    @FXML
    void addToArrayListCancelOrderOnAction(ActionEvent event) {


        if (orderIdTextField.getText().isEmpty() || reasonForCancellationTextField.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill  the fields properly ");
            alert.show();
            return;
        }
        for (Order or : orderArrayList) {
            if (or.getOrderId() != orderIdTextField.getText()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Please enter a valid order ID");
                alert.show();
                return;

            }
        }
        Order orderToCancel = null;
        for (Order order : orderArrayList) {
            if (order.getOrderId().equals(orderIdTextField.getText())) {
                orderToCancel = order;
                break;
            }
        }
        for (Customer customer : customerArrayList) {
            if (!orderToCancel.getOrderId().equals(customer.getCustomerId())) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Permission Denied.You do not have permission to cancel this order.");
                alert.show();
                return;
            }
        }
        for(OrderStatus os:orderStatusArrayList){
            if (os.getOrderStatusName().equals("Out for Delivery" ) || os.getOrderStatusName().equals("Delivered")){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("This order cannot be canceled as it is already out for delivery.");
                alert.show();
                return;
        }




        Order or1 = new Order(
                    orderIdTextField.getText(),
                    reasonForCancellationTextField.getText());

            CancelOrderArrayList.add(or1);
            orderIdTextField.clear();
            reasonForCancellationTextField.clear();


        }
    }
    @FXML
    void loadCancelOrderOnAction (ActionEvent event){
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {

            File f = new File("CancelOrder.bin");
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
            cancelOrderLabel.setText(" ");

            while (true) {

                Order c = (Order) ois.readObject();
                String oldText = cancelOrderLabel.getText();
                String newText = oldText +
                        "Order Id:" + c.getOrderId() + "," +
                        "Reason For Cancellation" + c.getReasonForCancellation();
                cancelOrderLabel.setText(newText);
            }
        } catch (Exception e) {
            try {

                if (ois != null) {
                    ois.close();
                }
            }
            catch (Exception e2) {
            }
        }
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Order Cancelled Successfully");
        alert.show();




    }

    @FXML
    void saveArrayListToBinaryFileForCancelOrderOnActionButton (ActionEvent event){
        try {
            File f = new File("CancelOrder.bin");
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            for (Order c : CancelOrderArrayList) {
                oos.writeObject(c);
            }
            oos.close();
        } catch (Exception e) {
            //


        }
    }



}



