public class misol6 {
    public static void main(String[] args) {

        int a=12;
        int b=14;
        int c=a++ + ++b+ ++b;
        c+=a-b;
        a-=b-c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
