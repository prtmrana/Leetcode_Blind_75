import java.util.HashSet;
import java.util.Set;

public class LinkedLifeCycle {
    public static void main(String[] args) {
        ListNode n4 = new ListNode(-4);
        ListNode n3 = new ListNode(0, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode head = new ListNode(3, n2);

        // create cycle
        n4.next = n2;

        System.out.println(hasCycle(head));

      /// it will have time complexity of O(n) ALWAYS 
      /// AND space complexity with hashet is o(n)
      /// but space complexity can be reduced upto O(1) using 
      /// Floyd’s Cycle Detection

        /*
         * head = [3,2,0,-4]
         * pos = 1
         * 
         * 
         * 3 → 2 → 0 → -4 → null
         * Now connect tail to index 1
         * -4 → 2
         * Final Structure (Cycle)
         * 
         * 
         * 3 → 2 → 0 → -4
               ↑         ↓
                ← ← ← ← ←
         * 
         * its a loop or circle
         */
    }

    public static boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }
}

class ListNode {
    int value;
    ListNode next;

    ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}
