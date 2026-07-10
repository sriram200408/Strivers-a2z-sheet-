package BitManipulation;
import java.util.Scanner;

class countsetbits{
    static int countSetbits(int num){
        int count = 0;
        while(num>0){
            if((num&1)==1)count++;
            num = num>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("the number of set bits are " + countSetbits(num));
        sc.close();
    }
}