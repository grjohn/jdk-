package newcoder_30;

import newcoder_15.ListNode;

public class 合并两个排序的链表_16 {
	public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode res = new ListNode(0);
        ListNode head = res;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                head.next = list1;
                list1 = list1.next;
                
            }
            else{
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
            
            
        }
        if(list1!=null){
                head.next = list1;
            }
            if(list2!=null){
                head.next = list2;
            }
        return res.next;
    }
}
