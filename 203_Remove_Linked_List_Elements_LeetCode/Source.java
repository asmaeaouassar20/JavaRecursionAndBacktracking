
/*
*  Define a method to remove elements with a given
*  value from a linked list
* */

public class Source {

    public ListNode removeElements(ListNode head,int val){
        // Base Case : if the current node is null, return null (end of the list)
        if(head==null) return null;

        // Recursively call the method on the next node
        head.next=removeElements(head.next,val);

        // Check if the current node's value is equal to the given value
        if(head.val==val){
            // if it is, skip the current node by returning the next node
            return head.next;
        }else{
            // if it isn't, keep the current node by returning the current node
            return head;
        }
    }
}

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
