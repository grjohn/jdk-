package newcoder_15;

public class 反转链表_15 {
	public ListNode ReverseList(ListNode head) {
        if(head==null) return null;
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode tail = res.next,t = res.next;
        while(tail.next!=null){
            res.next = tail.next;
            tail.next = res.next.next;
            res.next.next = t;
            t = res.next;
        }
        return res.next;
    }
}
