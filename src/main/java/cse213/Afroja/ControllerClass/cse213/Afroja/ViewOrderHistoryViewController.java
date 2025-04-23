package cse213.Afroja.ControllerClass.cse213.Afroja;
import cse213.Afroja.AppendableObjectOutputStream;
import cse213.Afroja.UserNonUser.Cart;
import cse213.Afroja.UserNonUser.Order;
import cse213.Afroja.UserNonUser.OrderHistory;
import cse213.Afroja.UserNonUser.OrderStatus;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;


public class ViewOrderHistoryViewController {
    @FXML
    private DatePicker dateFromTextField;

    @FXML
    private DatePicker dateToTextField;

    @FXML
    private TableColumn<Order, String> deliveryAddressTableColumn;

    @FXML
    private TableColumn<Order, String> foodItemTableColumn;

    @FXML
    private TableColumn<Order, String> orderDateTableView;

    @FXML
    private TableView<OrderHistory> orderHistoryTableView;

    @FXML
    private TableColumn<Order, String> orderIdTableColumn;

    @FXML
    private ComboBox<String> orderStatusComboBox;

    @FXML
    private TableColumn<Order, String> orderStatusTableColumn;

    @FXML
    private TableColumn<Order, String> paymentMethodTableColumn;

    @FXML
    private TableColumn<Order, String> priceTableColumn;

    @FXML
    private TableColumn<Order,String> quantityTableColumn;

    @FXML
    private TableColumn<Order, String> restaurantTableColumn;
    ArrayList<OrderHistory> orderHistoryArrayList;
    ArrayList<Order> deliveredOrders ;
    @FXML
    public void initialize(){
        ArrayList<OrderHistory> orderHistoryArrayList = new ArrayList<>();
        orderStatusComboBox.getItems().addAll("All","Delivered","Cancelled");
        dateToTextField.setValue(LocalDate.now());
        ArrayList<OrderHistory> deliveredOrders = new ArrayList<>();
        orderIdTableColumn.setCellValueFactory(new PropertyValueFactory<Order,String>("orderId"));
        orderDateTableView.setCellValueFactory(new PropertyValueFactory<Order,String>("creationDate"));
        foodItemTableColumn.setCellValueFactory(new PropertyValueFactory<Order,String>("foodItem"));
        priceTableColumn.setCellValueFactory(new PropertyValueFactory<Order,String>("price"));
        orderStatusTableColumn.setCellValueFactory(new PropertyValueFactory<Order,String>("orderStatus"));
        restaurantTableColumn.setCellValueFactory(new PropertyValueFactory<Order,String>("restaurant"));
        quantityTableColumn.setCellValueFactory(new PropertyValueFactory<Order,String>("quantity"));
        deliveryAddressTableColumn.setCellValueFactory(new PropertyValueFactory<Order,String>("deliveryAddress"));
        paymentMethodTableColumn.setCellValueFactory(new PropertyValueFactory<Order,String>("paymentMethod"));






    }

    @FXML
    void addToArrayListForOrderHistoryOnActionButton(ActionEvent event) {
        if (dateFromTextField.getValue() == null || dateToTextField.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Invalid Date.Please select both 'Date From' and 'Date To'.");
            a.show();
            return;

        }
        if (!dateToTextField.getValue().isAfter(dateFromTextField.getValue())) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Invalid Range.Date To must be after Date From.");
            a.show();
            return;

        }


        for (Order order : deliveredOrders ) {
            if ("DELIVERED".equalsIgnoreCase(order.getOrderStatus())) {
                deliveredOrders.add(order);
            }
        }

        if (deliveredOrders.isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("No orders found");
            a.show();
            return;

        }


        OrderHistory oh =new OrderHistory(
                orderStatusComboBox.getValue(),
                dateFromTextField.getValue(),
                dateToTextField.getValue()

        );
        orderHistoryArrayList.add(oh);
        orderStatusComboBox.setValue(null);
        dateFromTextField.setValue(null);
        dateToTextField.setValue(null);



    }

    @FXML
    void loadViewOrderHistoryOnActionButton(ActionEvent event) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {

            File f = new File("Order.bin");
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
                OrderHistory order = (OrderHistory) ois.readObject();
                orderHistoryTableView.getItems().add(order);

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
                fis = new FileInputStream(f);
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
                OrderHistory order = (OrderHistory) ois1.readObject();
                orderHistoryTableView.getItems().add(order);

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


    }

    @FXML
    void saveArrayListToBinaryFileForOrderHistoryOnActionButtton(ActionEvent event) {
        try {
            File f = new File("OrderHistory.bin");
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            for (OrderHistory c : orderHistoryArrayList) {
                oos.writeObject(c);
            }
            oos.close();
        } catch (Exception e) {
            //


        }


    }

}



