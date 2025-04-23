package cse213.fooddeliveryproject.Sadnan_2321524;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class ReportController {

    @FXML private ComboBox<String> reportTypeCombo;
    @FXML private DatePicker startDatePicker;
    @FXML private DatePicker endDatePicker;
    @FXML private TextArea reportOutputArea;
    @FXML private Label statusLabel;

    @FXML
    public void initialize() {
        reportTypeCombo.getItems().addAll("Financial", "Performance", "User Activity");
        reportTypeCombo.setValue("Financial");
        startDatePicker.setValue(LocalDate.now().minusDays(7));
        endDatePicker.setValue(LocalDate.now());
    }

    @FXML
    void handleGenerateReport() {
        String type = reportTypeCombo.getValue();
        LocalDate start = startDatePicker.getValue();
        LocalDate end = endDatePicker.getValue();

        if (start.isAfter(end)) {
            statusLabel.setText("Invalid date range");
            return;
        }

        // Simulate report generation
        StringBuilder report = new StringBuilder();
        report.append("Report Type: ").append(type).append("\n");
        report.append("Date Range: ").append(start).append(" to ").append(end).append("\n\n");
        report.append("--- Sample Data ---\n");
        report.append("Entry 1: Success\n");
        report.append("Entry 2: Warning\n");
        report.append("Entry 3: Error\n");

        reportOutputArea.setText(report.toString());
        statusLabel.setText("Report generated successfully.");
    }
    @FXML
    void handleBackAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/fooddeliveryproject/AdminDashboard.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Report");
            stage.show();
        } catch (IOException e) {
            statusLabel.setText("Failed to load Report.");
            e.printStackTrace();
        }
    }
}
