public class LL {
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // Head of the list
    private Node head;

    //     Add First -- Add Last  ========19:10
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        LL list = new LL(); 
    }
}
