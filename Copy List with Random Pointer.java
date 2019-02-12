import java.util.HashMap;
public class Solution {
    /**
     * @param head: The head of linked list with a random pointer.
     * @return: A new head of a deep copy of the list.
     用hashmap来减少时间复杂度
     */
    public RandomListNode copyRandomList(RandomListNode head) {
        // write your code here
        HashMap<RandomListNode,RandomListNode> map = new HashMap<RandomListNode,RandomListNode>();
        RandomListNode newhead = new RandomListNode(head.label);
        map.put(head,newhead);
        RandomListNode newp = newhead;
        RandomListNode oldp = head.next;
        while(oldp!=null){
            RandomListNode newnode = new RandomListNode(oldp.label);
            map.put(oldp,newnode);
            newp.next = newnode;
            oldp = oldp.next;
            newp = newp.next;
            
        }
        oldp = head;
        newp = newhead;
        while(oldp!=null){
            newp.random = map.get(oldp.random);
            oldp = oldp.next;
            newp = newp.next;
            }
                
        return newhead; 
        
    }
}
