package cse213.Afroja.ControllerClass.cse213.Afroja;
import cse213.Afroja.HelloApplication;
import cse213.Afroja.UserNonUser.Issue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;

public class CustomerIssueViewController {
    @FXML
    private TextField issueIdTextField;
    ArrayList<Issue> issueList ;
    @FXML
    private void initialize() {
        ArrayList<Issue> issueList = new ArrayList<>();


    }

    @FXML
    void loadCustomerIssueOnActionButton(ActionEvent event) {
        if (issueIdTextField.getText().isEmpty() ) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Fill up properly.");
            alert.show();
            return;
        }
        boolean issueFound = false;
        boolean assignedToThisAgent = false;

        for (Issue issue : issueList) {
            if (issue.getIssueId().equals(issueIdTextField.getText())) {
                issueFound = true;

                break;
            }
        }

        if (!issueFound) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Invalid issue id.");
            alert.show();
            return;
        }

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213.Afroja/LoadIssue.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Load Issue Details");
            stage.setScene(scene);
            LoadIssueController nextController = fxmlLoader.getController();
            nextController.receiveIssueIdFromController(issueIdTextField.getText());

            stage.show();
        } catch (Exception e) {
            //;
        }

    }

}




