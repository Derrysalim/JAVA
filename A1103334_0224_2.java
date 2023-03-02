import java.util.*;

public class A1103334_0224_2{
    public static void main(String[] argv){
        float celcius, fahrenheit, q;

        System.out.println("input celcius:");
        Scanner sc = new Scanner(System.in);
        celcius = sc.nextInt();

        q = (celcius *9/5) + 32;
        System.out.println(celcius+ " celcius is " + q+ " fahrenheit");
    }
}