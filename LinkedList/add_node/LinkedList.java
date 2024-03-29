public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    // addfirst
    public void addFirst(int data){
        // step1 => create new Node
        Node newNode = new Node(data);    // like create object
        if(head==null){
            head = tail = newNode;
            return;
        }
        //  Step2 => make the newnode = head
        newNode.next = head;
        // step3 => head = newnode 
        head = newNode;
    }

    // addlast

    public void addlast(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // print Linkedlist

    public void print(){
        if(head == null){
            System.out.println("LinkedList is empty");
            return ;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();       
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addlast(3);
        ll.print();
        ll.addlast(4);
        ll.print();
    }
}