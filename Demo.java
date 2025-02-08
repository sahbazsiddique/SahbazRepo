package com.linkedlist;

public class LinkedListDemo {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void main(String[] args) {
        LinkedListDemo ll=new LinkedListDemo();
        head=new Node(2);
        head.next=new Node(6);
        head.next.next=new Node(90);
    }
}
