
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row,col,diff;
        for(row=1;row<=n;row++) {
            int val=row;
            diff=n-1;
            for(col=1;col<=row;col++) {
                System.out.print(val+" ");
                val=val+diff;
            }
            System.out.println();
        }

    }
}


// OUTPUT
//  5
//         1
//         2 6
//         3 7 11
//         4 8 12 16
//         5 9 13 17 21
