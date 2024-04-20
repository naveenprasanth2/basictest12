package org.example.linkedlist;

public class AddAtIndex {
    Node head = null;
    Node tail = null;

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public void addNodeAtIndex(int index, int val) {
        Node newNode = new Node(val);
        if (head == null && index != 0) {
            throw new IllegalArgumentException("Please insert in zero index");
        } else if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node nextNode = current.next;
            current.next = newNode;
            newNode.next = nextNode;
        }
    }

    public static void main(String[] args) {
        AddAtIndex addAtIndex = new AddAtIndex();
        addAtIndex.addNodeAtIndex(0, 5);
        addAtIndex.addNodeAtIndex(1, 6);
        addAtIndex.addNodeAtIndex(2, 7);
        addAtIndex.addNodeAtIndex(3, 8);
        Node current = addAtIndex.head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

}