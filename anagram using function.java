   //ANAGRAM
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        num1 = sc.nextInt();  //123
        num2 = sc.nextInt();  //132
        int res1 = CheckAnagram(num1); //321
        int res2 = CheckAnagram(num2);
        if(res1==res2){
            System.out.println("ANAGRAM");
        }
        else
            System.out.println("NOT A ANAGRAM");
    }
    static int CheckAnagram(int num) {
        int dig, res=0;
        while (num != 0) {
            dig = num % 10;
            res =dig *(10^dig)+res;
            num = num / 10;
        }
        return res;
    }
}
