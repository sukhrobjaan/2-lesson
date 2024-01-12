import java.util.Scanner;

public class misol12 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String s1=scanner.next();
        String s2=scanner.next();

        s1=s1.replaceAll(s2," GITA");
        System.out.println(s1);
    }
}
