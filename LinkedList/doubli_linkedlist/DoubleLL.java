public class DoubleLL{
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // addfirst
    public void addFirst(int data){
        Node newNode = new Node(data);
         size++;
        if (head == null) {
            head = tail = newNode;   
            return ;    
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // AddLast
    public void addLast(int data){
        Node  newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = null;
        tail.next=newNode;
        newNode.prev =tail;
        tail = newNode;
    }

    // removefirst
    public int removeFirst() {
        if (head==null){
            System.out.println("empty ");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(10);
        dll.addFirst(9);
        dll.addFirst(6);
        dll.print();
        System.out.println(dll.size);
        dll.addLast(5);
        dll.print();
        System.out.println(dll.size);
        dll.removeFirst();
        dll.print();
        System.out.println(dll.size);

    }
}