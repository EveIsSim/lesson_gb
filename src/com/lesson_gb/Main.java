package com.lesson_gb;

import java.util.*;

public class Main {

    public static void main(String[] args) {

	    List<String> spisok = new ArrayList<>(Arrays.asList("a", "a", "a", "b", "b", "c", "d", "e", "f", "f", "g", "h"));

	    // get uniq spisok
        convertListToSet(spisok);

        System.out.println();
        System.out.println();

        // count repeat every word from "spisok"
        cntRepeatWordFromList(spisok);

        System.out.println();
        System.out.println();

        Phonebook pb = new Phonebook();
        pb.add("Leo", "957203523");
        pb.add("Leo", "957203523324");
        pb.add("Ivan", "88738");
        pb.get("Leo");
    }

    public static void convertListToSet(List spisok) {

        Set<String> uniq_spisok = new HashSet<>(spisok);
        System.out.println("sout uniq value from list");
        System.out.println(uniq_spisok);
        System.out.println("==========================");

    }

    public static void cntRepeatWordFromList (List spisok) {

        System.out.println("count repeat every word from \"spisok\"");
        String previos_text = (String) spisok.get(0);
        int cnt_repeat = 0;

        for(Object word : spisok){
            if (word == previos_text){
                cnt_repeat++;
                previos_text = (String) word;
            }
            else {
                System.out.println("\"" + previos_text + "\"" + " is repeated " + cnt_repeat + " times.");
                previos_text = (String) word;
                cnt_repeat = 1;
            }
        }
        System.out.println("==========================");
    }
}
