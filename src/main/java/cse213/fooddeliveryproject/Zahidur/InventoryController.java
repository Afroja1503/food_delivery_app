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
    private TableColumn<Inventory, String> customerNameColumnField;

    @FXML
    private TextField customerNameField;

    @FXML
    private TableColumn<Inventory, String> expireDateColumnField;

    @FXML
    private DatePicker expireDateField;

    @FXML
    private TableView<String> inventoryTableField;

    @FXML
    private TableColumn<Inventory, String> itemIdColumnField;

    @FXML
    private TextField itemIdField;

    @FXML
    private TableColumn<Inventory, String> itemNameColumnField;

    @FXML
    private TextField itemNameField;

    @FXML
    private TableColumn<Inventory, String> quantityColumnField;

    @FXML
    private TextField quantityField;

    @FXML
    private TableColumn<Inventory, String> statusColumnField;

    @FXML
    private ComboBox<String> statusComboBox;

}
