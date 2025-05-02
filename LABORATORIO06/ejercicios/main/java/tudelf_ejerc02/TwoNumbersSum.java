package tudelf_ejerc02;

import java.util.ArrayList;
import java.util.Collections;

public class TwoNumbersSum {
    public ArrayList<Integer> addTwoNumbers(ArrayList<Integer> a, ArrayList<Integer> b) {
        int numA = listToInt(a);
        int numB = listToInt(b);
        return intToList(numA + numB);
    }

    private int listToInt(ArrayList<Integer> list) {
        int num = 0;
        for (int digit : list) {
            num = num * 10 + digit;
        }
        return num;
    }

    private ArrayList<Integer> intToList(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        if (num == 0) {
            list.add(0);
            return list;
        }
        while (num > 0) {
            list.add(num % 10);
            num /= 10;
        }
        Collections.reverse(list);
        return list;
    }
}