package com.lesson_gb;

import com.lesson_gb.exceptions.MyArrayDataException;
import com.lesson_gb.exceptions.MyArraySizeException;

public class Main {

    private static final int currentLengthArray = 4;

    public static void main(String[] args) {

        String massive[][] = new String[][]{{"0", "1", "2", "3"}, {"0", "1", "2", "3"}, {"0", "1", "2", "3"}, {"0", "1", "2", "3"}};

        try {
            try {
                System.out.println("result calculation: " + checkSizeAndDataMassive(massive));
            }
            catch (MyArraySizeException e){
                System.out.println(e.getMessage());
            }
        }
        catch (MyArrayDataException e){
            System.out.println(e.getMessage());
        }
    }

    public static int checkSizeAndDataMassive(String[][] array) throws MyArraySizeException, MyArrayDataException {

        if (array.length != currentLengthArray){
            throw new MyArraySizeException("Incorrect array size!");
        }
        else{
            for (int i = 0; i < array.length; i++){
                if (array[i].length != currentLengthArray){
                    throw new MyArraySizeException("Incorrect array size!");
                }
            }
        }

        return checkDataMassive(array);
    }

    public static int checkDataMassive(String[][] array) throws MyArrayDataException {

        int calculation = 0;

        for (int x = 0; x < array.length; x++){
            for (int y = 0; y < array[x].length; y++){
                try {
                    calculation+= Integer.parseInt(array[x][y]);

                }
                catch (NumberFormatException nfe){
                    throw new MyArrayDataException("Data in your array with index [" + x + "][" + y + "] is not Integer");
                }
            }
        }
        return calculation;
    }
}
