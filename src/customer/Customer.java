package customer;

interface DiscountRate {
    double getServiceMemberDiscount();
    double getProductMemberDiscount();
}

public class Customer implements DiscountRate {
    private String customerName;
    private String customerType;

    public Customer(String customerName, String customerType) {
        this.customerName = customerName;
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public double getServiceMemberDiscount() {
        return switch (customerType) {
            case "Premium" -> 0.20;
            case "Gold" -> 0.15;
            case "Silver" -> 0.10;
            default -> 0.0;
        };
    }
    @Override
    public double getProductMemberDiscount() {
        return switch (customerType) {
            case "Premium", "Gold", "Silver" -> 0.10;
            default -> 0.0;
        };
    }
}
