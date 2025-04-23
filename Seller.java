package fooddelivery.fooddeliveryapp;

public class Seller {
    private String restaurantName;
    private String address;
    private String phone;
    private String openingHours;
    private String cuisineType;
    private String logoPath;
    private String description;

    public Seller() {
    }

    public Seller(String restaurantName, String address, String phone, String openingHours,
                  String cuisineType, String logoPath, String description) {
        this.restaurantName = restaurantName;
        this.address = address;
        this.phone = phone;
        this.openingHours = openingHours;
        this.cuisineType = cuisineType;
        this.logoPath = logoPath;
        this.description = description;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "restaurantName='" + restaurantName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", openingHours='" + openingHours + '\'' +
                ", cuisineType='" + cuisineType + '\'' +
                ", logoPath='" + logoPath + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
