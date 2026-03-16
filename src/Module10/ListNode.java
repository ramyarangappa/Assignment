package Module10;
    // LeetCode 141 - Linked List Cycle
    class ListNode{
        int val;
        ListNode next;

        ListNode(int v){ val=v; }
    }

    class LinkedListCycle {

        static boolean hasCycle(ListNode head){
            ListNode slow=head,fast=head;

            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;

                if(slow==fast) return true;
            }
            return false;
        }
    }

