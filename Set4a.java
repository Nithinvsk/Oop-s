package JavaOops;

public class Set4a {
    private Double width;
    private Double height;
    private Double area;

    // Default constructor
    public Set4a() {
        this.width = null;
        this.height = null;
        this.area = null;
    }

    // Constructor with width and height
    public Set4a(double width, double height) {
        this.width = width;
        this.height = height;
        computeAreaIfReady();
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
        computeAreaIfReady();
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
        computeAreaIfReady();
    }

    // Getter for width
    public Double getWidth() {
        return width;
    }

    // Getter for height
    public Double getHeight() {
        return height;
    }

    // Getter for area
    public Double getArea() {
        return area;
    }

    // Private method to compute area if both dimensions are set
    private void computeAreaIfReady() {
        if (width != null && height != null) {
            area = width * height;
        }
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        Set4a rect1 = new Set4a();
        rect1.setWidth(5);
        System.out.println("Area after setting width only: " + rect1.getArea()); // null
        rect1.setHeight(10);
        System.out.println("Area after setting height: " + rect1.getArea()); // 50.0

        Set4a rect2 = new Set4a(3, 4);
        System.out.println("Area with constructor: " + rect2.getArea()); // 12.0
    }
}
