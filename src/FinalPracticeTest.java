import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class FinalPracticeTest {
    @Test
    void testOddIndexSum_oddLengthList() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16,
                new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(95, actual);
    }

    // TODO: Make more tests for oddIndexSum
    @Test
    void testOddIndexSum_nullList() {
        ListNode list = null;
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(0, actual);
    }

    @Test
    void testOddIndexSum_singleNode() {
        ListNode list = new ListNode(5);
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(0, actual);
    }

    @Test
    void testOddIndexSum_twoNodes() {
        ListNode list = new ListNode(10, new ListNode(20));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(20, actual);
    }

    @Test
    void testOddIndexSum_evenLengthList() {
        ListNode list = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5,
                                                new ListNode(6))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(2 + 4 + 6, actual); // 12
    }

    @Test
    void testOddIndexSum_alternatingZero() {
        ListNode list = new ListNode(1,
                new ListNode(0,
                        new ListNode(3,
                                new ListNode(0,
                                        new ListNode(5)))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(0 + 0, actual); // 0
    }

    @Test
    void testOddIndexSum_negativeValuesAtOddIndexes() {
        ListNode list = new ListNode(10,
                new ListNode(-2,
                        new ListNode(30,
                                new ListNode(-4,
                                        new ListNode(50,
                                                new ListNode(-6))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(-2 + -4 + -6, actual);
    }

    // 2nd method
    @Test
    void testEvenIndexSum_complexList() {
        ListNode list = new ListNode(4,
                new ListNode(8,
                        new ListNode(15,
                                new ListNode(16,
                                        new ListNode(23,
                                                new ListNode(42,
                                                        new ListNode(11,
                                                                new ListNode(29,
                                                                        new ListNode(34)))))))));
        int actual = FinalPractice.evenIndexSum(list);
        assertEquals(87, actual);
    }

    @Test
    void testEvenIndexSum_nullList() {
        assertEquals(0, FinalPractice.evenIndexSum(null));
    }

    @Test
    void testEvenIndexSum_oneNode() {
        ListNode list = new ListNode(7);
        assertEquals(7, FinalPractice.evenIndexSum(list));
    }

    @Test
    void testEvenIndexSum_twoNodes() {
        ListNode list = new ListNode(10, new ListNode(20));
        assertEquals(10, FinalPractice.evenIndexSum(list));
    }

    @Test
    void testEvenIndexSum_alternatingZero() {
        ListNode list = new ListNode(0,
                new ListNode(1,
                        new ListNode(0,
                                new ListNode(1,
                                        new ListNode(0)))));
        assertEquals(0 + 0 + 0, FinalPractice.evenIndexSum(list));
    }

    @Test
    void testEvenIndexSum_negatives() {
        ListNode list = new ListNode(-1,
                new ListNode(-2,
                        new ListNode(-3,
                                new ListNode(-4,
                                        new ListNode(-5)))));
        assertEquals(-1 + -3 + -5, FinalPractice.evenIndexSum(list));
    }

    // 3rd method
    @Test
    void testMaxOfLast3_typicalList() {
        ListNode list = new ListNode(7,
                new ListNode(3,
                        new ListNode(19,
                                new ListNode(21,
                                        new ListNode(14,
                                                new ListNode(33,
                                                        new ListNode(8,
                                                                new ListNode(26,
                                                                        new ListNode(11,
                                                                                new ListNode(5))))))))));
        assertEquals(26, FinalPractice.maxOfLast3(list)); // Last 3: 26, 11, 5
    }

    @Test
    void testMaxOfLast3_exactThreeNodes() {
        ListNode list = new ListNode(10,
                new ListNode(20,
                        new ListNode(5)));
        assertEquals(20, FinalPractice.maxOfLast3(list)); // Last 3: 10, 20, 5
    }

    @Test
    void testMaxOfLast3_allSameValues() {
        ListNode list = new ListNode(9,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9)))));
        assertEquals(9, FinalPractice.maxOfLast3(list)); // Last 3: 9, 9, 9
    }

    @Test
    void testMaxOfLast3_negativeValues() {
        ListNode list = new ListNode(-1,
                new ListNode(-5,
                        new ListNode(-3,
                                new ListNode(-7,
                                        new ListNode(-2)))));
        assertEquals(-2, FinalPractice.maxOfLast3(list)); // Last 3: -3, -7, -2
    }

    @Test
    void testMaxOfLast3_twoNodes() {
        ListNode list = new ListNode(1, new ListNode(2));
        assertEquals(0, FinalPractice.maxOfLast3(list)); // Not enough nodes
    }

    @Test
    void testMaxOfLast3_nullList() {
        assertEquals(0, FinalPractice.maxOfLast3(null)); // Null input
    }

}// end of class
