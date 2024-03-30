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
    public static int size;    // by default size = 1 

    // addfirst
    public void addFirst(int data){
        // step1 => create new Node
        Node newNode = new Node(data);    // like create object
        size++;
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
        size++;
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

    // add in the middle 

    public void addmid(int idx , int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i<idx-1) {
            temp= temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // remove first

    public int removefirst(){
        if(size==0){
            System.out.println( "The linked list is already empty" );
            return Integer.MAX_VALUE;
        }else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head  = head.next;
        size--;
        return val;
    }

    // remove last

    public int removelast() {
        if(size==0){
            System.out.println("The Linked List is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev= prev.next;   // tail
        }
        int val = prev.next.data;  //tail.data
        prev.next= null;
        tail = prev;
        size--;
        return val;
        
    }

    // search key by ietrative method 

    public int itrative(int key){
        Node temp = head;
        int i = 0;
        while(temp !=null ) {
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
            }
            return -1;
       
    }
    public int helper(Node head,int key){
        // base case
        if(head==null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx== -1){
            return -1;
        }
        return idx+1;
    }
    
    public int recursive(int key){
        return helper(head,key);
    }

    //  reverse linked list
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;   // it will reverse the node
            prev = curr;
            curr = next;
        }
        prev = head;
    }

    // delete nth node from the last
    public void deleteNthFromLast(int n) {
        // calculate size 
        int sz = 0;
        Node temp =  head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        // if only  one element is there in the list then we can
        if(n==sz){
            head = head.next;  // it will remmove that head 
            return;
        }
        int i = 1;
        int tofind = sz-n;
        Node prev  = head;
        while (i<tofind) {
            prev = prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
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
        ll.addmid(2, 9);
        ll.print();

        System.out.println(ll.size);

        ll.removefirst();
        ll.print();

        ll.removelast();
        ll.print();
        System.out.println(ll.size);
        // System.out.println(ll.itrative(9));
        System.out.println(ll.recursive(9));
        System.out.println(ll.recursive(10));

        ll.reverse();
        System.out.println("Reversed List");
        ll.print();

        ll.deleteNthFromLast(2);
        ll.print();
    }
}