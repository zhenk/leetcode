/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode p = new ListNode(0);
        p.next = head;
        ListNode q = head;
        int length = 0;
		for(;p.next!=null;p=p.next) length++;
		if(length!=0 && k > length){
		    k = k%length;    
		}
		for(int i = 0; i < length - k; i++){
			p.next = q;
			q = q.next;
			p = p.next;
			p.next = null;
		}
		return q;
    }
}
