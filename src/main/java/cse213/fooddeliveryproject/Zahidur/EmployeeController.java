package cse213.fooddeliveryproject.Zahidur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class EmployeeController {

    @FXML
    private TableColumn<Employee,String> emailColumnField;

    @FXML
    private TextField emailField;

    @FXML
    private TableColumn<Employee,String> employeeIdColumnField;

    @FXML
    private TextField employeeIdField;

    @FXML
    private TableView<String> employeeTableField;

    @FXML
    private TableColumn<Employee,String> hireColumnField;

    @FXML
    private DatePicker hireDateField;

    @FXML
    private TableColumn<Employee,String> nameColumnField;

    @FXML
    private TextField nameField;

    @FXML
    private TableColumn<Employee,String> payrollColumnField;

    @FXML
    private TextField payrollField;

    @FXML
    private TableColumn<Employee,String> phoneColumnField;

    @FXML
    private TextField phoneField;

    @FXML
    private TableColumn<Employee,String> positionColumnField;

    @FXML
    private TextField positionField;

    @FXML
    private TableColumn<Employee,String> ratingColumnField;

    @FXML
    private TextField ratingField;

    @FXML
    private TableColumn<Employee,String> salaryColumnField;

    @FXML
    private TextField salaryField;

    @FXML
    void addEmployeeeButton(ActionEvent event) {

    }

}
