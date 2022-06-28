import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Main m = new Main();
        m.sumNums();
    }


    public void sumNums() {
        int max = getUserNum();
        int sum = 0;

        for (int i=0; i<= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public int getUserNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();

        return n;
    }
}
