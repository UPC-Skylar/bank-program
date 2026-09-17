public class FloatingPointExample {
    public static void main(String[] args) {
        String customerName = "Jack";
        String customerName2 = new String("Jack");
        String customerName3 = "Jack";

        System.out.println(customerName2 == customerName3);
        System.out.println(customerName.equals(customerName2));
        System.out.println(customerName);
        System.out.println("*".repeat(2));
    }
}
