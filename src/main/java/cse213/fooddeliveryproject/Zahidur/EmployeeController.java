package cse213.fooddeliveryproject.Zahidur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class EmployeeController {

    @FXML
    private TableColumn<?, ?> emailColumnField;

    @FXML
    private TextField emailField;

    @FXML
    private TableColumn<?, ?> employeeIdColumnField;

    @FXML
    private TextField employeeIdField;

    @FXML
    private TableView<?> employeeTableField;

    @FXML
    private TableColumn<?, ?> hireColumnField;

    @FXML
    private DatePicker hireDateField;

    @FXML
    private TableColumn<?, ?> nameColumnField;

    @FXML
    private TextField nameField;

    @FXML
    private TableColumn<?, ?> payrollColumnField;

    @FXML
    private TextField payrollField;

    @FXML
    private TableColumn<?, ?> phoneColumnField;

    @FXML
    private TextField phoneField;

    @FXML
    private TableColumn<?, ?> positionColumnField;

    @FXML
    private TextField positionField;

    @FXML
    private TableColumn<?, ?> ratingColumnField;

    @FXML
    private TextField ratingField;

    @FXML
    private TableColumn<?, ?> salaryColumnField;

    @FXML
    private TextField salaryField;

    @FXML
    void addEmployeeeButton(ActionEvent event) {

    }

}
