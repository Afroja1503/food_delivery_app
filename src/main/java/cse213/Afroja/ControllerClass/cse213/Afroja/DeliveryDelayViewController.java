package cse213.Afroja.ControllerClass.cse213.Afroja;
import cse213.Afroja.UserNonUser.DeliveryDelayIssue;
import cse213.Afroja.UserNonUser.Order;
import cse213.Afroja.UserNonUser.RatingAndReview;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DeliveryDelayViewController {
    @FXML
    private DatePicker createdDateLocalDate;

    @FXML
    private TextField deliveryDelayIdTextField;

    @FXML
    private Label deliveryDelayLabel;

    @FXML
    private TextField orderIdTextField;

    @FXML
    private ComboBox<String> orderStatusCXomboBox;
    ArrayList<DeliveryDelayIssue> deliveryDelayArrayList ;
    ArrayList<Order> orders ;
    String inputId ;

    @FXML
    public void initialize(){
        orderStatusCXomboBox.getItems().addAll("Pending","Out For Delivery","Cancelled","In transit","Shipped");
        ArrayList<DeliveryDelayIssue> deliveryDelayArrayList =new ArrayList<>() ;
        ArrayList<Order> orders =new ArrayList<>() ;


    }

    @FXML
    void addToArraylistForDeliveryDelayOnActionButton(ActionEvent event) {
        if (deliveryDelayIdTextField.getText().isEmpty()
                || orderIdTextField.getText().isEmpty()
                || orderStatusCXomboBox.getValue().isEmpty()
                || createdDateLocalDate.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("All fields must be selected.");
            alert.show();
            return;
        }
        Order foundOrder = null;
        for (Order order : orders) {
            if (order.getOrderId().equals(orderIdTextField.getText())) {
                foundOrder = order;
                break;
            }
        }

        if (foundOrder == null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Order not found. Please verify your details.");
            alert.show();
            return;

        }

        DeliveryDelayIssue dl = new DeliveryDelayIssue(
                deliveryDelayIdTextField.getText(),
                orderIdTextField.getText(),
                orderStatusCXomboBox.getValue(),
                createdDateLocalDate.getValue()


        );
        deliveryDelayArrayList.add(dl);
        deliveryDelayIdTextField.clear();
        orderIdTextField.clear();
        orderStatusCXomboBox.setValue("Pending");
        createdDateLocalDate.setValue(null);

        String message = "";


        for (DeliveryDelayIssue o : deliveryDelayArrayList) {
            if (o.getOrderStatus().equals(orderStatusCXomboBox.getValue())) {
                switch (o.getOrderStatus()) {
                    case "NotShipped":
                        o.setOrderId("Escalated to Warehouse");
                        message = "Order Id" + o.getOrderId() + " escalated to warehouse team";
                        break;

                    case "InTransit":
                        o.setOrderId("Courier contacted");
                        message = "Courier contacted for order " + o.getOrderId();
                        break;

                    case "Lost":
                        o.setOrderStatus("Claim Filed");
                        message = "Lost claim started for order " + o.getOrderId();
                        break;
                }

            }
        }

        deliveryDelayLabel.setText(message);
    }

    @FXML
    void loadDeliveryDelayOnActionButton(ActionEvent event) {
        DeliveryDelayIssue r = null;
        try {
            File f = new File("DeliveryDelay.txt");
            Scanner s = new Scanner(f);
            String str = "";
            String[] tokens;
            while (s.hasNextLine()) {
                str = s.nextLine();
                tokens = str.split(",", 4);
                if (tokens.length == 4) {
                    r = new DeliveryDelayIssue(tokens[0], tokens[1], tokens[2],tokens[3]);
                }

            }
            if (r != null) {
                deliveryDelayLabel.setText(r.toString());


            }
            else{
                deliveryDelayLabel.setText("No Delivery Delay Issue Found");

            }
        } catch (FileNotFoundException e) {
            //

        }


    }

    @FXML
    void saveArrayListTextFieldDeliveryDelayOnACtionButton(ActionEvent event) {
        ArrayList<DeliveryDelayIssue> deliveryDelayArrayList = new ArrayList<>();

        FileWriter fw = null;
        try {
            File f = new File("DeliveryDelay.txt");
            if (f.exists()) {
                fw = new FileWriter(f, true);
            } else {
                fw = new FileWriter(f);
            }
            for (DeliveryDelayIssue r : deliveryDelayArrayList) {
                fw.write(r.toString() + ",");
            }
            fw.close();
            System.out.println("Delivery Delay Data saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





}


