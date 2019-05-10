package newcoder_15;

public class 链表的倒数第k个结点_14 {
	public ListNode FindKthToTail(ListNode head,int k) {
        ListNode res=new ListNode(0);
        res.next = head;
        ListNode front=res;
        ListNode end=res;
        for(int i=0;i<k;i++){
            end=end.next;
            if(end==null){
                return null;
            }
        }
        while(end!=null){
            end=end.next;
            front=front.next;
        }
        return front;
    }
}
