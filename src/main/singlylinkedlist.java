package main;

public class singlylinkedlist {
    private node head=null;
    private int size=0;
    //method to insert a new node at the head

    private static class node {
        private int data;
        private node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }

        public node(int data, node next) {
            this.data = data;
            this.next = next;
        }

    }

    public static void main(String[] args) {
   singlylinkedlist linklist=new singlylinkedlist();

    }
}


