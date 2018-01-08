public class AddTwoNumbers_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){

        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode pointer = dummy;
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            pointer.next = new ListNode(sum % 10);
            pointer = pointer.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null){
            int sum = l1.val + carry;
            carry = sum / 10;
            pointer.next = new ListNode(sum % 10);
            pointer = pointer.next;
            l1 = l1.next;
        }

        while (l2 != null){
            int sum = l2.val + carry;
            carry = sum / 10;
            pointer.next = new ListNode(sum % 10);
            pointer = pointer.next;
            l2 = l2.next;
        }

        if (carry > 0)
            pointer.next = new ListNode(carry);

        return dummy.next;

    }

}


