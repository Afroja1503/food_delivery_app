package cse213.fooddeliveryproject.Zahidur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class OrderController {

    @FXML
    private TableColumn<?, ?> customerIdField;

    @FXML
    private TableColumn<?, ?> orderIdColumnField;

    @FXML
    private TextField orderIdField;

    @FXML
    private TableView<?> orderTableField;

    @FXML
    private TableColumn<?, ?> orderTimeColumnField;

    @FXML
    private TextField orderTimeField;

    @FXML
    private TableColumn<?, ?> priceColumnField;

    @FXML
    private TextField priceField;

    @FXML
    private TableColumn<?, ?> restaurantIdField;

    @FXML
    private TableColumn<?, ?> statusColumnField;

    @FXML
    private ComboBox<?> statusComboBox;

    @FXML
    void addOrderButton(ActionEvent event) {

    }

}
