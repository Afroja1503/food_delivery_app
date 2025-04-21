package cse213.Afroja.ControllerClass.cse213.Afroja;
import cse213.Afroja.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
public class CustomerSupportAgentDashboardController {





        @FXML
        private BorderPane customertAgentBorderPane;
        public void initialize(){

        }

        @FXML
        void FAQSectionOnAction(ActionEvent event) {
                try{
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("fAQSectionView.fxml"));
                        customertAgentBorderPane.setCenter(fxmlLoader.load());

                } catch (Exception e) {

                }
        }

        @FXML
        void  customerIssueOnAction(ActionEvent event)  {
                try{
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("customerComplaintView.fxml"));
                        customertAgentBorderPane.setCenter(fxmlLoader.load());

                } catch (Exception e) {

                }
        }




        @FXML

        void customerReviewOnAction(ActionEvent event) {



                try{
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("customerFeedbackView.fxml"));
                        customertAgentBorderPane.setCenter(fxmlLoader.load());

                } catch (Exception e) {
                        //

                }


        }

        @FXML
        void deliveryDelayOnActibn(ActionEvent event) {
                try{
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("deliveryDelayView.fxml"));
                        customertAgentBorderPane.setCenter(fxmlLoader.load());

                } catch (Exception e) {
                        //

                }


        }

        @FXML
        void handleRefundOnAction(ActionEvent event) {
                try{
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("handleRefundView.fxml"));
                        customertAgentBorderPane.setCenter(fxmlLoader.load());

                } catch (Exception e) {

                }


        }

        @FXML
        void orderInquiryOnAction(ActionEvent event) {
                try{
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("orderInquiryView.fxml"));
                        customertAgentBorderPane.setCenter(fxmlLoader.load());

                } catch (Exception e) {

                }


        }

        @FXML
        void viewCustomerProfileOnAction(ActionEvent event) {
                try{
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("viewCustomerProfileView.fxml"));
                        customertAgentBorderPane.setCenter(fxmlLoader.load());

                } catch (Exception e) {

                }


        }

        @FXML
        void viewOrderHistoryOnAction(ActionEvent event) {
                try{
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("viewOrderHistoryCustomerView.fxml"));
                        customertAgentBorderPane.setCenter(fxmlLoader.load());

                } catch (Exception e) {

                }


        }

    }


