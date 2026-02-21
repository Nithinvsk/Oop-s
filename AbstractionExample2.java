package JavaOops;

abstract class Jewellary {
    // Abstract method (no body)
    abstract void Gold(); 

    // Concrete method (has body)
    void silver() { 
        System.out.println("Silver");
    }
}
// Concrete subclass
class skj extends Jewellary {
    // Implementation of abstract method
    void Gold() {
        System.out.println("Gold");
    }
}
public class AbstractionExample2 {
    public static void main(String[] args) {
        skj shop = new skj();
        shop.Gold();
        shop.silver();
    }
}
