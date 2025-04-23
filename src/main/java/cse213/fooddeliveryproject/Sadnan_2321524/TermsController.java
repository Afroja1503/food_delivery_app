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

public class TermsController {

    @FXML private TextArea termsEditor;
    @FXML private Button previewBtn;
    @FXML private Button publishBtn;
    @FXML private Label statusLabel;

    private String previewedText = "";

    @FXML
    public void initialize() {
        termsEditor.setText("Enter updated Terms of Service here...");
    }

    @FXML
    void handlePreview() {
        previewedText = termsEditor.getText();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Preview Terms of Service");
        alert.setHeaderText("Preview Mode");
        alert.setContentText(previewedText.length() > 500 ? previewedText.substring(0, 500) + "..." : previewedText);
        alert.showAndWait();
    }

    @FXML
    void handlePublish() {
        String newText = termsEditor.getText();
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        System.out.println("Terms updated: " + timestamp);
        statusLabel.setText("Terms of Service published at " + timestamp);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Published");
        alert.setHeaderText("Terms Updated Successfully");
        alert.setContentText("All users have been notified of the update.");
        alert.showAndWait();
    }
    @FXML
    void handleBackAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/fooddeliveryproject/AdminDashboard.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Terms");
            stage.show();
        } catch (IOException e) {
            statusLabel.setText("Failed to load Terms.");
            e.printStackTrace();
        }
    }
}
