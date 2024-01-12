import java.util.Scanner;

public class misol15 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String s1=scanner.next();
        String s2=scanner.next();
        String s3=scanner.next();
        s1=s1.replace(s2,s3);
        System.out.println(s1);

    }
}
