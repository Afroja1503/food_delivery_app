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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BackupController {

    @FXML private Button startBackupBtn;
    @FXML private ComboBox<String> scheduleCombo;
    @FXML private Button setScheduleBtn;
    @FXML private ListView<String> backupHistoryList;
    @FXML private Label statusLabel;

    @FXML
    public void initialize() {
        scheduleCombo.getItems().addAll("Every Hour", "Daily", "Weekly");
        scheduleCombo.setValue("Daily");
        backupHistoryList.getItems().add("[2025-04-18 09:00] Daily Backup Completed");
    }

    @FXML
    void handleManualBackup() {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        backupHistoryList.getItems().add("[" + timestamp + "] Manual Backup Completed");
        statusLabel.setText("Manual backup successful at " + timestamp);
    }

    @FXML
    void handleSetSchedule() {
        String selected = scheduleCombo.getValue();
        statusLabel.setText("Backup schedule set to: " + selected);
    }
    @FXML
    void handleBackAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/fooddeliveryproject/AdminDashboard.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Backup");
            stage.show();
        } catch (IOException e) {
            statusLabel.setText("Failed to load Backup.");
            e.printStackTrace();
        }
    }
}
