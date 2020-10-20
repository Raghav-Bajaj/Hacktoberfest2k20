import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.System.exit;



public class Armstrong {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        for (; ; ) {
            int terms = input.nextInt();
            if (terms == -1) {
                exit(1);
            } else {
                int sum = 0;
                double count = 0;
                double temp = terms;
                int teds = terms;
                while(terms != 0 ){
                  count++;
                  terms = terms/10;
                }
                terms = teds ;
                while(terms != 0  ){
                    temp = terms%10;
                    sum = (int) (sum+ pow(temp,count));

                    terms = terms/10;
                }
                System.out.println(count);
                System.out.println(teds);
                System.out.println(sum);
                if(teds == sum){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }
}
