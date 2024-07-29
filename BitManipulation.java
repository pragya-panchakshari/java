import java.util.*;
public class BitManipulation {
    /*public static void main(String args[]){
        System.out.println((6>>1));
    }*/

    public static void OddorEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    /*public static void main(String[] args) {
        OddorEven(3);
        OddorEven(11);
        OddorEven(14);
    }*/

    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    /*public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
    }*/

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    /*public static void main(String[] args) {
        System.out.println(setIthBit(10, 2));
    }*/

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    /*public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1));
    }*/

    public static int updateIthBit(int n, int i, int newBit){
        /*if(newBit==0){
            return clearIthBit(n, i);
        }
        else{
            return setIthBit(n, i);
        }*/

        n = clearIthBit(n, i);
        int BitMask = newBit<<i;
        return n|BitMask;
    }
    /*public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }*/

    public static int clearIBits(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    /*public static void main(String[] args) {
        System.out.println(clearIBits(15, 2));
    }*/

    public static int clearBitsinRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    /*public static void main(String[] args) {
        System.out.println(clearBitsinRange(10, 2, 4));
    }*/

    public static boolean isPowerOfTwo(int n){
        return (n&(n-1)) == 0;
    }
    /*public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));
    }*/

    public static int countSetBits(int n){
        int count = 0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    /*public static void main(String[] args) {
        System.out.println(countSetBits(10));
    }*/

    public static int fastExpo(int a, int n){
        int ans = 1;
        while(n>0){
            if((n&1)!=0){
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    /*public static void main(String[] args) {
        System.out.println(fastExpo(3, 5));
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); 
        int y = sc.nextInt();
        System.out.println("Before swap: x = " + x + " and y = " + y);
        x = x^y;
        y = x^y;
        x = x^y;
        System.out.println("After swap: x = " + x + " and y = " + y);
    }

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x + " + " + 1 + " is " + -~x);
    }*/

    /*public static void main(String[] args) {
        for(char ch='A'; ch<='Z'; ch++){
            System.out.print((char)(ch|' '));
        }
    }*/
}
