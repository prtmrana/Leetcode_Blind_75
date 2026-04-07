

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode2 head = new ListNode2(1);
        head.next = new ListNode2(2);
        head.next.next = new ListNode2(3);
        head.next.next.next = new ListNode2(4);
        head.next.next.next.next = new ListNode2(5);
        // 1->2->3->4->5->null
        // 5->4->3->2->1->null

        printList(head);
        System.out.println("after sorting");
        ListNode2 reversedlListNode2 = reverseList(head);
        printList(reversedlListNode2);

    }

    public static ListNode2 reverseList(ListNode2 head) {
        ListNode2 prev = null;
        ListNode2 curr = head;

        while (curr != null) {
            ListNode2 nextTemp = curr.next; // store next
            curr.next = prev; // reverse link
            prev = curr; // move prev
            curr = nextTemp; // move curr
        }

        return prev; // new head
    }

    public static void printList(ListNode2 head) {
    while (head != null) {
        System.out.print(head.val + " -> ");
        head = head.next;
    }
    System.out.println("null");
}
}

class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2() {
    }

    ListNode2(int val) {
        this.val = val;
    }

    ListNode2(int val, ListNode2 next) {
        this.val = val;
        this.next = next;
    }
}
