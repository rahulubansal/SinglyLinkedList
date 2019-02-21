package main;

public class singlylinkedlist {
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
}
