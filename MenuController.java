package fooddelivery.fooddeliveryapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class MenuController {

    @FXML private TextField nameField;
    @FXML private TextField priceField;
    @FXML private TextField categoryField;
    @FXML private TextField imageField;
    @FXML private TextField availabilityField;
    @FXML private TextArea descriptionArea;
    @FXML private TableView<MenuItem> menuTable;
    @FXML private TableColumn<MenuItem, String> nameCol;
    @FXML private TableColumn<MenuItem, Double> priceCol;
    @FXML private TableColumn<MenuItem, String> categoryCol;
    @FXML private TableColumn<MenuItem, String> availabilityCol;
    @FXML private TableColumn<MenuItem, String> descriptionCol;
    @FXML private Label lblMessage;

    private final ArrayList<MenuItem> menuList = new ArrayList<>();

    @FXML
    public void initialize() {
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
        categoryCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        availabilityCol.setCellValueFactory(new PropertyValueFactory<>("availabilityText"));
        descriptionCol.setCellValueFactory(new PropertyValueFactory<>("description"));

        updateMenuTable();
    }

    private void updateMenuTable() {
        menuTable.getItems().clear();
        menuTable.getItems().addAll(menuList);
    }

    @FXML
    public void handleAddItem(ActionEvent actionEvent) {
        boolean priceInvalid = false;

        String name = nameField.getText();
        String priceText = priceField.getText();
        String category = categoryField.getText();
        String image = imageField.getText();
        String availabilityText = availabilityField.getText();
        String description = descriptionArea.getText();

        double price = 0;
        try {
            price = Double.parseDouble(priceText);
        } catch (NumberFormatException e) {
            priceInvalid = true;
        }

        if (name.isEmpty() || priceText.isEmpty()) {
            lblMessage.setText("Name and Price are required.");
            lblMessage.setStyle("-fx-text-fill: red;");
        } else {
            if (priceInvalid) {
                lblMessage.setText("Invalid price input.");
                lblMessage.setStyle("-fx-text-fill: red;");
            } else {
                boolean available;
                if (availabilityText.equalsIgnoreCase("yes")) {
                    available = true;
                } else if (availabilityText.equalsIgnoreCase("no")) {
                    available = false;
                } else {
                    lblMessage.setText("Please enter 'yes' or 'no' only.");
                    lblMessage.setStyle("-fx-text-fill: red;");
                    return;
                }

                MenuItem item = new MenuItem(name, price, category, image, available, description);
                menuList.add(item);
                updateMenuTable();
                lblMessage.setText("Item added successfully.");
                lblMessage.setStyle("-fx-text-fill: green;");
                clearFields();
            }
        }
    }

    @FXML
    public void handleDeleteItem(ActionEvent actionEvent) {
        MenuItem selected = menuTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            menuList.remove(selected);
            updateMenuTable();
            lblMessage.setText("Item deleted.");
            lblMessage.setStyle("-fx-text-fill: green;");
        } else {
            lblMessage.setText("Please select an item to delete.");
            lblMessage.setStyle("-fx-text-fill: red;");
        }
    }

    private void clearFields() {
        nameField.clear();
        priceField.clear();
        categoryField.clear();
        imageField.clear();
        availabilityField.clear();
        descriptionArea.clear();
    }
}
