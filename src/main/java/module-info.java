module cse213.fooddeliveryproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213.fooddeliveryproject to javafx.fxml;
    exports cse213.fooddeliveryproject;
    exports cse213.fooddeliveryproject.Sadnan_2321524;
    opens cse213.fooddeliveryproject.Sadnan_2321524 to javafx.fxml;
}