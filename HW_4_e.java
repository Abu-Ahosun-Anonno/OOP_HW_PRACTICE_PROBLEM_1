public class HW_4_e {
    public void filterProducts(String category) {
        System.out.println("Filtering products by Category: " + category);
    }

    public void filterProducts(double minPrice, double maxPrice) {
        System.out.println("Filtering products by Price Range: $" + minPrice + " - $" + maxPrice);
    }

    public void filterProductsByBrand(String brand) {
        System.out.println("Filtering products by Brand: " + brand);
    }

    public void filterProducts(String category, double minPrice, double maxPrice) {
        System.out.println("Filtering products by Category: " + category
                + " | Price Range: $" + minPrice + " - $" + maxPrice);
    }

    public void filterProducts(String category, double minPrice, double maxPrice, String brand) {
        System.out.println("Filtering products by Category: " + category
                + " | Price Range: $" + minPrice + " - $" + maxPrice
                + " | Brand: " + brand);
    }

    public static void main(String[] args) {
        HW_4_e filter = new HW_4_e();

        filter.filterProducts("electronics");
        filter.filterProducts(100.0, 500.0);
        filter.filterProductsByBrand("Nike");
        filter.filterProducts("fashion", 50.0, 200.0);
        filter.filterProducts("electronics", 100.0, 500.0, "Apple");
    }
}