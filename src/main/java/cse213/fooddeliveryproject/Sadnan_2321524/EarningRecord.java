package cse213.fooddeliveryproject.Sadnan_2321524;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class EarningRecord {
    private final StringProperty week;
    private final StringProperty deliveries;
    private final StringProperty earnings;
    private final StringProperty bonus;

    public EarningRecord(String week, String deliveries, String earnings, String bonus) {
        this.week = new SimpleStringProperty(week);
        this.deliveries = new SimpleStringProperty(deliveries);
        this.earnings = new SimpleStringProperty(earnings);
        this.bonus = new SimpleStringProperty(bonus);
    }

    public StringProperty weekProperty() { return week; }
    public StringProperty deliveriesProperty() { return deliveries; }
    public StringProperty earningsProperty() { return earnings; }
    public StringProperty bonusProperty() { return bonus; }
}
