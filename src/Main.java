import customer.Customer;
import sale.Sale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter customer type (Premium/Gold/Silver/Normal): ");
        String customerType = scanner.nextLine();

        Customer customer = new Customer(customerName, customerType);
        Sale sale = new Sale(customer, "2024-02-22");

        System.out.print("Enter service expense: ");
        double serviceExpense = scanner.nextDouble();
        sale.setServiceExpense(serviceExpense);

        System.out.print("Enter product expense: ");
        double productExpense = scanner.nextDouble();
        sale.setProductExpense(productExpense);

        sale.displayInfo();

        scanner.close();
    }

}