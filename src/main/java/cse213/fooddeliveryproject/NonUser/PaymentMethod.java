package cse213.fooddeliveryproject.NonUser;

import java.time.LocalDate;

public class PaymentMethod {
    private String paymentMethodId,customerId,cardNumber,methodType;
    private LocalDate expiryDate;

    public PaymentMethod() {
    }

    public PaymentMethod(String paymentMethodId, String customerId, String cardNumber, String methodType, LocalDate expiryDate) {
        this.paymentMethodId = paymentMethodId;
        this.customerId = customerId;
        this.cardNumber = cardNumber;
        this.methodType = methodType;
        this.expiryDate = expiryDate;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getMethodType() {
        return methodType;
    }

    public void setMethodType(String methodType) {
        this.methodType = methodType;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "PaymentMethod{" +
                "paymentMethodId='" + paymentMethodId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", methodType='" + methodType + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }
    public boolean processPayment(){
        return true;
    }
    public boolean validatePaymentMethod(){
        return true;
    }
}
