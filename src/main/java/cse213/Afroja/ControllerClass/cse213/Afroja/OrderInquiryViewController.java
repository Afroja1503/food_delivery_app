package cse213.Afroja.ControllerClass.cse213.Afroja;

import cse213.Afroja.AppendableObjectOutputStream;
import cse213.Afroja.UserNonUser.OrderInquiry;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.*;
import java.text.BreakIterator;
import java.time.LocalDate;
import java.util.ArrayList;



public class OrderInquiryViewController {
    @FXML
    private DatePicker dateFromDatePicker;

    @FXML
    private DatePicker dateToDatePicker;

    @FXML
    private TextField inquiryIdTextField;

    @FXML
    private Label inquiryLabel;

    @FXML
    private ComboBox<String> inquiryStatusComboBox;

    @FXML
    private ComboBox<String> inquiryTypeComboBox;

    @FXML
    private TextField orderIdTextField;
    ArrayList<OrderInquiry> InquiryList;
    private String type;

    @FXML
    public void initialize() {
        inquiryStatusComboBox.getItems().addAll("Pending", "In Progress", "Resolved", "Unresolved");
        inquiryTypeComboBox.getItems().addAll("Shipping and Delivery Issue", "Payment Issue", "Order Issue", "Return and Refund Issue", "Discount and Promo code Issue", "Order Cancellation", "Other");
        ArrayList<OrderInquiry> InquiryList = new ArrayList<>();

    }

    @FXML
    void addToArraylistForOrderInquiryOnActionButton(ActionEvent event) {
        if (inquiryIdTextField.getText().isEmpty() || orderIdTextField.getText().isEmpty() || inquiryStatusComboBox.getValue() == null ||
                dateFromDatePicker.getValue() == null || inquiryTypeComboBox.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("All fields must be selected.");
            alert.show();
            return;

        }
        if (dateToDatePicker.getValue().isAfter(LocalDate.now())) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Date To must not be a future date.");
            alert.show();
            return;
        }
        if (dateToDatePicker.getValue().isBefore(dateFromDatePicker.getValue())) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Date To must be greater than Date From.");
            alert.show();
        }
        boolean found = false;
        for (OrderInquiry orderInquiry : InquiryList) {
            if (orderInquiry.getInquiryId().equals(inquiryIdTextField.getText())) {
                found = true;
                break;
            }
        }
        if (found) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Inquiry Id already exists.");
            alert.show();
            return;
        }
        boolean found1 = false;
        for (OrderInquiry order : InquiryList) {
            if (order.getOrderId().equals(orderIdTextField.getText())) {
                found1 = true;
                break;
            }
        }
        if (found1) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Order Id already exists.");
            alert.show();
            return;
        }


        OrderInquiry oq = new OrderInquiry(
                inquiryIdTextField.getText(),
                orderIdTextField.getText(),
                inquiryTypeComboBox.getValue(),
                inquiryStatusComboBox.getValue(),
                dateFromDatePicker.getValue(),
                dateToDatePicker.getValue()


        );
        InquiryList.add(oq);
        inquiryIdTextField.clear();
        orderIdTextField.clear();
        inquiryTypeComboBox.setValue(null);
        inquiryStatusComboBox.setValue(null);
        dateFromDatePicker.setValue(null);
        dateToDatePicker.setValue(null);


        String currentStatus = inquiryStatusComboBox.getValue();
        String orderId = orderIdTextField.getText();
        for (OrderInquiry inquiry : InquiryList) {
            if (inquiry.getInquiryStatus().equals(inquiryStatusComboBox.getValue())) {
                switch (currentStatus) {
                    case "Unresolved":
                        inquiry.setInquiryStatus("Assigned");
                        showNotification("Assigned", orderId);
                        break;
                    case "Resolved":
                        inquiry.setInquiryStatus("Resolved");
                        showNotification("Resolved", orderId);
                        break;
                    case "Pending":
                        inquiry.setInquiryStatus("Assigned");
                        showNotification("Pending", orderId);
                        break;
                }
                break;


            }
        }
    }


    @FXML
    void loadOrderInquiryOnActionButton(ActionEvent event) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {

            File f = new File("Inquiry.bin");
            if (f.exists()) {
                fis = new FileInputStream(f);
            } else {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("File does not Exist");
                a.show();
                return;
            }
            if (fis != null) {
                ois = new ObjectInputStream(fis);
            }
            inquiryLabel.setText(" ");

            while (true) {

                OrderInquiry c = (OrderInquiry) ois.readObject();
                String oldText = inquiryLabel.getText();
                String newText = oldText +
                        "Inquiry Id:" + c.getInquiryId() + "," +
                        "Order Id:" + c.getOrderId() + ',' +
                        "Inquiry Status:" + c.getInquiryStatus() + ',' +
                        "Inquiry Type:" + c.getInquiryType() + "," +
                        "Date From:" + c.getDateFrom() + "," +
                        "Date To:" + c.getDateTo();

                inquiryLabel.setText(newText);
            }
        } catch (Exception e) {
            try {

                if (ois != null) {
                    ois.close();
                }
            } catch (Exception e2) {
            }
        }
    }


    @FXML
    void saveArrayListToBinaryFileForOrderInquiryOnActoinButton(ActionEvent event) {
        try {
            File f = new File("Inquiry.bin");
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            for (OrderInquiry c : InquiryList) {
                oos.writeObject(c);
            }
            oos.close();
        } catch (Exception e) {
            //
        }


    }

    private void showNotification(String assigned, String orderId) {
        String message = "";
        String type = new String();
        switch (type) {
            case "Assigned":
                message = "Order " + orderId + " is being reviewed";
                break;
            case "Resolved":
                message = "Order " + orderId + " is resolved!";
                break;
            case "Pending":
                message = "Order " + orderId + " is being worked on";
                break;
        }
        new Alert(Alert.AlertType.INFORMATION, message).show();
    }
}
















