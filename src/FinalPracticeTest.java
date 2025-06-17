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
        assertEquals(-2 + -4 + -6, actual); // -12
    }

    // TODO: Make thorough tests for ALL the questions on the study guide

}
