package string.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */
        String st="Java is programming Language.Java is also an Island of Indonisia .Java is widely used language";
        st = st.toLowerCase();
        HashMap<String, Integer> counter = new HashMap<>();
        for (String word : st.split(" ")) {

            int i = counter.getOrDefault(word, 0);
            counter.put(word, i + 1);
        }

        ArrayList<Integer> lengths = new ArrayList<>();
        System.out.println("Duplicate words and occurrences:");
        for (String key : counter.keySet()) {

            lengths.add(key.length());
            if (counter.get(key) > 1)
                System.out.println(key + " " + counter.get(key));

        }
        Integer sum = 0;
        for (Integer length : lengths) {
            sum += length;
        }
        int average = sum / lengths.size();

        System.out.println("Average length of the words is: " + average);

    }
}
