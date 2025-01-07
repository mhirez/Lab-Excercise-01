
# Frequency Counter

## Author Information

- **Student's Name:** Mohmmed R H Hirez  
- **Student Number:** 1 2022 0519  
- **Instructor:** Dr. Eyad El-Masri  
- **Course:** BSAI2121 Data Structures and Algorithm Analysis - Lab  
- **Assignment:** LAB EXERCISE 01  
- **Date:** 05 Jan 2025  

---

## Project Overview

This project is a Java-based **Frequency Counter** application that reads a sequence of integers from the user and counts the frequency of each number. The application stores the numbers and their respective counts in a `HashMap` and displays the frequency table as output.

### Features

1. **Read Input Numbers**  
   - Continuously reads integers from the user until the sentinel value `-999` is entered.

2. **Count Frequency**  
   - Uses a `HashMap` to store each number as a key and its frequency as the value.

3. **Display Frequency Table**  
   - Outputs the frequency of each number in a tabular format.

---

### Code Structure

- **Main Class (`LabExcercise1`)**  
  Contains the main method which handles reading input, counting frequencies, and displaying the results.

### How to Run

1. Compile the code using a Java compiler:
   ```bash
   javac LabExcercise1.java
   ```
2. Run the program:
   ```bash
   java LabExcercise1
   ```
3. Enter integers one by one, pressing **Enter** after each.  
   To end the input, type `-999` and press **Enter**.

---

## Sample Output

Below is a sample output generated by running the program:

```
> 15 40 28 62 15 28 -999

Number  Count
40      1
28      2
62      1
15      2

```

---

## License

This project is developed as part of an academic lab exercise and is intended for educational purposes only.
