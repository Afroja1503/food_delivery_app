package cse213.fooddeliveryproject.Zahidur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class RestaurantController {

    @FXML
    private TableColumn<?, ?> addressColumnField;

    @FXML
    private TextField addressField;

    @FXML
    private TextField emailField;

    @FXML
    private TableColumn<?, ?> emailPhoneField;

    @FXML
    private TableColumn<?, ?> menuColumnField;

    @FXML
    private TextField menuField;

    @FXML
    private TextField nameField;

    @FXML
    private TableColumn<?, ?> phoneColumnField;

    @FXML
    private TextField phoneField;

    @FXML
    private TableColumn<?, ?> resaturantColumnField;

    @FXML
    private TableColumn<?, ?> restaurantColumnField;

    @FXML
    private TextField restaurantIdField;

    @FXML
    private TableView<?> restaurantTableField;

    @FXML
    void addRestaurantButton(ActionEvent event) {

    }

}
