package cse213.Afroja.ControllerClass.cse213.Afroja;
import cse213.Afroja.AppendableObjectOutputStream;
import cse213.Afroja.UserNonUser.Cart;
import cse213.Afroja.UserNonUser.Order;
import cse213.Afroja.UserNonUser.OrderItem;
import cse213.Afroja.UserNonUser.PaymentMethod;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.*;
import java.util.ArrayList;


public class PlaceAnOrderViewController {
    @FXML
    private Label showingCartDataLabel;
    @FXML
    private DatePicker orderDateDatePicker;
    @FXML
    private TextField orderIdTextField;
    @FXML
    private TextField deliveryAddressTextField;

    @FXML
    private Label orderDetailsLabel;

    @FXML
    private ComboBox<String> paymentMethodComboBox;
    ArrayList<Order> orderArrayList ;
    ArrayList<Cart> cartItemList;
    ArrayList<OrderItem> lOrderItemArrayList ;


    @FXML
    public void initialize() {
        ArrayList<Order> orderArrayList = new ArrayList<>();
        ArrayList<Cart> cartItemList = new ArrayList<>();
        ArrayList<OrderItem> lOrderItemArrayList = new ArrayList<>() ;


        paymentMethodComboBox.getItems().addAll("Debit Card","Credit Card","Cash");


    }



    @FXML
    void addToAarryListOrderInfoOnActionButton(ActionEvent event) {
        if (cartItemList == null || cartItemList.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Your cart is empty.");
            alert.show();
            return;
        }
        if (deliveryAddressTextField.getText().isEmpty() || deliveryAddressTextField.getText().length() < 5) {
            Alert alert = new Alert(Alert.AlertType.ERROR);

            alert.setContentText("Please enter a valid delivery address.");
            alert.show();
            return;
        }
        if (paymentMethodComboBox.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Invalid Payment\",\n" +
                    "                    \"Please enter valid payment information");
            alert.show();
            return;

        }
        if (deliveryAddressTextField.getText().length() < 5 || deliveryAddressTextField.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter a valid delivery address address length will be minimum 5 .");
            alert.show();
            return;

        }

        for (Order o : orderArrayList) {
            if (o.getOrderId() == orderIdTextField.getText()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Order ID already exists");
                alert.show();
            }
        }


        Order odd = new Order(
                    orderIdTextField.getText(),
                    orderDateDatePicker.getValue(),
                    paymentMethodComboBox.getValue(),
                    deliveryAddressTextField.getText()
            );


            orderArrayList.add(odd);
            orderIdTextField.clear();
            orderDateDatePicker.setValue(null);
            paymentMethodComboBox.setValue(null);
            deliveryAddressTextField.clear();



    }


    @FXML
    void loadCartDataOnActionButton(ActionEvent event) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {

            File f = new File("Cart.bin");
            if (f.exists()) {
                fis = new FileInputStream(f);
            }
            else {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("File does not Exist");
                a.show();
                return;
            }
            if (fis != null) {
                ois = new ObjectInputStream(fis);
            }
            showingCartDataLabel.setText(" ");

            while (true) {

                Cart c = (Cart) ois.readObject();
                String oldText = showingCartDataLabel.getText();
                String newText = oldText +
                        "Created Date:" + c.getCreationDate() + "," +
                        "Quantity:" + c.getQuantity() + ',' +
                        "Price:" + c.getPrice() + ',' +
                        "FoodItem:" + c.getFoodItem() + "," +
                        "Restaurant:" + c.getRestaurant() + ".";

                showingCartDataLabel.setText(newText);


            }



        }
        catch (Exception e) {
            try {

                if (ois != null) {
                    ois.close();
                }
            }
            catch (Exception e2) {
            }


        }

    }






    @FXML
    void loadPlaceOrderOnAction(ActionEvent event) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {

            File f = new File("Cart.bin");
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
            orderDetailsLabel.setText(" ");

            while (true) {

                Cart c = (Cart) ois.readObject();
                String oldText = orderDetailsLabel.getText();
                String newText = oldText +
                        "Created Date:" + c.getCreationDate() + "," +
                        "Quantity:" + c.getQuantity() + ',' +
                        "Price:" + c.getPrice() + ',' +
                        "FoodItem:" + c.getFoodItem() + "," +
                        "Restaurant:" + c.getRestaurant() + ".";

                orderDetailsLabel.setText(newText);
            }
        } catch (Exception e) {
            try {

                if (ois != null) {
                    ois.close();
                }
            } catch (Exception e2) {
            }
        }
        FileInputStream fis1 = null;
        ObjectInputStream ois1 = null;

        try {

            File f1 = new File("Order.bin");
            if (f1.exists()) {
                fis1 = new FileInputStream(f1);
            } else {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("File does not Exist");
                a.show();
                return;
            }
            if (fis1 != null) {
                ois1 = new ObjectInputStream(fis1);
            }
            orderDetailsLabel.setText(" ");

            while (true) {

                Order o = (Order) ois.readObject();
                String oldText = orderDetailsLabel.getText();
                String newText = oldText +
                        "Delivery Address:" + o.getDeliveryAddress() + "," +
                        "Order Id:" + o.getOrderId() + ',' +
                        "Payment Method:" + o.getPaymentMethod() + ',' +
                        "Order Date:" + o.getPaymentMethod() ;

                orderDetailsLabel.setText(newText);
            }
        } catch (Exception e) {
            try {

                if (ois != null) {
                    ois.close();
                }
            } catch (Exception e2) {
                //
            }

        }
        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setContentText("Order Placed successfully");
        a.show();

    }

    @FXML
    void saveArrayListToBinaryFileForOrder(ActionEvent event) {
        try {
            File f = new File("Order.bin");
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            for (Order c : orderArrayList) {
                oos.writeObject(c);
            }
            oos.close();
        } catch (Exception e) {
            //


        }

    }
}







