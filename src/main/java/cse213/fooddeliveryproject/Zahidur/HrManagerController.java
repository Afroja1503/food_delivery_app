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
    private TableColumn<HrManager, String> emailColumnField;

    @FXML
    private TextField emailField;

    @FXML
    private TableColumn<HrManager, String> hrIdColumnField;

    @FXML
    private TextField hrIdField;

    @FXML
    private TableView<String> hrTableField;

    @FXML
    private DatePicker joinDateField;

    @FXML
    private TableColumn<HrManager, String> joindateColumnField;

    @FXML
    private TableColumn<HrManager, String> nameColumnField;

    @FXML
    private TextField nameField;

    @FXML
    private TableColumn<HrManager, String> phoneColumnField;

    @FXML
    private TextField phoneField;

    @FXML
    private TableColumn<HrManager, String> positionColumnField;

    @FXML
    private TextField positionField;

    @FXML
    private TableColumn<HrManager, String> salaryColumnField;

    @FXML
    private TextField salaryField;

    @FXML
    private TextArea validationField;

    @FXML
    void addHrButtonField(ActionEvent event) {

    }

}
