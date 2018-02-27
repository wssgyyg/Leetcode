public class SwapNodesInPairs_24 {

    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode pointer = head;

        while (pointer != null && pointer.next != null) {
            ListNode first = pointer;
            ListNode next = pointer.next;
            ListNode nextNext = pointer.next.next;
            next.next = first;
            first.next = nextNext;
            pre.next = next;

            pointer = nextNext;
            pre = first;
        }

        return dummy.next;
    }

}
