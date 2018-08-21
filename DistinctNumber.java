package DistinctNumber ;

import java.util.*;

//دریافت 10 عدد از کاربر و نمایش اعداد غیر تکراری
public class DistinctNumber {

    final static int ARRAY_SIZE = 10;
    static Scanner input = new Scanner(System.in);
    static boolean isUnique;
    static int counter;

    public static void main(String[] args) {

        int[] array = new int[ARRAY_SIZE];
        

        setElemet(array);
        displayDistinctNumber(array);

    }

    public static void setElemet(int[] array) {

        System.out.println(String.format("Enter %d numbers ...", ARRAY_SIZE));

        for (int i = 0; i < ARRAY_SIZE; i++) {

            array[i] = input.nextInt();

        }

        System.out.println("\n");

    }

    public static void displayDistinctNumber(int[] array) {

        System.out.println("Distinct numbers ...");

        for (int i = 0; i < ARRAY_SIZE; i++) {

            isUnique = false;

            for (int j = 0; j < i; j++) {

                if (array[i] == array[j]) {

                    isUnique = true;
                    break;

                }
            }

            if (!isUnique) {

                counter++;
                System.out.print(array[i] + "\t");

            }

        }

        System.out.println(String.format("\nThe number of distinct number is : %d", counter));

    }

}
