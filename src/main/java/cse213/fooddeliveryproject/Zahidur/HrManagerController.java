package cse213.fooddeliveryproject.Zahidur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HrManagerController {

    @FXML
    private TableColumn<?, ?> emailColumnField;

    @FXML
    private TextField emailField;

    @FXML
    private TableColumn<?, ?> hrIdColumnField;

    @FXML
    private TextField hrIdField;

    @FXML
    private TableView<?> hrTableField;

    @FXML
    private DatePicker joinDateField;

    @FXML
    private TableColumn<?, ?> joindateColumnField;

    @FXML
    private TableColumn<?, ?> nameColumnField;

    @FXML
    private TextField nameField;

    @FXML
    private TableColumn<?, ?> phoneColumnField;

    @FXML
    private TextField phoneField;

    @FXML
    private TableColumn<?, ?> positionColumnField;

    @FXML
    private TextField positionField;

    @FXML
    private TableColumn<?, ?> salaryColumnField;

    @FXML
    private TextField salaryField;

    @FXML
    private TextArea validationField;

    @FXML
    void addHrButtonField(ActionEvent event) {

    }

}
