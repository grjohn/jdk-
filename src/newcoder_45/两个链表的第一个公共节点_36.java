package newcoder_45;

public class 两个链表的第一个公共节点_36 {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int length1 = 0,length2 = 0;
        ListNode l1 = pHead1;
        ListNode l2 = pHead2;
        while(l1!=null){
            length1++;
            l1= l1.next;
        }
         while(l2!=null){
            length2++;
            l2= l2.next;
        }
        l1 = pHead1;
        l2 = pHead2;
        if(length1>=length2){
            for(int i=0;i<length1-length2;i++){
                l1 = l1.next;
            }
        }
        else{
            for(int i=0;i<length2-length1;i++){
                l2 = l2.next;
            }
        }
        while(l1!=l2){
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1;
    }
}
