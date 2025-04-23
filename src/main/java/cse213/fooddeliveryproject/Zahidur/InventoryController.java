package cse213.fooddeliveryproject.Zahidur;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class InventoryController {

    @FXML
    private Button addInventoryButton;

    @FXML
    private TableColumn<?, ?> customerNameColumnField;

    @FXML
    private TextField customerNameField;

    @FXML
    private TableColumn<?, ?> expireDateColumnField;

    @FXML
    private DatePicker expireDateField;

    @FXML
    private TableView<?> inventoryTableField;

    @FXML
    private TableColumn<?, ?> itemIdColumnField;

    @FXML
    private TextField itemIdField;

    @FXML
    private TableColumn<?, ?> itemNameColumnField;

    @FXML
    private TextField itemNameField;

    @FXML
    private TableColumn<?, ?> quantityColumnField;

    @FXML
    private TextField quantityField;

    @FXML
    private TableColumn<?, ?> statusColumnField;

    @FXML
    private ComboBox<?> statusComboBox;

}
