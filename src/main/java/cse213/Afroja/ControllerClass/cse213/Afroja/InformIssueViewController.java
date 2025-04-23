package cse213.Afroja.ControllerClass.cse213.Afroja;
import cse213.Afroja.AppendableObjectOutputStream;
import cse213.Afroja.UserNonUser.Cart;
import cse213.Afroja.UserNonUser.Issue;
import cse213.Afroja.UserNonUser.Order;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.*;
import java.util.ArrayList;


public class InformIssueViewController {
    @FXML
    private DatePicker issuedDateDatePicker;
    @FXML
    private ComboBox<String> issueCatagoryComboBox;

    @FXML
    private Label issueRelatedInformationLabel;

    @FXML
    private TextField messageExplainingTextField;

    @FXML
    private TextField orderIdTextField;
    ArrayList<Issue> IssueArrayList ;
    ArrayList<Order> OrderArrayList ;

    @FXML
    public void initialize(){
        issueCatagoryComboBox.getItems().addAll("Order Not Found","Wrong Food Item" ,"Payment Issue",
                "Order Cancellation","Refund Request","Other");
        ArrayList<Issue> IssueArrayList = new ArrayList<>();
        ArrayList<Order> OrderArrayList = new ArrayList<>();



    }

    @FXML
    void addAArraylistForIssueOnActionButton(ActionEvent event) {
        if (issueCatagoryComboBox.getValue() == null || issueCatagoryComboBox.getValue().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please select an issue category.");
            a.show();
            return;
        }
        if (messageExplainingTextField.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Message cannot be empty.");
            a.show();
            return;
        }
        if (messageExplainingTextField.getText().length() < 10 || messageExplainingTextField.getText().length() > 150) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Message must be between 10 and 150 characters.");
            a.show();
            return;
        }
        boolean orderFound = false;


        for (Order order : OrderArrayList) {
            if (order.getOrderId().equals(orderIdTextField.getText()))  {
                orderFound = true;
                break;
            }
        }

        if (!orderFound) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Invalid Order ID. Please check and try again.");
            alert.show();
            return;
        }

        Issue is = new Issue(
                messageExplainingTextField.getText(),
                orderIdTextField.getText(),
                issueCatagoryComboBox.getValue(),
                issuedDateDatePicker.getValue()
        );

    }

    @FXML
    void loadInformIssueOnActionButton(ActionEvent event) {
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
            return;
          }
          if (fis != null) {
            ois = new ObjectInputStream(fis);
          }
          issueRelatedInformationLabel.setText(" ");

          while (true) {

            Issue c = (Issue) ois.readObject();
            String oldText = issueRelatedInformationLabel.getText();
            String newText = oldText +
                    "Order Id" + c.getOrderId() + "," +
                    "Issued Date:" + c.getCreationDate() + ',' +
                    "Issue Catagory:" + c.getIssueCatagory() + ',' +
                    "Explained Message:" + c.getIssueDescription() ;

            issueRelatedInformationLabel.setText(newText);
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
        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setContentText("Your request has been submitted. Our team will respond shortly!");
        a.show();

    }



    @FXML
    void saveArrayListToBinaryFileForIssueCatagoryOnActionButton(ActionEvent event) {
        try {
            File f = new File("Issue.bin");
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            for (Issue c :IssueArrayList ) {
                oos.writeObject(c);
            }
            oos.close();
        } catch (Exception e) {
            //


        }


    }

}


