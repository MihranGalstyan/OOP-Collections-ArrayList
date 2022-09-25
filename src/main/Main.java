package main;

import java.util.ArrayList;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Main {
    public static void main(final String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Victor");
        employees.add("Lucy");
        employees.add("Graph");
        employees.add("Franc");

        for (final String employee : employees) {
            System.out.println(employee);
        }
        System.out.println();


        employees.remove("Lucy");

        for (final String employee : employees) {
            System.out.println(employee);
        }

        ArrayList<Integer> numbers =new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }

        int sum = 0;
        for (final Integer num : numbers) {
            sum += num;
        }

        double avg = (double) sum / numbers.size();

        System.out.println(sum);
        System.out.println(avg);

        ArrayList<String> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            array1.add("Name" + i);
        }

        for (int i = 10; i > 0; i--) {
            array2.add(i);
        }

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            result.add(i,array2.get(i) + "-" + array1.get(i));
        }

        for (final String text : result) {
            System.out.println(text);
        }

    }
}
