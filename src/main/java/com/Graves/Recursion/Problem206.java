package com.Graves.Recursion;

public class Problem206 {



    public ListNode reverseList(ListNode head) {

        if(head == null) return null;
        if (head.next == null) return new ListNode(head.val);
        if (head.next.next == null) return new ListNode(head.next.val, new ListNode(head.val));

        return new ListNode(head.next.val, head);
    }


      private class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
