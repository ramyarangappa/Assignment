package Module10;


    // LeetCode 876 - Middle of Linked List
    class Node11 {
        int data;
        Node11 next;

        Node11(int d) {
            data = d;
        }
    }

    class MiddleNode {

        public static void main(String[] args) {

            Node1 head = new Node1(1);
            head.next = new Node1(2);
            head.next.next = new Node1(3);
            head.next.next.next = new Node1(4);
            head.next.next.next.next = new Node1(5);

            Node1 slow = head;
            Node1 fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            System.out.println("Middle Node: " + slow.data);
        }
}
