package cse213.fooddeliveryproject.NonUser;

public class Password {
    private String  userId;

    public Password() {
    }

    public Password(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Password{" +
                "userId='" + userId + '\'' +
                '}';
    }
    public void updatePassword(String newPassword){

    }
    public void  validatePassword(String inputPassword){

    }
}
