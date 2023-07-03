class Solution {
    static int countNodesinLoop(Node head) {
        int length = 1;
        if (head == null || head.next == null) {
            return 0;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = slow.next;

                while (slow != fast) {
                    slow = slow.next;
                    length++;
                }
                return length;
            }
        }
        return 0;

    }
}