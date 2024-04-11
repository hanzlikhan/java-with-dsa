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

    // Check iff LL is palindrome
    // 1- find midNode
    // 2- 2nd half reverse
    // 3- check if first half == 2nd half 

    // find mid node 
    // /slow fast tecnique
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    // check palindrome function
    public boolean checkpalindrome(){
        // base case:
        if(head == null || head.next == null ){
            return true;
        }
        // step 1
        Node  midNode = findMid(head);
        // step 2
        Node prev = null;
        Node curr = midNode; // for start here not a head like a reverse a function
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right  = prev;   // midnode
        Node left  = head;

        // step 3
        while (right != null) {
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // detect a loop/cycle in a LL
    //  using floyd's cycle algorithm

    public static boolean detectcycle(){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    //  remove cycle from a linked list
    // detect cycle 
    public static void rmeovecycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        // find meeting point
        slow = head ;
        Node prev = head;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove
        prev.next = null;
    }


    // MergeSort of Linked list

    private Node getmid(Node head){
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1, Node head2){
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while (head1 != null && head2 != null) {
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
         }
         return mergedll.next;

    }
    public  Node mergSort(Node head){
    //   base case 
    if(head == null || head.next == null){
        return head;
    }
    // find mid
    Node mid = getmid(head);

    // left and right merge
    Node rightHead = mid.next;
    mid.next = null;
    Node newRight = mergSort(rightHead); 
    Node newLeft = mergSort(head);
    return merge(newLeft,newRight); 
    }

    //  convert linked list to the zigzag

    public void zigzag(){
        // find mid 

        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse 2nd half
        Node curr = mid.next;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL,nextR;
        // alternate the nodes
        while (left != null && right != null) {
            // for zigzag
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            // for update
            left = nextL;
            right = nextR;
        }
    }

    // Double linked list

    
    public static void main(String[] args) {
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // System.out.println(detectcycle());
        // rmeovecycle();
        // System.out.println(detectcycle());

        // LinkedList ll = new LinkedList();
        // ll.print();       
        // ll.addFirst(1);
        // ll.print();
        // ll.addFirst(2);
        // ll.print();
        // ll.addlast(3);
        // ll.print();
        // ll.addlast(4);
        // ll.addmid(2, 9);
        // ll.print();
        // System.out.println(ll.checkpalindrome());
        // System.out.println(ll.detectcycle());
        // System.out.println(ll.rmeovecycle());
        // System.out.println(ll.size);

        // ll.removefirst();
        // ll.print();

        // ll.removelast();
        // ll.print();
        // System.out.println(ll.size);
        // // System.out.println(ll.itrative(9));
        // System.out.println(ll.recursive(9));
        // System.out.println(ll.recursive(10));

        // ll.reverse();
        // System.out.println("Reversed List");
        // ll.print();

        // ll.deleteNthFromLast(2);
        // ll.print();
        
        
    }
}