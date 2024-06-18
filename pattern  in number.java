import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row,col,val=1;
        for(row=1;row<=n;row++){
            for(col=1;col<=row;col++){
                System.out.print(val+" ");
                val=val+1;
            }
            System.out.println();
        }
    }
}


// OUTPUT

//   INPUT =5
   
//         1
//         2 3
//         4 5 6
//         7 8 9 10
//         11 12 13 14 15
