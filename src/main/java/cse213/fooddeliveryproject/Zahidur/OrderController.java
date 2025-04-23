package cse213.fooddeliveryproject.Zahidur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class OrderController {

    @FXML
    private TableColumn<Order, String> customerIdField;

    @FXML
    private TableColumn<Order, String> orderIdColumnField;

    @FXML
    private TextField orderIdField;

    @FXML
    private TableView<String> orderTableField;

    @FXML
    private TableColumn<Order, String> orderTimeColumnField;

    @FXML
    private TextField orderTimeField;

    @FXML
    private TableColumn<Order, String> priceColumnField;

    @FXML
    private TextField priceField;

    @FXML
    private TableColumn<Order, String> restaurantIdField;

    @FXML
    private TableColumn<Order, String> statusColumnField;

    @FXML
    private ComboBox<String> statusComboBox;

    @FXML
    void addOrderButton(ActionEvent event) {

    }

}
