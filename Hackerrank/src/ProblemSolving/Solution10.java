//Insert a node at a specific position in a linked list


public class Solution10 {

static class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode current = head;
          SinglyLinkedListNode newNode =new SinglyLinkedListNode(data);
        if(position ==0){
          newNode = head;
            return head;
        }
        while(--position>0){
            current=current.next;
             }
        SinglyLinkedListNode i = current.next;
        current.next = newNode;
        current.next.data = data;
        current.next.next = i;
        return head;

    }

}