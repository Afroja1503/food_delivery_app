package cse213.fooddeliveryproject.Zahidur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PayrollController {

    @FXML
    private TableColumn<Payroll,String> basicSalaryColumnField;

    @FXML
    private TextField basicSalaryField;

    @FXML
    private TableColumn<Payroll,String> bonusColumnField;

    @FXML
    private TextField bonusField;

    @FXML
    private TextField employIdField;

    @FXML
    private TableColumn<Payroll,String> employeeIdColumnField;

    @FXML
    private TableColumn<Payroll,String> netSalaryColumnField;

    @FXML
    private TextField netSalaryField;

    @FXML
    private TableColumn<Payroll,String> paymentDateColumnField;

    @FXML
    private DatePicker paymentDateField;

    @FXML
    private TableView<String> paymentTableColumn;

    @FXML
    private TableColumn<Payroll,String> payrollIdColumnField;

    @FXML
    private TextField payrollIdField;

    @FXML
    private TableColumn<Payroll,String> taxColumnField;

    @FXML
    private TextField taxField;

    @FXML
    void addPaymentButton(ActionEvent event) {

    }

}
