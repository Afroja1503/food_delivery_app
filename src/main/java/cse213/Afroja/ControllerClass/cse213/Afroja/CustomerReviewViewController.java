package cse213.Afroja.ControllerClass.cse213.Afroja;
import cse213.Afroja.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class CustomerReviewViewController {
    @FXML
    private TextField customerIdTextField;
    @FXML
    public void initialize(){

    }

    @FXML
    void loadReviewOnActionButton(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/cse213.Afroja/LoadRatingAndReview.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Load Review Details");
            stage.setScene(scene);
            LoadRatingAndReviewController nextController = fxmlLoader.getController();
            nextController.receiveReviewFromController(customerIdTextField.getText());

            stage.show();
        } catch (Exception e) {
            //;

        }

    }




}


