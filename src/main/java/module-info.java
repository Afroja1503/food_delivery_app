module cse213.fooddeliveryproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213.Afroja to javafx.fxml;
    exports cse213.Afroja;
}