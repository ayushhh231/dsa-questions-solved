 ListNode slow = head;
        ListNode fast = head;
        if(head == null){
            return false;
        }
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        if(slow == fast){
            return true;
        }
        }
        return false;  