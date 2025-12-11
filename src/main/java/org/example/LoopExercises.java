package org.example;

public class LoopExercises {
    public int sum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++){
            total = total + i;
        }
        return total;
        // Replace the line below with code that returns the sum of the numbers from 1 to n
        // (use a for loop)
    }

    public int sumUntilEven(int n) {
        int total = 0;
        int i = 1;
        while (i <= n) {
            total += i;
            if (total % 2 == 0) {
                break;
            }
            i++;
        }
        return total;
    }
}

