import java.util.Scanner;


public class App {

    public static int Fibonacci(int n){
        if(n<0){
            return -1;
        }
        else {
        if(n==0 || n==1){
            return n;
        }
        else{
            return Fibonacci(n-1) + Fibonacci(n-2);
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fibonacci(n));
    }

}
