
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row,col,val,start;
        int n = sc.nextInt();
        for(row=0;row<=n;row+=2){
            val=n*row+1;
            for(col=1;col<=n;col++){
                System.out.print(val+" ");
                val++;
            }
            System.out.println();
        }
        start=(n/2)*2-1;
        for(row=start;row>=1;row-=2){
            val=n*row-1;
            for(col=1;col<=n;col++){
                System.out.print(val+" ");
                val++;
            }
            System.out.println();
        }
    }
}

//OUTPUT

//5
//        1 2 3 4 5
//        11 12 13 14 15
//        21 22 23 24 25
//        14 15 16 17 18
//        4 5 6 7 8
