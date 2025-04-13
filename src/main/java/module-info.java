module cse213.fooddeliveryproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213.fooddeliveryproject to javafx.fxml;
    exports cse213.fooddeliveryproject;
}