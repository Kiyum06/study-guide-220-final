import java.util.HashMap;
import java.util.Map;

public class FinalPractice {
    public static void main(String[] args) {

        // Feel free to call your methods here to experiment

        // 1st method
        // Creating the linked list: 4 -> 8 -> 15 -> 16 -> 23 -> 42 -> 11 -> 29 -> 34
        ListNode list = new ListNode(4,
                new ListNode(8,
                        new ListNode(15,
                                new ListNode(16,
                                        new ListNode(23,
                                                new ListNode(42,
                                                        new ListNode(11,
                                                                new ListNode(29,
                                                                        new ListNode(34)))))))));

        int result = oddIndexSum(list);
        System.out.println("Sum of elements at odd indexes: " + result);

        // YOU MUST ALSO MAKE THOROUGH TESTS FOR EVERY METHOD
    }

    /**
     * linked list: 4 -> 8 -> 15 -> 16 -> 23 -> 42 -> 11 -> 29 -> 34
     * Return the sum of the values at odd indexes in a linked list.
     * 
     * Assumes head is at index 0.
     * 
     * If passed a null head, returns 0.
     * 
     * @param head the head of the linked list
     * @return the sum of the values at odd indexes
     */
    public static int oddIndexSum(ListNode head) {
        // TODO: implement this AND MAKE MORE UNIT TESTS FOR IT
        if (head == null)
            return 0;

        int sum = 0;
        int index = 0;
        ListNode current = head;

        while (current != null) {
            if (index % 2 == 1) {
                sum += current.data;
            }
            current = current.next;
            index++;
        }

        return sum;

    }

    // POSSIBLE VARIATION: Sum of elements at even indexes
    public static int evenIndexSum(ListNode head) {
        if (head == null)
            return 0;

        int sum = 0;
        int index = 0;
        ListNode current = head;

        while (current != null) {
            if (index % 2 == 0) {
                sum += current.data;
            }
            current = current.next;
            index++;
        }

        return sum;
    }

    // Given a reference to the head of a linked list, return the largest of only
    // the last 3 values of the list.
    // Example:
    // Linked List:
    // 7 -> 3 -> 19 -> 21 -> 14 -> 33 -> 8 -> 26 -> 11 -> 5
    // Expected Answer: 26
    // Last 3 values are: 26 11 5, the largest of which is 26
    public static int maxOfLast3(ListNode head) {
        if (head == null)
            return 0;

        ListNode a = null;
        ListNode b = null;
        ListNode c = null;

        while (head != null) {
            a = b;
            b = c;
            c = head;
            head = head.next;
        }
        if (a == null || b == null || c == null)
            return 0;

        return Math.max(a.data, Math.max(b.data, c.data));
    }

    // POSSIBLE VARIATION: Largest of last 4 values

    // Given a reference to the root of a tree, return the sum of the leaf nodes
    // with even values in the tree. Do not //include any odd or branch nodes.
    // Example:
    // Tree:
    // 12
    // / \
    // 6 18
    // / \ / \
    // 4 8 16 20
    // / \
    // 3 22

    // Expected Answer: 46
    // The leaf nodes are 3 8 16 22, and the even ones are 8 16 22.
    // The sum of the even leaf nodes is 8+16+22 = 46

    public static int sumEvenLeafNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            if (root.data % 2 == 0) {
                return root.data;
            } else {
                return 0;
            }
        }

        int leftSum = sumEvenLeafNodes(root.left);
        int rightSum = sumEvenLeafNodes(root.right);

        return leftSum + rightSum;
    }

    // POSSIBLE VARIATION: Sum of leaf nodes with odd values
    public static int sumOddleafNodes(TreeNode root) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null) {
            if (root.data % 2 != 0) {
                return root.data;
            } else {
                return 0;
            }
        }

        int leftSum = sumOddleafNodes(root.left);
        int rightSum = sumOddleafNodes(root.right);

        return leftSum + rightSum;
    }
    // Given a reference to the root of a tree, return the sum of the branch nodes
    // with odd values in the tree. Do not include any even or leaf nodes.
    // Example:
    // Tree:
    // 15
    // / \
    // 9 4
    // / \ / \
    // 8 11 21 30
    // / \ \
    // 2 6 23

    // Expected Answer: 45
    // The branch nodes are 15 9 4 8 21, and the odd ones are 15 9 21
    // The sum of the odd branch nodes is 15+9+21=45

    public static int sumOddBranchNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sum = 0;
        if (root.left != null || root.right != null) {
            if (root.data % 2 != 0) {
                sum = root.data;
            }
        }

        sum += sumOddBranchNodes(root.left);
        sum += sumOddBranchNodes(root.right);

        return sum;
    }

    // POSSIBLE VARIATION: Sum of branch nodes with even values

    // Given a reference to a head node in a linked list of integers, return a
    // Map<Integer, Integer> containing each value along with the number of times it
    // shows up.
    // Example:
    // Linked List:
    // 4 -> 34 -> 4 -> 16 -> 4 -> 16 -> 29 -> 8 -> 8

    // Expected Return Map (order is unimportant):
    // {
    // 4: 3,
    // 8: 2,
    // 16: 2,
    // 29: 1,
    // 34: 1
    // }
    public static Map<Integer, Integer> valueCounts(ListNode head) {
        Map<Integer, Integer> countMap = new HashMap<>();

        while (head != null) {
            int value = head.data;

            if (countMap.containsKey(value)) {
                countMap.put(value, countMap.get(value) + 1);
            } else {
                countMap.put(value, 1);
            }

            head = head.next;
        }

        return countMap;
    }

}
