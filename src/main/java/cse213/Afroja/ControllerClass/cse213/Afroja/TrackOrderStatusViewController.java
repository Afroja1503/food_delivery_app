package cse213.Afroja.ControllerClass.cse213.Afroja;
import cse213.Afroja.AppendableObjectOutputStream;
import cse213.Afroja.HelloApplication;
import cse213.Afroja.UserNonUser.Cart;
import cse213.Afroja.UserNonUser.Customer;
import cse213.Afroja.UserNonUser.Order;
import cse213.Afroja.UserNonUser.OrderItem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;

public class TrackOrderStatusViewController {
    @FXML
    private TableColumn<Customer, String> customerIdTableColumn;

    @FXML
    private TextField customerIdTextField;



    @FXML
    private TableColumn<Order, String> reataurantIdTableColumn;

    @FXML
    private TextField restaurantIdTextField;

    @FXML
    private TableColumn<OrderItem,String> foodItemTableColumn1;

    @FXML
    private TableColumn<Order, String> orderIdTableColumn;

    @FXML
    private TextField orderIdTextField;

    @FXML
    private TableColumn<Order, String> orderStatusTableView;

    @FXML
    private TableColumn<Cart, String> priceTableColumn;

    @FXML
    private TableColumn<Cart, String> quantityTableColumn;

    @FXML
    private TableView<Order> trackOrderTableView;

    @FXML
    private TableColumn<Order, String> trackingIdTableColumn;

    @FXML
    private TextField trackingIdTextField;
    ArrayList<Order> trackOrderArrayList ;
    ArrayList<Order> OrderList ;

    @FXML
    private void initialize(){
        trackOrderArrayList = new ArrayList<>();
        ArrayList<Order> OrderList = new ArrayList<>();

    }
    @FXML
    void loadOrderStatusOnActionButton(ActionEvent event) {
        try{FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213.Afroja/LoadOrderStatus.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("Order Status View");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
            //
        }



    }


    @FXML
    void addToArrayListToTrackOrderOnActionButton(ActionEvent event) {


        if ( OrderList.isEmpty() ||  OrderList == null) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("No Orders.No recent orders found.");
                alert.show();
                return;
        }
        for (Order order : OrderList) {
            if (order.getCustomerId().equals(customerIdTextField.getText())) {

                Order od = new Order(
                        orderIdTextField.getText(),
                        customerIdTextField.getText(),
                        restaurantIdTextField.getText(),
                        trackingIdTextField.getText()
                );
                trackOrderArrayList.add(od);
                orderIdTextField.clear();
                customerIdTextField.clear();
                restaurantIdTextField.clear();
                trackingIdTextField.clear();
            }
            else{
                if (trackOrderArrayList.isEmpty()) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Order not found or unauthorized. Please check the details");
                    alert.show();
                    return;
                }

            }
        }








    }

    @FXML
    void loadTrackOrderOnActionButton(ActionEvent event) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {

            File f = new File("TrackOrder.bin");
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


            while (true) {
                Order order = (Order) ois.readObject();
                trackOrderTableView.getItems().add(order);

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
        FileInputStream fis1 = null;
        ObjectInputStream ois1 = null;

        try {

            File f = new File("Cart.bin");
            if (f.exists()) {
                fis1 = new FileInputStream(f);
            }
            else {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("File does not Exist");
                a.show();
                return;
            }
            if (fis1 != null) {
                ois1 = new ObjectInputStream(fis1);
            }


            while (true) {
                Order order = (Order) ois1.readObject();
                trackOrderTableView.getItems().add(order);

            }
        } catch (Exception e) {
            try {

                if (ois1 != null) {
                    ois1.close();
                }
            }
            catch (Exception e2) {
            }
        }
        FileInputStream fis2 = null;
        ObjectInputStream ois2 = null;

        try {

            File f = new File("OrderStatus.bin");
            if (f.exists()) {
                fis2 = new FileInputStream(f);
            }
            else {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("File does not Exist");
                a.show();
                return;
            }
            if (fis2 != null) {
                ois2 = new ObjectInputStream(fis2);
            }


            while (true) {
                Order order = (Order) ois2.readObject();
                trackOrderTableView.getItems().add(order);

            }
        } catch (Exception e) {
            try {

                if (ois2 != null) {
                    ois2.close();
                }
            }
            catch (Exception e2) {
                //
            }
        }



    }

    @FXML
    void saveArrayListToBinaryFileForTrackOrderOnActionButton(ActionEvent event) {
        try {
            File f = new File("TrackOrder.bin");
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            for (Order c : trackOrderArrayList) {
                oos.writeObject(c);
            }
            oos.close();
        } catch (Exception e) {
            //


        }


    }

}
