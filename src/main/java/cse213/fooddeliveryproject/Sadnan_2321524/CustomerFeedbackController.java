package cse213.fooddeliveryproject.Sadnan_2321524;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerFeedbackController {

    @FXML
    private TableView<Feedback> feedbackTable;

    @FXML
    private TableColumn<Feedback, String> orderIdCol;

    @FXML
    private TableColumn<Feedback, String> customerNameCol;

    @FXML
    private TableColumn<Feedback, Integer> ratingCol;

    @FXML
    private TableColumn<Feedback, String> commentCol;

    @FXML
    public void initialize() {
        orderIdCol.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        customerNameCol.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        ratingCol.setCellValueFactory(new PropertyValueFactory<>("rating"));
        commentCol.setCellValueFactory(new PropertyValueFactory<>("comment"));

        feedbackTable.setItems(getFeedbackList());
    }

    private ObservableList<Feedback> getFeedbackList() {
        return FXCollections.observableArrayList(
                new Feedback("O101", "Arif", 5, "Great service!"),
                new Feedback("O102", "Riya", 4, "Delivered on time."),
                new Feedback("O103", "Tanvir", 3, "Slightly late but polite.")
        );
    }

    public static class Feedback {
        private final String orderId;
        private final String customerName;
        private final int rating;
        private final String comment;

        public Feedback(String orderId, String customerName, int rating, String comment) {
            this.orderId = orderId;
            this.customerName = customerName;
            this.rating = rating;
            this.comment = comment;
        }

        public String getOrderId() { return orderId; }
        public String getCustomerName() { return customerName; }
        public int getRating() { return rating; }
        public String getComment() { return comment; }
    }
    @FXML
    void handleBackAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/fooddeliveryproject/DeliveryManDashboard.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Admin Dashboard");
            stage.show();
        } catch (IOException e) {
            System.err.println("Failed to load Admin Dashboard.");
            e.printStackTrace();
        }
    }
}
