import java.util.*;
public class Strings{
    /*public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());
        String firstName = "Kim";
        String lastName = "Jisoo";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
    }*/


    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    /*public static void main(String args[]){
        String firstName = "Kim";
        String lastName = "Jisoo";
        String fullName = firstName + " " + lastName;
        printLetters(fullName);
    }*/


    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    /*public static void main(String args[]){
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }*/


    public static float getShortestPath(String path){
        int x = 0, y = 0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            if(dir=='S'){
                y--;                                             // South
            }
            else if(dir=='N'){
                y++;                                             // North
            }
            else if(dir=='W'){
                x--;                                             // West
            }
            else{
                x++;                                             // East
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }

    /*public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }*/


    /*public static void main(String[] args) {
       String s1 = "Tony";
       String s2 = "Tony";
       String s3 = new String("Tony");
       if(s1.equals(s3)){
        System.out.println("Strings are equal");
       } 
       else{
        System.out.println("Strings are not equal");
       }
    }*/


    /*public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.substring(0,5));
    }*/


    /*public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }*/


    /*public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }*/


    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));}
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    /*public static void main(String[] args) {
        String str = "hi i am pragya";
        System.out.println(toUpperCase(str));
    }*/


    public static String compress(String str){
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;}
                newStr += str.charAt(i);
                if(count>1){
                    newStr += count.toString();
                }
        }
        return newStr;
    }

    /*public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }*/


    /*public static void main(String args[]){
        String str = new Scanner(System.in).next();
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println("count of vowels is:" + count);
    }*/


    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length()==str2.length()){
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if(result){
                System.out.println(str1 + " and " + str2 + " are anagrams of each other");
            }
            else{
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
            }
        }
        else{
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
        }
    }
}
