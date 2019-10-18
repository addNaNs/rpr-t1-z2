package ba.unsa.etf.rpr;
import java.util.Scanner;


public class Main {



    public static int sumaCifara(int n){
        int s = 0;
        while(n != 0){
            s += n % 10;
            n /= 10;
        }
        if(s < 0) {
            s *= -1;
        }

        return s;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i<=n; i++){
            if(i % sumaCifara(i) == 0){
                System.out.println(i);
            }
        }

    }
}
