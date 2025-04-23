package fooddelivery.fooddeliveryapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SellerDashboardController {

    @javafx.fxml.FXML
    private AnchorPane mainContent;

    private void loadView(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fooddelivery/fooddeliveryapp/" + fxmlFile));
            AnchorPane view = loader.load();
            mainContent.getChildren().setAll(view);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void loadProfile(ActionEvent actionEvent) {
        loadView("profile_view.fxml");
    }

    @javafx.fxml.FXML
    public void loadMenu(ActionEvent actionEvent) {
        loadView("menu_view.fxml");
    }

    @javafx.fxml.FXML
    public void loadOrders(ActionEvent actionEvent) {
        loadView("order_view.fxml");
    }

    @javafx.fxml.FXML
    public void loadHandover(ActionEvent actionEvent) {
        loadView("handover_view.fxml");
    }

    @javafx.fxml.FXML
    public void loadReports(ActionEvent actionEvent) {
        loadView("sales_report_view.fxml");
    }

    @javafx.fxml.FXML
    public void loadAvailability(ActionEvent actionEvent) {
        loadView("availability_view.fxml");
    }

    @javafx.fxml.FXML
    public void loadComplaints(ActionEvent actionEvent) {
        loadView("complaint_view.fxml");
    }

    @javafx.fxml.FXML
    public void loadPromotions(ActionEvent actionEvent) {
        loadView("promotion_view.fxml");
    }

    @javafx.fxml.FXML
    public void handleLogout(ActionEvent event) {
        try {
            Parent loginRoot = FXMLLoader.load(getClass().getResource("/fooddelivery/fooddeliveryapp/login_view.fxml"));
            Scene loginScene = new Scene(loginRoot);
            Stage stage = (Stage) mainContent.getScene().getWindow();
            stage.setScene(loginScene);
            stage.setTitle("Login");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
