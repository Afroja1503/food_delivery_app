package cse213.fooddeliveryproject.Zahidur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class DeliveryReportController {

    @FXML
    private TableColumn<?, ?> deliverPersonIdColumnFiled;

    @FXML
    private TextField deliveryPersonField;

    @FXML
    private TableView<?> deliveryReportTableColumn;

    @FXML
    private TextField deliveryTimeField;

    @FXML
    private TableColumn<?, ?> distanceColumnField;

    @FXML
    private TextField distanceField;

    @FXML
    private TableColumn<?, ?> durationColumnField;

    @FXML
    private TextField durationField;

    @FXML
    private TableColumn<?, ?> feedbackColumnField;

    @FXML
    private TextField feedbackField;

    @FXML
    private TableColumn<?, ?> orderIdColumnField;

    @FXML
    private TextField orderIdField;

    @FXML
    private TableColumn<?, ?> ratingColumnField;

    @FXML
    private TextField ratingField;

    @FXML
    private TableColumn<?, ?> reportIdColumnField;

    @FXML
    private TextField reportIdField;

    @FXML
    private TableColumn<?, ?> statusColumnField;

    @FXML
    private ComboBox<?> statusComboBox;

    @FXML
    private TableColumn<?, ?> timeColumnField;

    @FXML
    void addDeliverReportButton(ActionEvent event) {

    }

}
