// Insert a Node at the Tail of a Linked List
class Solution08 {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

        // SinglyLinkedListNode newNode =new SinglyLinkedListNode(data);
        if (head == null) {
            return new SinglyLinkedListNode(data);
        }
        SinglyLinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new SinglyLinkedListNode(data);
        return head;
    }
}