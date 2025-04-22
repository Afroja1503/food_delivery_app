package cse213.Afroja.ControllerClass.cse213.Afroja;
import cse213.Afroja.UserNonUser.Issue;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class LoadIssueController {
    @FXML
    private Label issueIdLabel;
    @FXML
    private Label customerIdLabel;

    @FXML
    private Label issueCatagoryLabel;

    @FXML
    private Label issueDescriptionLabel;

    @FXML
    private Label issueStatusLabel;
    @FXML
    private Label orderIdLabel;



    public void receiveIssueIdFromController(String issueId){
        issueIdLabel.setText(issueId);
        Issue c = getIssueFromBinaryFile(issueId);
        issueIdLabel.setText(c.getIssueId());
        customerIdLabel.setText(c.getCustomerId());
        orderIdLabel.setText(c.getOrderId());
        issueCatagoryLabel.setText(c.getIssueCatagory());
        issueDescriptionLabel.setText(c.getIssueDescription());
        issueStatusLabel.setText(c.getIssueStatus());
    }
    public Issue getIssueFromBinaryFile(String issueId){
        ArrayList<Issue> issueList = new ArrayList<>();

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            File f = new File("Issue.bin");
            if (f.exists()) {
                fis = new FileInputStream(f);
            }
            else {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("File does not Exist");
                a.show();
                return null;
            }
            if (fis != null) {
                ois = new ObjectInputStream(fis);
            }

        }
        catch (Exception e) {
            try {

                if (ois != null) {
                    ois.close();
                }

            } catch (Exception e2) {
            }
        }
        Issue issueToFound = null;
        for (Issue c : issueList) {
            if(c.getIssueId().equals(issueId)) {
                issueToFound = c;

            }
        }
        return issueToFound;
    }


}
