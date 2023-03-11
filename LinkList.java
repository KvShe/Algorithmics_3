package Algorithmics.homeworks.homework_3;

public class LinkList {
    private Node head;

    public static void main(String[] args) {
        LinkList list = new LinkList();

        for (int i = 0; i < 10; i++) {
            list.addFirst(i);
        }

        list.print();
        list.revers();
        System.out.println();
        list.print();
    }
    public void revers() {
        Node prev = null;
        Node node = head;

        while (node != null) {
            Node temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
        }

        head = prev;
    }
    public void addFirst(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
            return;
        }

        node.next = head;
        head = node;
    }

    public void print() {
        Node node = head;

        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
