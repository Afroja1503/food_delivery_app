package cse213.Afroja.ControllerClass.cse213.Afroja;
import cse213.Afroja.UserNonUser.Customer;
import cse213.Afroja.UserNonUser.Order;
import cse213.Afroja.UserNonUser.OrderHistory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class ViewOrderHistoryOfACustomerController {
    @FXML
    private TextField customerIdTextField;


    @FXML
    private TableColumn<Order, String> deliveryAddressTableColumn;

    @FXML
    private TableColumn<Order, String> foodItemTableColumn;

    @FXML
    private TableColumn<Order,String> orderIdTableColumn;
    @FXML
    private TableColumn<Order,String> orderDateTableColumn;

    @FXML
    private TableView<Order> orderHistoryOfCustomerTableView;

    @FXML
    private TableColumn<Order,String> orderStatusTableColumn;

    @FXML
    private TableColumn<Order,String> paymentMethodTableColumn;

    @FXML
    private TableColumn<Order,String> priceTableColumn;

    @FXML
    private TableColumn<Order,String> quantityTableColumn;
    ArrayList<Customer> customerList;
    public void initialize(){
        ArrayList<Customer> customerList = new ArrayList<>();


        orderIdTableColumn.setCellValueFactory(new PropertyValueFactory<Order,String>("orderId"));
        orderDateTableColumn.setCellValueFactory(new PropertyValueFactory<Order,String>("orderDate"));
        foodItemTableColumn.setCellValueFactory(new PropertyValueFactory<Order,String>("orderItem"));
        quantityTableColumn.setCellValueFactory(new PropertyValueFactory<Order,String>("totalAmount"));
        priceTableColumn.setCellValueFactory(new PropertyValueFactory<Order,String>("price"));
        deliveryAddressTableColumn.setCellValueFactory(new PropertyValueFactory<Order,String>("deliveryAddress"));
        paymentMethodTableColumn.setCellValueFactory(new PropertyValueFactory<Order,String>("paymentMethod"));
        orderStatusTableColumn.setCellValueFactory(new PropertyValueFactory<Order,String>("status"));
    }

    @FXML
    void loadOrderHistoryOfACustomerOnActionButton(ActionEvent event) {
        boolean customerExists = false;

        for (Customer c : customerList) {
            if (c.getCustomerId().equals(customerIdTextField.getText())) {
                customerExists = true;
                break;
            }
        }

        if (!customerExists) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Invalid Customer Id");
            alert.show();
            return;
        }

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {

            File f = new File("OrderHistory.bin");
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
                OrderHistory orderHistory = (OrderHistory) ois.readObject();
                Order order = orderHistory.getPastOrder();
                orderHistoryOfCustomerTableView.getItems().add(order);
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

    }

}


