package cse213.Afroja.ControllerClass.cse213.Afroja;
import cse213.Afroja.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginViewController {


        @FXML
        private TextField passwordTextField;

        @FXML
        private TextField userIdtextField;

        @FXML
        void logInActionButton(ActionEvent event) {
                try{
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213.Afroja/customerDashboard.fxml"));
                        Scene scene = new Scene(fxmlLoader.load());
                        Stage nextstage = new Stage();
                        nextstage.setScene(scene);

                        nextstage.setTitle("Customer Dashboard");
                        nextstage.show();
                } catch (Exception e) {
                        //
                }
                try{
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213.Afroja/customerSupportAgentDashboard.fxml"));
                        Scene scene = new Scene(fxmlLoader.load());
                        Stage nextstage = new Stage();
                        nextstage.setScene(scene);

                        nextstage.setTitle("Customer Support Agent Dashboard");
                        nextstage.show();
                } catch (Exception e) {
                        //
                }


        }
}


