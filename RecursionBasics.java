public class RecursionBasics{
    public static void printDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    /*public static void main(String args[]){
        int n = 10;
        printDec(n);
    }*/

    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    /*public static void main(String[] args) {
        int n = 10;
        printInc(n);
    }*/

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n*fact(n-1);
        return fn;
    }
    /*public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }*/

    public static int calcSum(int n){
        if(n==1){
            return 1;
        }
        int snm1 = calcSum(n-1);
        int sn = n + snm1;
        return sn;
    }
    /*public static void main(String[] args) {
        int n = 5;
        System.out.println(calcSum(n));
    }*/

    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    /*public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }*/

    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    /*public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(isSorted(arr, 0));
    }*/

    public static int firstOcuur(int arr[], int i, int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOcuur(arr, i+1, key);
    }
    /*public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(firstOcuur(arr, 0, 5));
    }*/

    public static int lastOccur(int arr[], int i, int key){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccur(arr, i+1, key);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    /*public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(lastOccur(arr, 0, 5));
    }*/

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
    }
    /*public static void main(String[] args) {
        System.out.println(power(2, 10));
    }*/

    public static int optimisedPower(int a, int n){
        if(n==0){
            return 1;
        }
        int halfPower = optimisedPower(a, n/2);
        int halfPowerSq = halfPower*halfPower;
        if(n%2!=0){
            halfPowerSq = a*halfPowerSq;
        }
        return halfPowerSq;
    }
    /*public static void main(String[] args) {
        int a = 2;
        int n = 5;
        System.out.println(optimisedPower(a, n));
    }*/

    public static int tilingProblem(int n){
        if(n==0||n==1){
            return 1;
        }
        int fnm1 = tilingProblem(n-1);
        int fnm2 = tilingProblem(n-2);
        int totWays = fnm1 + fnm2;
        return totWays;
    }
    /*public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }*/

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicates(str, idx+1, newStr, map);
        }
        else{
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    /*public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }*/

    public static int friendsPairing(int n){
        if(n==1||n==2){
            return n;
        }
        /*int fnm1 = friendsPairing(n-1);
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1)*fnm2;
        int totWays = fnm1 + pairWays;
        return totWays;*/
        return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
    }
    /*public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }*/

    public static void printBinStrings(int n, int lastPlace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinStrings(n-1, 0, str+"0");
        if(lastPlace==0){
            printBinStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        printBinStrings(3, 0, "");
    }
}
