import java.util.Scanner;

public class misol14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("c ga belgi kiritiladi ");
        String c = scanner.nextLine();
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        s1 = s1.replace(c, (c + s2));
        System.out.println(s1);
    }
}
