package cse213.fooddeliveryproject.Sadnan_2321524;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class DeliveryRoutesController {

    @FXML
    private TableView<Route> routesTable;

    @FXML
    private TableColumn<Route, String> routeIdCol;

    @FXML
    private TableColumn<Route, String> destinationCol;

    @FXML
    private TableColumn<Route, String> estimatedTimeCol;

    @FXML
    private TableColumn<Route, String> statusCol;

    @FXML
    public void initialize() {
        routeIdCol.setCellValueFactory(new PropertyValueFactory<>("routeId"));
        destinationCol.setCellValueFactory(new PropertyValueFactory<>("destination"));
        estimatedTimeCol.setCellValueFactory(new PropertyValueFactory<>("estimatedTime"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        routesTable.setItems(getSampleRoutes());
    }

    private ObservableList<Route> getSampleRoutes() {
        return FXCollections.observableArrayList(
                new Route("R001", "Banani, Dhaka", "15 mins", "On Route"),
                new Route("R002", "Gulshan 2", "25 mins", "Pending"),
                new Route("R003", "Dhanmondi", "35 mins", "Completed")
        );
    }

    public static class Route {
        private String routeId;
        private String destination;
        private String estimatedTime;
        private String status;

        public Route(String routeId, String destination, String estimatedTime, String status) {
            this.routeId = routeId;
            this.destination = destination;
            this.estimatedTime = estimatedTime;
            this.status = status;
        }

        public String getRouteId() { return routeId; }
        public String getDestination() { return destination; }
        public String getEstimatedTime() { return estimatedTime; }
        public String getStatus() { return status; }
    }
    @FXML
    void handleBackAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse213/fooddeliveryproject/DeliveryManDashboard.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Admin Dashboard");
            stage.show();
        } catch (IOException e) {
            System.err.println("Failed to load Admin Dashboard.");
            e.printStackTrace();
        }
    }
}
