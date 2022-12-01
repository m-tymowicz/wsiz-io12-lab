package pl.edu.wsiz.io12.part1;

/*
 * #### 1.9
 *
 * Wyznacz średnią arytmetyczną z tablicy liczb rzeczywistych.
 *
 * Wypisz wyznaczoną średnią wraz z tablicą:
 *
 * Średnia liczb: [0.75, 5.0, 0.25, 3.0] to 2.25
 *
 */

import java.util.Arrays;

public class Exercise09 {

    public static void main(String[] args) {

        double[] numbers = {0.75, 5, 0.25, 3};
        double sum = 0;

        for (double number : numbers) {
            sum += number;
        }

        double avg = sum / numbers.length;

        System.out.printf("Średnia liczb: %s to %.2f", Arrays.toString(numbers), avg);
    }
}
