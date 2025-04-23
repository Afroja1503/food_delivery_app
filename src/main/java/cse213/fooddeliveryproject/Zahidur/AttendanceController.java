package cse213.fooddeliveryproject.Zahidur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AttendanceController {

    @FXML
    private RadioButton absentField;

    @FXML
    private TableColumn<Attendance,String> attendanceColumnColumnField;

    @FXML
    private TableColumn<Attendance,String> attendanceIdColumnField;

    @FXML
    private TextField attendanceIdField;

    @FXML
    private TableView<String> attendanceTableField;

    @FXML
    private DatePicker attendancedateField;

    @FXML
    private TextField checkInTimeField;

    @FXML
    private TableColumn<Attendance,String> checkOutColumnField;

    @FXML
    private TextField checkOutTimeField;

    @FXML
    private TableColumn<Attendance,String> checkinTimeColumnField;

    @FXML
    private TableColumn<Attendance,String> employeeIdColumnField;

    @FXML
    private TextField employeeIdField;

    @FXML
    private RadioButton presentField;

    @FXML
    private TableColumn<Attendance,String> statusColumnField;

    @FXML
    void addAttendanceData(ActionEvent event) {

    }

}
