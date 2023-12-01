import java.util.Scanner;
public class GetUsername {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The username you entered is: " + InputHelper.getNonZeroLenString(scan, "Please enter your username:"));
    }
}