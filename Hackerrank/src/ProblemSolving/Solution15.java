// Get Node Value

class Solution15 {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        /*
         * SinglyLinkedListNode current = head; SinglyLinkedListNode temp = head; int
         * count=0;int i=0;
         * 
         * while(current !=null){ count=count+1; current=current.next; } int
         * postionFromStart = count - positionFromTail; while(i<postionFromStart){
         * temp=temp.next; } return temp.data; }
         */
        int nodes = 0;
        SinglyLinkedListNode i = head;
        while (i != null) {
            i = i.next;
            nodes++;
        }
        nodes -= positionFromTail;
        while (--nodes > 0) {
            head = head.next;
        }
        return head.data;
    }
}