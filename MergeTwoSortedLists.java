import java.util.Arrays;
import java.util.LinkedList;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
       ListNode list1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(4)));

        // list2: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1,
                new ListNode(3,
                        new ListNode(4)));
         mergeTwoLists(list1, list2);
    }

     public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        LinkedList<ListNode> list=new LinkedList<>();
         
        return list.getFirst();
    }
}


class ListNode{
    int value;
    ListNode next;
    ListNode(int value){
       this.value=value;
    }
    ListNode(int value,ListNode listNode){
        this.value=value;
        this.next=listNode;
    }
}
