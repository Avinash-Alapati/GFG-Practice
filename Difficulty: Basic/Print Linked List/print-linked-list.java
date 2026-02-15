/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

// Basic LinkedList
class Solution {
    public ArrayList<Integer> printList(Node head) {
        ArrayList<Integer> printLL = new ArrayList<>();
        
        Node temp = head;
        
        while (temp != null){
            printLL.add(temp.data);
            temp = temp.next;
        }
        return printLL;
    }
}