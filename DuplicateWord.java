import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWord {
    public static void main(String[] args) {
        System.out.println("Enter String to analyse");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // First split string into words, so that we can iterate each word
        String[] words = input.split(" ");
        // Create a map so you can check if a partical word there or not
        Map<String,Integer> wordmap = new HashMap<>();

        // Adds all words into a map
        // If word is already in map then increase its value by +1
        // or else just put 1 in its value
        for (String str2: words){

            String str = str2.toUpperCase(); // To make this code as case insensitive
            if (wordmap.get(str) != null) {
                wordmap.put(str, wordmap.get(str) + 1);
            } else {
                wordmap.put(str,1);
            }
        }

        Set<String> str2 = wordmap.keySet();
        for (String str : str2){
            // Print the words which repeated more than once
            if (wordmap.get(str) > 1){
                System.out.println(" words:" +str+": repeated "+wordmap.get(str)+" time ");
            }

        }
    }
}

