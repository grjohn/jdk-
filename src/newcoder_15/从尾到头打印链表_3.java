package newcoder_15;

import java.util.*;

public class 从尾到头打印链表_3 {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList();
        help(res,listNode);
        return res;
    }
    public void help(List<Integer> res,ListNode l){
        if(l==null){
            return;
        }
        help(res,l.next);
        res.add(l.val);
        return;
    }
}
