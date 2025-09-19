package net.javaguide.LinkedList;

// DO NOT change the class name
// Write a function to reverse a singly linked list.
class LinkedList {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = new Node(data);
            return;
        }
        newNode.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
            last.next = newNode;
            return;
        }
    }

    public void printList(){
        Node tNode = head;
        while (tNode!=null){
            System.out.println(tNode.data +"");
            tNode = tNode.next;
        }
    }

    public static void main(String args[]) {
        LinkedList lst = new LinkedList();
        lst.append(1);
        lst.append(2);
        lst.append(3);
        lst.append(4);

        lst.reverse();
       lst.printList();
    }


}