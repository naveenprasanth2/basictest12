package org.example.linkedlist;

public class NodeEval {
    Node head = null;
    Node tail = null;

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public void addNodeAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
        }
    }

    public void addNodeAtBeginning(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            Node nextNode = head;
            head = newNode;
            head.next = nextNode;
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

//    public void main() {
//        NodeEval nodeEval = new NodeEval();
//        nodeEval.addNodeAtEnd(3);
//        nodeEval.addNodeAtEnd(4);
//        nodeEval.addNodeAtEnd(6);
//        nodeEval.addNodeAtEnd(2);
//        Node current = nodeEval.head;
//        while (current != null) {
//            System.out.println(current.val == 6 ? "the value is 6" :
//                    STR."The value of val is not 6 its \{current.val}" );
//            current = current.next;
//        }
//    }

//    public static void main(String[] args) {
//        NodeEval nodeEval = new NodeEval();
//        nodeEval.addNodeAtBeginning(3);
//        nodeEval.addNodeAtBeginning(4);
//        nodeEval.addNodeAtBeginning(6);
//        nodeEval.addNodeAtBeginning(2);
//        Node current = nodeEval.head;
//        while (current != null){
//            System.out.println(current.val);
//            current = current.next;
//        }
//    }

    public static void main(String[] args) {
        NodeEval nodeEval = new NodeEval();
        nodeEval.addNodeAtIndex(0, 5);
        nodeEval.addNodeAtIndex(0, 6);
        nodeEval.addNodeAtIndex(0, 7);
        nodeEval.addNodeAtIndex(0, 8);
        Node current = nodeEval.head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

}