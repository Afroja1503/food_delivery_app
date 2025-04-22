package cse213.Afroja.ControllerClass.cse213.Afroja;

import cse213.Afroja.AppendableObjectOutputStream;
import cse213.Afroja.UserNonUser.Cart;
import cse213.Afroja.UserNonUser.Order;
import cse213.Afroja.UserNonUser.RatingAndReview;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.collections.FXCollections;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class RateAndReviewOrderViewController {

    @FXML
    private TextField foodItemTextField;

    @FXML
    private Label rateAndReviewLabel;

    @FXML
    private ComboBox<String> ratingComboBox;

    @FXML
    private TextField reviewTextField;

    @FXML
    private Label showingItemCartAndOrderLabel;
    ArrayList<RatingAndReview> RatingAndReviewArrayList;
    ArrayList<RatingAndReview> existingReviews;

    @FXML
    public void initialize() {
        ArrayList<RatingAndReview> RatingAndReviewArrayList = new ArrayList<>();
        ArrayList<RatingAndReview> existingReviews = new ArrayList<>();

        ratingComboBox.getItems().addAll("1", "2", "3", "4", "5");


    }

    @FXML
    void addToArrayListForRateAndReviewOnActionbutton(ActionEvent event) {
        if (foodItemTextField.getText().isEmpty() || ratingComboBox.getValue() == null || reviewTextField.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter valid details");
            alert.show();
            return;

        }
        if (reviewTextField.getText().length() < 10 || reviewTextField.getText().length() > 250) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Review should be between 10 to 250 characters");
            alert.show();
            return;

        }
        boolean reviewExists = false;
        for (RatingAndReview review : existingReviews) {
            if (review.getFoodItem().equals(foodItemTextField.getText())) {
                reviewExists = true;
                break;
            }
        }

        if (reviewExists) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("You’ve already reviewed this item in this order");
            alert.show();
            return;
        }


        RatingAndReview rar = new RatingAndReview(
                reviewTextField.getText(),
                foodItemTextField.getText(),
                Integer.parseInt(ratingComboBox.getValue())

        );
        RatingAndReviewArrayList.add(rar);
        reviewTextField.clear();
        foodItemTextField.clear();
        ratingComboBox.setValue(null);


    }

    @FXML
    void loadCartAndOrderItemOnACtionButton(ActionEvent event) {

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {

            File f = new File("Cart.bin");
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
            showingItemCartAndOrderLabel.setText(" ");

            while (true) {

                Cart c = (Cart) ois.readObject();
                String oldText = showingItemCartAndOrderLabel.getText();
                String newText = oldText +
                        "Created Date:" + c.getCreationDate() + "," +
                        "Quantity:" + c.getQuantity() + ',' +
                        "Price:" + c.getPrice() + ',' +
                        "FoodItem:" + c.getFoodItem() + "," +
                        "Restaurant:" + c.getRestaurant() + ".";

                showingItemCartAndOrderLabel.setText(newText);
            }
        } catch (Exception e) {
            try {

                if (ois != null) {
                    ois.close();
                }
            } catch (Exception e2) {
            }


        }
        FileInputStream fis1 = null;
        ObjectInputStream ois1 = null;

        try {


            File f1 = new File("Order.bin");
            if (f1.exists()) {
                fis1 = new FileInputStream(f1);
            } else {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("File does not Exist");
                a.show();
                return;
            }
            if (fis1 != null) {
                ois1 = new ObjectInputStream(fis1);
            }
            showingItemCartAndOrderLabel.setText(" ");

            while (true) {

                Order o = (Order) ois1.readObject();
                String oldText = showingItemCartAndOrderLabel.getText();
                String newText = oldText +
                        "Delivery Address:" + o.getDeliveryAddress() + "," +
                        "Order Id:" + o.getOrderId() + ',' +
                        "Payment Method:" + o.getPaymentMethod() + ',' +
                        "Order Date:" + o.getPaymentMethod();

                showingItemCartAndOrderLabel.setText(newText);


            }
        } catch (Exception e) {
            try {

                if (ois1 != null) {
                    ois1.close();
                }
            } catch (Exception e2) {
                //
            }
        }
    }


    @FXML
    void loadRateAndReviewOnActionButton(ActionEvent event) {
        RatingAndReview r = null;
        try {
            File f = new File("RatingAndReview.txt");
            Scanner s = new Scanner(f);
            String str = "";
            String[] tokens;
            while (s.hasNextLine()) {
                str = s.nextLine();
                tokens = str.split(",", 3);
                if (tokens.length == 3) {
                    r = new RatingAndReview(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
                }

            }
            if (r != null) {
                rateAndReviewLabel.setText(r.toString());


            }
            else{
                rateAndReviewLabel.setText("No Rating and Reviews Found");

            }
        } catch (FileNotFoundException e) {
            //

        }
    }













    @FXML
    void saveArrayListToTextFileForRateAndReviewOnActionButton(ActionEvent event) {
        ArrayList<RatingAndReview> RatingAndReviewArrayList = new ArrayList<>();
        FileWriter fw = null;
        try {
            File f = new File("RatingAndReview.txt");
            if (f.exists()) {
                fw = new FileWriter(f, true);
            } else {
                fw = new FileWriter(f);
            }
            for (RatingAndReview r : RatingAndReviewArrayList) {
                fw.write(r.toString() + ",");
                            }
            fw.close();
            System.out.println("Reviews saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}








