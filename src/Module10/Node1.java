
package Module10;
// LeetCode 206 - Reverse Linked List
import java.util.*;
class Node1{
    int data;
    Node1 next;

    Node1(int d){
        data=d;
        next=null;
    }
}

class ReverseList {
    public static void main(String[] args){

        Node1 head=new Node1(1);
        head.next=new Node1(2);
        head.next.next=new Node1(3);

        Node1 prev=null;
        Node1 cur=head;

        while(cur!=null){
            Node1 next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }

        while(prev!=null){
            System.out.print(prev.data+" ");
            prev=prev.next;
        }
    }
}