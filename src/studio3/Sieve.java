import java.util.Scanner;

public class Sieve {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("type a number: ");
        int n = in.nextInt();
        boolean[] prime = new boolean[n + 1];
        for (int i = 2; i < n + 1; i++){
             prime[i] = true;   
             }
        for(int j = 2; j < n + 1; j++){
            for(int k = 2; j*k < n +1 ;k++){
                prime[j*k] = false;
            }
        }
       for(int i = 2; i < n+1; i++){
        if(prime[i] == true){
        System.out.println(i);
        }
       }
    }
}
