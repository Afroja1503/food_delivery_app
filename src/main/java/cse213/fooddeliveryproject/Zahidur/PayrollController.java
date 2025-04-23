package cse213.fooddeliveryproject.Zahidur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PayrollController {

    @FXML
    private TableColumn<?, ?> basicSalaryColumnField;

    @FXML
    private TextField basicSalaryField;

    @FXML
    private TableColumn<?, ?> bonusColumnField;

    @FXML
    private TextField bonusField;

    @FXML
    private TextField employIdField;

    @FXML
    private TableColumn<?, ?> employeeIdColumnField;

    @FXML
    private TableColumn<?, ?> netSalaryColumnField;

    @FXML
    private TextField netSalaryField;

    @FXML
    private TableColumn<?, ?> paymentDateColumnField;

    @FXML
    private DatePicker paymentDateField;

    @FXML
    private TableView<?> paymentTableColumn;

    @FXML
    private TableColumn<?, ?> payrollIdColumnField;

    @FXML
    private TextField payrollIdField;

    @FXML
    private TableColumn<?, ?> taxColumnField;

    @FXML
    private TextField taxField;

    @FXML
    void addPaymentButton(ActionEvent event) {

    }

}
