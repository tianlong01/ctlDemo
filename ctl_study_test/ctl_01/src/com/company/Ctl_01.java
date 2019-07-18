package com.company;

public class Ctl_01 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(6);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l4.next = l5;
        l5.next = l6;
        ListNode listNode = new Ctl_01().addTwoNumbers(l1, l4);
        while (listNode != null){
            System.out.println(listNode.val);
            if(listNode != null) listNode = listNode.next;
        }

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            System.out.println(curr.val+"    curr111111");
            curr = curr.next;
            System.out.println(curr.val+"    curr2222222");

            System.out.println(dummyHead.val+"         dummyHead");
            if(dummyHead.next != null){
                System.out.println(dummyHead.next.val+"         dummyHead");
                if(dummyHead.next.next != null) {
                    System.out.println(dummyHead.next.next.val+"         dummyHead");
                    if(dummyHead.next.next.next != null) {
                        System.out.println(dummyHead.next.next.next.val+"         dummyHead");
                        if(dummyHead.next.next.next.next != null) {
                            System.out.println(dummyHead.next.next.next.next.val+"         dummyHead");
                        }
                    }
                }
            }

            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        while (curr != null){
            System.out.println(curr.val+"  sssssssss");
            curr = curr.next;
        }
        return dummyHead.next;
    }

}
 class ListNode{
    int val;
    ListNode next;

    ListNode(int x){
        val = x;
    }
 }
