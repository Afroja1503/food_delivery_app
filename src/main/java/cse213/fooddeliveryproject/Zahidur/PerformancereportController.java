package cse213.fooddeliveryproject.Zahidur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class PerformancereportController {

    @FXML
    private RadioButton excellentField;

    @FXML
    private TableColumn<PerformanceReport, String> performanceColumnField;

    @FXML
    private TableColumn<PerformanceReport, String> ratingColumnField;

    @FXML
    private TextField ratingField;

    @FXML
    private TableColumn<PerformanceReport, String> reportColumnField;

    @FXML
    private DatePicker reportDateField;

    @FXML
    private TableColumn<PerformanceReport, String> reportIdColumnField;

    @FXML
    private TextField reportIdField;

    @FXML
    private TableColumn<PerformanceReport, String> staffIdColumnField;

    @FXML
    private TextField staffIdField;

    @FXML
    private TableColumn<PerformanceReport, String> staffNameColumnField;

    @FXML
    private TextField staffNameField;

    @FXML
    private RadioButton worstField;

    @FXML
    void addPerformanceData(ActionEvent event) {

    }

    @FXML
    void performanceTableField(ActionEvent event) {

    }

}
