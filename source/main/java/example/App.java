package example;

/**
 * Hello Java!
 **/
public class App
{
    public static void main(String[] args) {
        System.out.println(message());
    }

    static String message() {
        return Sub.Text("Java");
    }
}
