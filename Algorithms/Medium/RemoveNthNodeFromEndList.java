package Algorithms.Medium;
import Algorithms.Medium.ListNode;

public class RemoveNthNodeFromEndList {

    public static ListNode removeNthFromEnd(ListNode head, int n)
    {
        Integer count = 0;
        ListNode node = head;
        while(node != null)
        {
            node = node.next;
            count++;
        }
        System.out.println("items in list: " + count);
        System.out.println("Removing from end: " + n);
        Integer targetIndexToRemove = count - n;
        System.out.println("REMOVING INDEX " + targetIndexToRemove);
        node = head;
        //we now know the length of the list
        for(Integer i = 0; i < targetIndexToRemove - 1; i++)
        {
            System.out.println("current index: " + i);
            node = node.next;
        }
        node.next = node.next.next;
        return head;
    }

    public void main(String[] args)
    {
        ListNode ll = new ListNode(1);
        ll.next= new ListNode(2);
        ll.next.next = new ListNode(3);
        ll.next.next.next = new ListNode(4);
        System.out.println("ll: " + ll.getVal());
        System.out.println("ll +1 : " + ll.next.getVal());
        System.out.println("ll +2: " + ll.next.next.getVal());
        System.out.println("ll +3: " + ll.next.next.next.getVal());
        //1->2->3->4
        ListNode headNodeWithRemoved = removeNthFromEnd(ll, 3);
        // should be 1 -> 2 -> 3
        System.out.println("ll: " + ll.getVal());
        System.out.println("ll +1 : " + ll.next.getVal());
        System.out.println("ll +2: " + ll.next.next.getVal());
        System.out.println("ll +3: " + ll.next.next.next.getVal());

    }

}
