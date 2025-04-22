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
import java.util.Random;

public class HealthController {

    @FXML
    private ProgressBar cpuProgress;
    @FXML
    private ProgressBar memoryProgress;
    @FXML
    private ProgressBar apiErrorProgress;
    @FXML
    private ListView<String> alertList;

    private final Random random = new Random();

    @FXML
    public void initialize() {
        updateMetrics();
    }

    @FXML
    void handleRefresh() {
        updateMetrics();
    }

    private void updateMetrics() {
        double cpu = random.nextDouble();
        double memory = random.nextDouble();
        double apiError = random.nextDouble();

        cpuProgress.setProgress(cpu);
        memoryProgress.setProgress(memory);
        apiErrorProgress.setProgress(apiError);

        alertList.getItems().clear();
        if (cpu > 0.8) alertList.getItems().add("High CPU usage detected: " + Math.round(cpu * 100) + "%");
        if (memory > 0.8) alertList.getItems().add("High memory load: " + Math.round(memory * 100) + "%");
        if (apiError > 0.2) alertList.getItems().add("Elevated API error rate: " + Math.round(apiError * 100) + "%");

        if (alertList.getItems().isEmpty()) {
            alertList.getItems().add("All systems operating normally.");
        }
    }

    @FXML
    void handleBackAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/fooddeliveryproject/AdminDashboard.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Health");
            stage.show();
        } catch (IOException e) {
            System.err.println("Failed to load Health.");
            e.printStackTrace();
        }
    }
}
