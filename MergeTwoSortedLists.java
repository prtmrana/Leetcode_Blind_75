
public class MergeTwoSortedLists {
    public static void main(String[] args) {

        // ListNode2 head = new ListNode2(1);
        // head.next = new ListNode2(2);
        // head.next.next = new ListNode2(3);
        // head.next.next.next = new ListNode2(4);
        // head.next.next.next.next = new ListNode2(5);

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);
        head.next.next.next = null;

        // list2: 1 -> 3 -> 4 - >null
        ListNode list2 = new ListNode(1,
                new ListNode(3,
                        new ListNode(4)));
        mergeTwoLists(head, list2);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        int len=getSize(list1) > getSize(list2)? getSize(list1) : getSize(list2);
        ListNode node=null;
        for(int i=0;i<len;i++){
           if()
        }
        return null;
    }

    public static int getSize(ListNode head) {
        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }
}

class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }

    ListNode(int value, ListNode listNode) {
        this.value = value;
        this.next = listNode;
    }
}
