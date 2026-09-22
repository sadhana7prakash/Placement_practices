import java.util.Scanner;
public class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int og = n;
        int rev = 0;
        while(n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        if(og == rev)
            System.out.println("Palindrome");
        else:
            System.out.println("Not a palindrome");
    }
}