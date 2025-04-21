package cse213.Afroja.ControllerClass.cse213.Afroja;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


public class CustomerReviewViewController {
    @FXML
    private TableColumn<?, ?> customerIdTableColumn;

    @FXML
    private TextField customerIdTextField;

    @FXML
    private TableColumn<?, ?> emailTableColmun;

    @FXML
    private TableColumn<?, ?> foodItemTableColumn;

    @FXML
    private TableColumn<?, ?> phoneNumberTableColumn;

    @FXML
    private TableColumn<?, ?> ratingTableColumn;

    @FXML
    private TableColumn<?, ?> reviewTableColumn;

    @FXML
    private TableView<?> reviewTableView;

    @FXML
    void loadReviewOnActionButton(ActionEvent event) {

    }

}


