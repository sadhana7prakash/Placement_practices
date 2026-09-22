import java.util.Scanner;
class large_of_two{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b){
            System.out.println("a is larger");
        }
        else{
            System.out.println("b is larger");
        }
    }
}