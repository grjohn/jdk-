package newcoder_30;

public class 复杂链表的复制_25 {
	public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null) return null;
       //复制原始链表并创建新节点N'，把N'连接到N的后面
       RandomListNode pNode=pHead;
       while(pNode!=null){
           RandomListNode pClone=new RandomListNode(pNode.label);
           pClone.next=pNode.next;
           pClone.random=null;
           pNode.next=pClone;
           pNode=pClone.next;
       }
       
       //设置N'的random
       RandomListNode pNode2=pHead;
       while(pNode2!=null){
           if(pNode2.random!=null){
               pNode2.next.random=pNode2.random.next;
           }
           pNode2=pNode2.next.next;
       }
       //把长链表拆分成两个链表,奇数位置节点是原始链表，偶数位置的结点是复制后的链表
       RandomListNode pNode3=pHead;
       RandomListNode pCloneHead=null;
       RandomListNode pCloneNode=null;
       
       if(pNode3!=null){
           pCloneHead=pCloneNode=pNode3.next;
           pNode3.next=pCloneNode.next;
           pNode3=pNode3.next;
       }
       while(pNode3!=null){
           pCloneNode.next=pNode3.next;
           pCloneNode=pCloneNode.next;
           pNode3.next=pCloneNode.next;
           pNode3=pNode3.next;
       }
       
       return pCloneHead;
  }
}
