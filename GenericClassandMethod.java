package JavaOops;

class Nt <T> {
    private T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }

    void showType() {
        System.out.println("Type of T : " + value.getClass().getName());
    }
}

public class GenericClassandMethod {
    static <T> void display(T data) {
        System.out.println("Type of T : " + data.getClass().getName());
        System.out.println("Data : " + data);
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        Nt<Integer> n = new Nt<>();
        n.setValue(8);
        n.showType();
        System.out.println("Value : " + n.getValue());

        Nt<String> t = new Nt<>();
        t.setValue("Nithin");
        t.showType();
        System.out.println("Value : " + t.getValue());

        System.out.println("===============================");

        display(26);          // Integer
        display("Teju");      // String
        display(8.26f);       // Float
        display(true);        // Boolean
    }
}
