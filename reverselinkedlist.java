public class reverselinkedlist {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode forward = null;
        while(curr != null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
