import java.util.LinkedList;
public class MergSortLL{
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
            if(head1 <= head2){
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
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.pri
    }
}