import java.util.List;

public class SinglyLinkedList {
    ListNode head;
    private static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+ " ");
            current=current.next;
        }
//        System.out.print("null");
        System.out.println();
    }
    public int length(){
        ListNode current=head;
        int count=0;
        if(head==null){
            return  0;
        }
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }

    public void insertFirst(int value){
        ListNode n=new ListNode(value);
        n.next=head;
        head=n;
    }
    public void insertLast(int value){
        ListNode n1=new ListNode(value);
        if(head==null){
            head=n1;
            return;
        }
        ListNode current =head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=n1;
    }

    public static void main(String[] args) {
        SinglyLinkedList l=new SinglyLinkedList();
        l.head=new ListNode(10);
        ListNode second=new ListNode(15);
        ListNode third=new ListNode(1);

        l.head.next=second;
        second.next=third;
        third.next=null;
        l.insertFirst(2);
        l.insertLast(4);
        l.display();
        System.out.println("The length of a linked list is equal to " +l.length());

    }
}
