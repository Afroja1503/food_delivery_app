package cse213.fooddeliveryproject.Zahidur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class DeliveryReportController {

    @FXML
    private TableColumn<DeliveryReport,String > deliverPersonIdColumnFiled;

    @FXML
    private TextField deliveryPersonField;

    @FXML
    private TableView<String> deliveryReportTableColumn;

    @FXML
    private TextField deliveryTimeField;

    @FXML
    private TableColumn<DeliveryReport,String> distanceColumnField;

    @FXML
    private TextField distanceField;

    @FXML
    private TableColumn<DeliveryReport,String> durationColumnField;

    @FXML
    private TextField durationField;

    @FXML
    private TableColumn<DeliveryReport,String> feedbackColumnField;

    @FXML
    private TextField feedbackField;

    @FXML
    private TableColumn<DeliveryReport,String> orderIdColumnField;

    @FXML
    private TextField orderIdField;

    @FXML
    private TableColumn<DeliveryReport,String> ratingColumnField;

    @FXML
    private TextField ratingField;

    @FXML
    private TableColumn<DeliveryReport,String> reportIdColumnField;

    @FXML
    private TextField reportIdField;

    @FXML
    private TableColumn<DeliveryReport,String> statusColumnField;

    @FXML
    private ComboBox<String> statusComboBox;

    @FXML
    private TableColumn<DeliveryReport,String> timeColumnField;

    @FXML
    void addDeliverReportButton(ActionEvent event) {

    }

}
