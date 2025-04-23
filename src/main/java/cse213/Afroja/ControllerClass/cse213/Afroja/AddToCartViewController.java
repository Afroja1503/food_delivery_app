package cse213.Afroja.ControllerClass.cse213.Afroja;
import java.io.*;

import cse213.Afroja.AppendableObjectOutputStream;
import cse213.Afroja.UserNonUser.Cart;
import cse213.Afroja.UserNonUser.Profile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToCartViewController {


    @FXML
    private TextField priceTextField;
    @FXML
    private Label cartOutputLabel;

    @FXML
    private TextField quantityTextField;

    @FXML
    private ComboBox<String> selectItemComboBox;

    @FXML
    private ComboBox<String> selectRestaurantComboBox;
    @FXML
    private DatePicker createdDatePicker;

    ArrayList<Cart> cartList;
    ArrayList<Cart> cartItemList;
    ArrayList<String> availableItems;
    ArrayList<String> availableRestaurants;

    @FXML
    public void initialize() {
        selectItemComboBox.getItems().addAll(" Pizza", "Burger", "French Fry", "Biryani");
        selectRestaurantComboBox.getItems().addAll("Pizza Burg", "Sultan's Dine");
        ArrayList<Cart> cartList = new ArrayList<>();
        ArrayList<Cart> cartItemList = new ArrayList<>();

    }

    @FXML
    void addToArrayListToCartOnActionButton(ActionEvent event) {
        if (createdDatePicker.getValue() == null
                || quantityTextField.getText().isEmpty() ||
                priceTextField.getText().isEmpty()
                || selectItemComboBox.getValue() == null
                || selectRestaurantComboBox.getValue() == null
                 || createdDatePicker.getValue() == null)
        {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Please fill up all field.");
            a.show();
            return;
        }
        if (selectItemComboBox.getValue() == null || !availableItems.contains(selectItemComboBox.getValue())) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("The selected item is not available");
            a.show();
            return;

        }
        if (selectRestaurantComboBox.getValue() == null || !availableRestaurants.contains(selectRestaurantComboBox.getValue())) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("The selected restaurant is not found");
            a.show();
            return;

        }


        Cart updatedCartToBeAdded = new Cart(

                createdDatePicker.getValue(),

                Float.parseFloat(quantityTextField.getText()),
                Double.parseDouble(priceTextField.getText()),
                selectItemComboBox.getValue(),
                selectRestaurantComboBox.getValue()
        );
        cartList.add(updatedCartToBeAdded);
        createdDatePicker.setValue(null);
        quantityTextField.clear();
        priceTextField.clear();
        selectItemComboBox.setValue(null);
        selectItemComboBox.setValue(null);
    }


    @FXML
    void loadCartOnAction(ActionEvent event) {

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
            cartOutputLabel.setText(" ");

            while (true) {

                Cart c = (Cart) ois.readObject();
                String oldText = cartOutputLabel.getText();
                String newText = oldText +
                        "Created Date:" + c.getCreationDate() + "," +
                        "Quantity:" + c.getQuantity() + ',' +
                        "Price:" + c.getPrice() + ',' +
                        "FoodItem:" + c.getFoodItem() + "," +
                        "Restaurant:" + c.getRestaurant() + ".";

                cartOutputLabel.setText(newText);
            }
        } catch (Exception e) {
            try {

                if (ois != null) {
                    ois.close();
                }
            } catch (Exception e2) {
            }


        }
        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setContentText("Cart added successfully");
        a.show();
        return;
    }

    @FXML
    void saveArrayListToBinaryFileForCartOnAction(ActionEvent event) {
        try {
            File f = new File("Cart.bin");
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            for (Cart c : cartList) {
                oos.writeObject(c);
            }
            oos.close();
        } catch (Exception e) {
            //


        }
    }
}
