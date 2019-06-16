// Delete a Node

class Solution11 {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode current = head;
        while (position == 0) {
            return head.next;
        }
        while (--position > 0) {
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }
}