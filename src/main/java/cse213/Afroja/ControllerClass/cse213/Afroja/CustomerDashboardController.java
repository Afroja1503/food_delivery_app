package cse213.Afroja.ControllerClass.cse213.Afroja;
import cse213.Afroja.AppendableObjectOutputStream;
import cse213.Afroja.HelloApplication;
import cse213.Afroja.UserNonUser.Customer;
import cse213.Afroja.UserNonUser.Profile;
import  javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CustomerDashboardController {


        @FXML
        private TextField customerIdTextField;

        @FXML
        private TextField emailTextField;

        @FXML
        private TextField phoneNumberTextField;

        @FXML
        private BorderPane customerBorderPane;
        ;
        @FXML
        ArrayList<Customer> customerList;

        public void initialize() {
                ArrayList<Customer> customerList = new ArrayList<>();

        }

        @FXML
        void addToCartOnAction(ActionEvent event) {
                try {
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("addToCartView.fxml"));
                        customerBorderPane.setCenter(fxmlLoader.load());

                } catch (Exception e) {
                        //

                }

        }

        @FXML
        void cancelAnOrderOnAction(ActionEvent event) {
                try {
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("cancelAnOrderView.fxml"));
                        customerBorderPane.setCenter(fxmlLoader.load());

                } catch (Exception e) {
                        //

                }

        }

        @FXML
        void informIssueOnAction(ActionEvent event) {
                try {
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("informIssueView.fxml"));
                        customerBorderPane.setCenter(fxmlLoader.load());

                } catch (Exception e) {
                        //

                }


        }


        @FXML
        void myProfileOnAction(ActionEvent event) {
                try {
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("myProfileView.fxml"));
                        customerBorderPane.setCenter(fxmlLoader.load());

                } catch (Exception e) {
                        //

                }

        }

        @FXML
        void placeAnOrderOnAction(ActionEvent event) {
                try {
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("placeAnOrderView.fxml"));
                        customerBorderPane.setCenter(fxmlLoader.load());

                }
                catch (Exception e) {
                        //

                }

        }

        @FXML
        void rateAndReviewOrderOnAction(ActionEvent event) {
                try {
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("rateAndReviewOrderView.fxml"));
                        customerBorderPane.setCenter(fxmlLoader.load());

                }
                catch (Exception e) {
                        //

                }

        }

        @FXML
        void trackOrderStatusOnAction(ActionEvent event) {
                try {
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("trackOrderStatusView.fxml"));
                        customerBorderPane.setCenter(fxmlLoader.load());

                } catch (Exception e) {
                        //

                }

        }

        @FXML
        void viewOrderHistoryOnAction(ActionEvent event) {
                try {
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("viewOrderHistoryView.fxml"));
                        customerBorderPane.setCenter(fxmlLoader.load());

                } catch (Exception e) {
                        //

                }

        }

        @FXML
        void saveToBinaryFileCustomerInformationOnActionButton(ActionEvent event) {
                Customer customerToBeAdded = new Customer(
                        customerIdTextField.getText(),

                        emailTextField.getText(),
                        phoneNumberTextField.getText()


                );
                customerList.add(customerToBeAdded);
                customerIdTextField.clear();
                emailTextField.clear();
                phoneNumberTextField.clear();

                try {
                        File f = new File("CustomerProfile.bin");
                        FileOutputStream fos = null;
                        ObjectOutputStream oos = null;
                        if (f.exists()) {
                                fos = new FileOutputStream(f, true);
                                oos = new AppendableObjectOutputStream(fos);

                        } else {
                                fos = new FileOutputStream(f);
                                oos = new ObjectOutputStream(fos);
                        }
                        for (Customer c : customerList) {
                                oos.writeObject(c);
                        }
                        oos.close();
                } catch (Exception e) {
                        //


                }


        }
}
