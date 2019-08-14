import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] splittedStrings = s.trim().split("[ !,?.\\_'@]+");
        //Edge cases
        if(s == ""){
            System.out.println("0");
        } else if(s.length() > 400000) {
            return;
        } else if (s == null || s.trim().equals("")) {
           System.out.println("0");
        } else {
            System.out.println(splittedStrings.length);
        }
        Arrays.stream(splittedStrings)
                        .forEach(i -> System.out.println(i));
        scan.close();
    }
}

