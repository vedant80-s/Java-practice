import java.util.Scanner;
public class Que2 {
    
    public static void main(String[] args) {
        System.out.print("Enter Age :- ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name :- ");
        String b = sc.nextLine();
        Que2.res(a, b);
        sc.close();
    }
    public static void res(int age, String name) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}