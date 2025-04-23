package cse213.Afroja;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
<<<<<<< HEAD:src/main/java/cse213/fooddeliveryproject/HelloApplication.java
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/cse213/fooddeliveryproject/Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Login");
=======
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213.Afroja/loginView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("LoginView");
>>>>>>> Customer_CustomerSupportAgent:src/main/java/cse213/Afroja/HelloApplication.java
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
