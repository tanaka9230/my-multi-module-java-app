package example;

//import static com.google.common.base.Preconditions.checkNotNull;

public class Sub
{
    public static String Text(String a) {
        return String.format("Hello %s!", a);
        //return String.format("Gooooood Morning %s!", checkNotNull(a));
    }
}
