import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] splittedStrings = s.split("[ !,?.\\_'@]+");
        System.out.println(splittedStrings.length);
        Arrays.stream(splittedStrings)
                        .forEach(i -> System.out.println(i));
        scan.close();
    }
}

