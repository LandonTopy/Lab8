import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your favorite int is " + InputHelper.getInt(scan, "Enter your favorite int:") + " and your favorite double is " + InputHelper.getDouble(scan, "Enter your favorite double:"));
    }
}
