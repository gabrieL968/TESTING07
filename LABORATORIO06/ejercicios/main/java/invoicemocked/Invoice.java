package invoicemocked;

public class Invoice {
    private String customer;
    private double value;

    public Invoice(String customer, double value) {
        this.customer = customer;
        this.value = value;
    }

    // Getters
    public double getValue() { return value; }
    public String getCustomer() { return customer; }
}