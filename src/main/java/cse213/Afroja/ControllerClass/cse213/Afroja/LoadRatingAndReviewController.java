package cse213.Afroja.ControllerClass.cse213.Afroja;
import cse213.Afroja.UserNonUser.Customer;
import cse213.Afroja.UserNonUser.Issue;
import cse213.Afroja.UserNonUser.RatingAndReview;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class LoadRatingAndReviewController {

    @FXML
    private Label customerIdLabel;

    @FXML
    private Label foodItemLabel;

    @FXML
    private Label ratingNumberLabel;

    @FXML
    private Label restaurantIdLabel;

    @FXML
    private Label reviewLabel;

    public void receiveReviewFromController(String customerId){
        customerIdLabel.setText(customerId);
        RatingAndReview c = getReviewFromBinaryFile(customerId);
        customerIdLabel.setText(c.getCustomerId());
        foodItemLabel.setText(c.getFoodItem());
        ratingNumberLabel.setText(c.getRatingNumber());
        reviewLabel.setText(c.getReview());
        restaurantIdLabel.setText(c.getRestaurantId());
    }
    public RatingAndReview getReviewFromBinaryFile(String customerId){
        ArrayList<RatingAndReview> reviewArrayList = new ArrayList<>();


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

        } catch (FileNotFoundException e) {
            //

        }
        RatingAndReview reviewToFound = null;
        for (RatingAndReview c : reviewArrayList) {

            if(c.getCustomerId().equals(customerId)) {
                reviewToFound= c;

            }
        }
        return reviewToFound;
    }



}
