package tudelf_ejerc02;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class TwoNumbersSumTest {
    @Test
    public void testAddTwoNumbers() {
        TwoNumbersSum adder = new TwoNumbersSum();
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(1);
        num1.add(2); // 12

        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(3);
        num2.add(4); // 34

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(6); // 46

        assertEquals(expected, adder.addTwoNumbers(num1, num2));
    }

    @Test
    public void testSumWithZero() {
        TwoNumbersSum adder = new TwoNumbersSum();
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(0); // 0

        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(0); // 0

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(0); // 0

        assertEquals(expected, adder.addTwoNumbers(num1, num2));
    }
}