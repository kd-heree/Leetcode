/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int gp = 1;
        ListNode prev = dummy;
        ListNode curr = head;
        while(curr != null){
             // Count actual number of nodes in current group
            int count = 0;
            ListNode temp = curr;

            while (temp != null && count < gp) {
                temp = temp.next;
                count++;
            }
            //reverse if group length is even
            if(count % 2 == 0){
                ListNode gpHead = curr;
                ListNode PrevNode = temp;
                ListNode next;
                for(int i = 0; i < count; i++){
                    next = curr.next;
                    curr.next = PrevNode;
                    PrevNode = curr;
                    curr = next;
                }
                // Connect previous group to reversed group
                prev.next = PrevNode;

                // Move prev to end of reversed group
                prev = gpHead;
            }else{
                //skip odd length group
                for(int i =0; i < count; i++){
                    prev = curr;
                    curr= curr.next;
                }
            }
            gp++;
        }
        return dummy.next;
    }
}