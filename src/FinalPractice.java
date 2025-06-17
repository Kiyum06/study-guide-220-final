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
}
