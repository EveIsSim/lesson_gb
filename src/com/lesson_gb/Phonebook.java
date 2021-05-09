package com.lesson_gb;

import java.util.*;

public class Phonebook {

    private Map<String, List<String>> phoneBook= new HashMap<>();

    public void add(String surname, String number) {
        if (phoneBook.containsKey(surname)){
            phoneBook.get(surname).add(number);
            System.out.println("Contact " + surname + " was been updated successfully!");
        }
        else{
            phoneBook.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println("Contact " + surname + " was been added successfully!");
        }

    }

    public void get(String surname){
        System.out.println(surname + " - " + phoneBook.get(surname));
    }
}
