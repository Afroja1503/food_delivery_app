package cse213.fooddeliveryproject.Zahidur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class RestaurantController {

    @FXML
    private TableColumn<Restaurant, String> addressColumnField;

    @FXML
    private TextField addressField;

    @FXML
    private TextField emailField;

    @FXML
    private TableColumn<Restaurant, String> emailPhoneField;

    @FXML
    private TableColumn<Restaurant, String> menuColumnField;

    @FXML
    private TextField menuField;

    @FXML
    private TextField nameField;

    @FXML
    private TableColumn<Restaurant, String> phoneColumnField;

    @FXML
    private TextField phoneField;

    @FXML
    private TableColumn<Restaurant, String> resaturantColumnField;

    @FXML
    private TableColumn<Restaurant, String> restaurantColumnField;

    @FXML
    private TextField restaurantIdField;

    @FXML
    private TableView<String> restaurantTableField;

    @FXML
    void addRestaurantButton(ActionEvent event) {

    }

}
