package fooddelivery.fooddeliveryapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class ComplaintController {

    @FXML
    private TableView<Complaint> complaintTable;
    @FXML
    private TableColumn<Complaint, Integer> idCol;
    @FXML
    private TableColumn<Complaint, String> customerCol;
    @FXML
    private TableColumn<Complaint, String> contentCol;
    @FXML
    private TextArea complaintDetailsArea;
    @FXML
    private TextArea responseArea;
    @FXML
    private Label lblMessage;

    private final ArrayList<Complaint> complaintList = new ArrayList<>();

    @FXML
    public void initialize() {
        idCol.setCellValueFactory(new PropertyValueFactory<>("complaintId"));
        customerCol.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        contentCol.setCellValueFactory(new PropertyValueFactory<>("content"));

        // Add some dummy data
        complaintList.add(new Complaint(1, "Afroza", "Food was cold."));
        complaintList.add(new Complaint(2, "Shammi", "Late delivery."));

        updateComplaintTable();
    }

    private void updateComplaintTable() {
        complaintTable.getItems().clear();
        complaintTable.getItems().addAll(complaintList);
    }

    @FXML
    public void handleShowComplaintDetails(ActionEvent event) {
        Complaint selected = complaintTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            complaintDetailsArea.setText(selected.getContent());
            responseArea.setText(selected.getResponse() != null ? selected.getResponse() : "");
        } else {
            lblMessage.setText("Please select a complaint first.");
        }
    }

    @FXML
    public void handleSubmitResponse(ActionEvent actionEvent) {
        Complaint selected = complaintTable.getSelectionModel().getSelectedItem();
        if (selected == null) {
            lblMessage.setText("Please select a complaint first.");
            return;
        }

        String response = responseArea.getText().trim();
        if (response.isEmpty()) {
            lblMessage.setText("Please write a response.");
            return;
        }

        selected.setResponse(response);
        selected.setResolved(true);
        updateComplaintTable();
        lblMessage.setText("Response saved and customer notified.");
    }
}

