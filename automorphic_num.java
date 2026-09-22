import java.util.Scanner;
public class automorphic_num{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = n * n;
        if (square % 10 == n || square % 100 == n || square % 1000 == n)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not Automorphic");
    }
}