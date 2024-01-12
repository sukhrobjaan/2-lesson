import java.util.Scanner;

public class misol13 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2= scanner.nextInt();
        String s1= scanner.next();
        String s2= scanner.next();

        String new1=s1.substring(0,n1)+s2.substring(s2.length()-n2);
        System.out.println(new1);


    }
}
