import java.util.Scanner;
public class div_5_11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 5 == 0 && n % 11 == 0){
            System.out.println("Disible by both 5 and 11");
        }
        else{
            System.out.println("Not divisible by both 5 and 11");
        }
    }
}