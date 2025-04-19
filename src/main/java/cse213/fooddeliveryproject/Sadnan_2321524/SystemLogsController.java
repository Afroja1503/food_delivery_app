package cse213.fooddeliveryproject.Sadnan_2321524;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class SystemLogsController {

    @FXML private TableView<LogEntry> logTable;
    @FXML private TableColumn<LogEntry, String> timestampColumn;
    @FXML private TableColumn<LogEntry, String> typeColumn;
    @FXML private TableColumn<LogEntry, String> messageColumn;
    @FXML private Label statusLabel;

    private ObservableList<LogEntry> logs = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        timestampColumn.setCellValueFactory(data -> data.getValue().timestampProperty());
        typeColumn.setCellValueFactory(data -> data.getValue().typeProperty());
        messageColumn.setCellValueFactory(data -> data.getValue().messageProperty());

        // Simulated logs
        logs.add(new LogEntry(now(), "INFO", "System started"));
        logs.add(new LogEntry(now(), "ERROR", "API failure on /orders"));
        logs.add(new LogEntry(now(), "WARN", "Disk usage at 90%"));

        logTable.setItems(logs);
    }

    @FXML
    void handleExport() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Export Logs");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("CSV Files", "*.csv"));
        File file = fileChooser.showSaveDialog(null);
        if (file != null) {
            try (FileWriter writer = new FileWriter(file)) {
                writer.write("Timestamp,Type,Message\n");
                for (LogEntry log : logs) {
                    writer.write(String.format("%s,%s,%s\n",
                            log.getTimestamp(), log.getType(), log.getMessage()));
                }
                statusLabel.setText("Logs exported successfully.");
            } catch (IOException e) {
                statusLabel.setText("Export failed.");
            }
        }
    }

    private String now() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}