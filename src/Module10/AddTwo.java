package Module10;

    // LeetCode 2 - Add Two Numbers
    class Node3 {
        int val;
        Node3 next;

        Node3(int v) {
            val = v;
        }
    }

    class AddTwoNumbers {

        static Node3 add(Node3 l1, Node3 l2) {

            Node3 dummy = new Node3(0);
            Node3 cur = dummy;
            int carry = 0;

            while (l1 != null || l2 != null || carry != 0) {

                int sum = carry;

                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }

                if (l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }

                carry = sum / 10;

                cur.next = new Node3(sum % 10);
                cur = cur.next;
            }

            return dummy.next;
        }
    }

