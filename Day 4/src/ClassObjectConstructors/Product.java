package ClassObjectConstructors;

public class Product {
        private double productCost;
        private double quantity;
        private String productName;

        public Product(double productCost, double quantity, String productName) {
            this.productCost = productCost;
            this.quantity = quantity;
            this.productName = productName;
        }

        public void totalCost() {
            double total = productCost * quantity;
            System.out.println("Total cost is " + total);
        }

        public void printProduct() {
            System.out.println(productName + " cost " + productCost + " and " + quantity + " units were purchased.");
        }

        public static void main(String[] args) {
            Product product = new Product(4.0, 10, "Gallon of gas");
            product.printProduct();
            product.totalCost();
        }
    }

