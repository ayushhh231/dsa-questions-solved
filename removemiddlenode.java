public class removemiddlenode {
     ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        // while(fast.next.next != null && fast.next.next.next != null){
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }
        // slow.next = slow.next.next;
        // return head;
        if(head.next == null){
            return null;
        }
        while(fast != null && fast.next != null){
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        prev.next = slow.next;
        return head;
    
}
