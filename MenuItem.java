package fooddelivery.fooddeliveryapp;

public class MenuItem {
    private String name;
    private double price;
    private String category;
    private String imagePath;
    private boolean availability;
    private String description;

    public MenuItem(String name, double price, String category, String imagePath,
                    boolean availability, String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.imagePath = imagePath;
        this.availability = availability;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // ✅ Extra method for TableView to show "Yes"/"No" instead of true/false
    public String getAvailabilityText() {
        return availability ? "Yes" : "No";
    }

    @Override
    public String toString() {
        return name + " - " + category + " - " + price + " BDT";
    }
}
