import java.util.Arrays;
import java.util.LinkedList;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
       LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1,2,4));
       LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1,3,4));
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
       this.next=null;
       this.value=value;
    }
    ListNode(int value,ListNode listNode){
        this.value=value;
        this.next=listNode;
    }
}
