package cse213.Afroja.ControllerClass.cse213.Afroja;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CustomerIssueViewController {
    @FXML
    private TableColumn<?, ?> catagoryTableColumn;

    @FXML
    private TableColumn<?, ?> customerIdTableColumn;

    @FXML
    private TableColumn<?, ?> emailTableColumn;

    @FXML
    private TableColumn<?, ?> issueIdTableColumn;

    @FXML
    private TextField issueIdTextField;

    @FXML
    private TableColumn<?, ?> messageTableColumn;

    @FXML
    private TableColumn<?, ?> phoneTableColumn;

    @FXML
    private TableColumn<?, ?> statusTableColumn;

    @FXML
    private TableView<?> viewIssueTable;

    @FXML
    void loadCustomerIssueOnActionButton(ActionEvent event) {

    }

}


