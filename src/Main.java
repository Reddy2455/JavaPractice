
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Student s = new Student();
        s.setName("Nagarjuna Reddy");
        System.out.printf("Name of the student: "+ s.getName());
        //Day 3 assignment
        Product product = new Product();
        product.setPrice(12.5);
        double price = product.getPrice();
        System.out.println("Price for single quantity: " + price);

        int quantity = 7;
        double totalPrice = product.getPrice(quantity);
        System.out.println("Price for " + quantity + " quantities: " + totalPrice);

        //runtime polymorphism
        Department department = new SalesDepartment(20);
        int departmentSize = department.getDepartmentSize();
        System.out.println("Department Size: " + departmentSize);
    }
}