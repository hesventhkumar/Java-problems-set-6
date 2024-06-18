           FUNCTION ----------- METHOD

  ADAM NUMBER

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sqr1,sqr2,rev1,rev2;
        int n = sc.nextInt();
        sqr1=square(n);   //12
        rev1=reverse(n);   //21
        sqr2=square(rev1);   //441
        rev2=reverse(sqr2);  //144
        if(sqr1==rev2){
            System.out.println(" ADAM ");
        }
        else
            System.out.println("NOT ADAM ");
    }
    static int square(int n){
        return  n*n; // 12*12  ==21*21

    }
    static int reverse(int n){
        int rev=0,dig;
        while(n!=0){  //12     441
            dig=n%10;  //2=1    1=4
            rev=rev*10+dig;//21  144
            n=n/10;//1  / 44 4

        }
        return rev;
    }

}
