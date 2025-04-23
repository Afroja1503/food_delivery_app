package fooddelivery.fooddeliveryapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class PromotionController {

    @FXML private TextField txtPromoCode;
    @FXML private TextField txtDiscount;
    @FXML private TextField txtItems;
    @FXML private DatePicker dateStart;
    @FXML private DatePicker dateEnd;
    @FXML private TableView<Promotion> promoTable;
    @FXML private TableColumn<Promotion, String> codeCol;
    @FXML private TableColumn<Promotion, Double> discountCol;
    @FXML private TableColumn<Promotion, String> itemsCol;
    @FXML private TableColumn<Promotion, String> dateCol;
    @FXML private Label lblMessage;

    private final ArrayList<Promotion> promotionList = new ArrayList<>();

    @FXML
    public void initialize() {
        codeCol.setCellValueFactory(new PropertyValueFactory<>("promoCode"));
        discountCol.setCellValueFactory(new PropertyValueFactory<>("discountPercent"));
        itemsCol.setCellValueFactory(new PropertyValueFactory<>("eligibleItems"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("durationString"));

        updatePromoTable();
    }

    private void updatePromoTable() {
        promoTable.getItems().clear();
        promoTable.getItems().addAll(promotionList);
    }

    @FXML
    public void handleAddPromotion(ActionEvent event) {
        String code = txtPromoCode.getText();
        String discountText = txtDiscount.getText();
        String items = txtItems.getText();
        LocalDate start = dateStart.getValue();
        LocalDate end = dateEnd.getValue();

        if (code.isEmpty() || discountText.isEmpty() || items.isEmpty() || start == null || end == null) {
            lblMessage.setText("All fields are required.");
            lblMessage.setStyle("-fx-text-fill: red;");
            return;
        }

        try {
            double discount = Double.parseDouble(discountText);
            if (discount > 50.0) {
                lblMessage.setText("Discount cannot exceed 50%.");
                lblMessage.setStyle("-fx-text-fill: red;");
                return;
            }

            Promotion promo = new Promotion(code, discount, items, start, end);
            promotionList.add(promo);
            updatePromoTable();
            lblMessage.setText("Promotion added successfully.");
            lblMessage.setStyle("-fx-text-fill: green;");
            clearFields();

        } catch (NumberFormatException e) {
            lblMessage.setText("Invalid discount value.");
            lblMessage.setStyle("-fx-text-fill: red;");
        }
    }

    private void clearFields() {
        txtPromoCode.clear();
        txtDiscount.clear();
        txtItems.clear();
        dateStart.setValue(null);
        dateEnd.setValue(null);
    }
}
