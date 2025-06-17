import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

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

    // 4th method
    @Test
    void testSumEvenLeafNodes_givenTree() {
        TreeNode root = new TreeNode(12,
                new TreeNode(6,
                        new TreeNode(4,
                                new TreeNode(3), null),
                        new TreeNode(8)),
                new TreeNode(18,
                        new TreeNode(16),
                        new TreeNode(20, null, new TreeNode(22))));
        assertEquals(46, FinalPractice.sumEvenLeafNodes(root));
    }

    @Test
    void testSumEvenLeafNodes_onlyOdds() {
        TreeNode root = new TreeNode(11,
                new TreeNode(3),
                new TreeNode(5));
        assertEquals(0, FinalPractice.sumEvenLeafNodes(root));
    }

    @Test
    void testSumEvenLeafNodes_singleEvenLeaf() {
        TreeNode root = new TreeNode(1, null, new TreeNode(8));
        assertEquals(8, FinalPractice.sumEvenLeafNodes(root));
    }

    @Test
    void testSumEvenLeafNodes_nullTree() {
        assertEquals(0, FinalPractice.sumEvenLeafNodes(null));
    }

    @Test
    void testSumEvenLeafNodes_rootIsEvenLeaf() {
        TreeNode root = new TreeNode(4);
        assertEquals(4, FinalPractice.sumEvenLeafNodes(root));
    }

    @Test
    void testSumEvenLeafNodes_rootIsOddLeaf() {
        TreeNode root = new TreeNode(7);
        assertEquals(0, FinalPractice.sumEvenLeafNodes(root));
    }

    // sumOddLeafNodes() method
    @Test
    void testSumOddLeafNodes_mixedLeaves() {
        TreeNode root = new TreeNode(10,
                new TreeNode(5,
                        new TreeNode(4),
                        new TreeNode(7)),
                new TreeNode(12,
                        null,
                        new TreeNode(9)));
        assertEquals(16, FinalPractice.sumOddleafNodes(root));
    }

    @Test
    void testSumOddLeafNodes_allOddLeaves() {
        TreeNode root = new TreeNode(5);
        assertEquals(5, FinalPractice.sumOddleafNodes(root));
    }

    @Test
    void testSumOddLeafNodes_noOddLeaves() {
        TreeNode root = new TreeNode(2,
                new TreeNode(4),
                new TreeNode(6));
        assertEquals(0, FinalPractice.sumOddleafNodes(root));
    }

    // 5th method
    @Test
    void testSumOddBranchNodes_givenTree() {
        TreeNode root = new TreeNode(15,
                new TreeNode(9,
                        new TreeNode(8,
                                new TreeNode(2), new TreeNode(6)),
                        new TreeNode(11)),
                new TreeNode(4,
                        new TreeNode(21,
                                null, new TreeNode(23)),
                        new TreeNode(30)));
        assertEquals(45, FinalPractice.sumOddBranchNodes(root));
    }

    @Test
    void testSumOddBranchNodes_onlyLeaves() {
        TreeNode root = new TreeNode(7);
        assertEquals(0, FinalPractice.sumOddBranchNodes(root));
    }

    @Test
    void testSumOddBranchNodes_onlyEvenBranch() {
        TreeNode root = new TreeNode(6,
                new TreeNode(4), new TreeNode(2));
        assertEquals(0, FinalPractice.sumOddBranchNodes(root));
    }

    @Test
    void testSumOddBranchNodes_singleOddBranch() {
        TreeNode root = new TreeNode(7,
                new TreeNode(3), null);
        assertEquals(7, FinalPractice.sumOddBranchNodes(root));
    }

    @Test
    void testSumOddBranchNodes_nullTree() {
        assertEquals(0, FinalPractice.sumOddBranchNodes(null));
    }

    // sumEvenBranchNodes() method
    @Test
    void testSumEvenBranchNodes_typicalTree() {
        TreeNode root = new TreeNode(10,
                new TreeNode(5),
                new TreeNode(8,
                        new TreeNode(2),
                        new TreeNode(4)));
        assertEquals(18, FinalPractice.sumEvenBranchNodes(root));
    }

    @Test
    void testSumEvenBranchNodes_noEvenBranches() {
        TreeNode root = new TreeNode(7,
                new TreeNode(3),
                new TreeNode(9));
        assertEquals(0, FinalPractice.sumEvenBranchNodes(root));
    }

    @Test
    void testSumEvenBranchNodes_singleEvenLeaf() {
        TreeNode root = new TreeNode(4);
        assertEquals(0, FinalPractice.sumEvenBranchNodes(root));
    }

    // 6th method
    @Test
    void testValueCounts_multipleDuplicates() {
        ListNode head = new ListNode(4,
                new ListNode(34,
                        new ListNode(4,
                                new ListNode(16,
                                        new ListNode(4,
                                                new ListNode(16,
                                                        new ListNode(29,
                                                                new ListNode(8,
                                                                        new ListNode(8)))))))));

        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(4, 3);
        expected.put(34, 1);
        expected.put(16, 2);
        expected.put(29, 1);
        expected.put(8, 2);

        assertEquals(expected, FinalPractice.valueCounts(head));
    }

    @Test
    void testValueCounts_singleNode() {
        ListNode head = new ListNode(7);

        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(7, 1);

        assertEquals(expected, FinalPractice.valueCounts(head));
    }

    @Test
    void testValueCounts_allUnique() {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3)));

        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(1, 1);
        expected.put(2, 1);
        expected.put(3, 1);

        assertEquals(expected, FinalPractice.valueCounts(head));
    }

    @Test
    void testValueCounts_emptyList() {
        ListNode head = null;

        Map<Integer, Integer> expected = new HashMap<>();
        assertEquals(expected, FinalPractice.valueCounts(head));
    }
}// end of class
