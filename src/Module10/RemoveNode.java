package Module10;

    // LeetCode 19 - Remove Nth Node From End
    class Node2 {
        int data;
        Node2 next;

        Node2(int d) {
            data = d;
        }
    }

    class RemoveNthNode {

        static Node2 remove(Node2 head, int n) {

            Node2 fast = head, slow = head;

            for (int i = 0; i < n; i++)
                fast = fast.next;

            if (fast == null)
                return head.next;

            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }

            slow.next = slow.next.next;
            return head;
        }
    }

