/**
 *  @assignment LAB EXCERCISE 01
 * 
 *  @author      STUDENT'S NAME: MOHMMED R H HIREZ
 *               STUDENT'S NO:   1 2022 0519
 * 
 *  @instructor  Dr. Eyad El-Masri
 *
 *  @course      BSAI2121 Data Structures and Algorithm Analysis - Lab

 *  @date        05 Jan 2025
 */

import java.util.*;

public class LabExcercise1{
    public static void main(String[] args) {

        // Create A HashMap to save the Number as Key and the Frequency as Value
        HashMap<Integer, Integer> numbers_dict = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        while(scan.hasNextInt()){
            
            int next = scan.nextInt();
            if(next == -999) break;

            // If the number dosen't excist in the Hash Map will store key(nummber): value(1)
            // else will add one to the number frequency Value
            numbers_dict.put(
                next, 
                numbers_dict.getOrDefault(next, 0) +1 // return the frequency and add 1 to it 
                );
        }
        

        // Print The Frequency Table
        System.out.println("Number\tCount");
        for (Integer key : numbers_dict.keySet())
            System.out.println( key + "\t" + numbers_dict.get(key));


    }
}
