// 12) Write a Menu Driven program to perform following operation on Singly Linked List.
//      1. Insert node at end of link list.
//      2. Insert node at beginning of link list.
//      3. Insert node at particular position of link list.
//      4. Delete note from particular position from link list.
//      5. Display link list.

import java.util.Scanner;

// Node class representing a single node in the linked list
class Node {
    int data;
    Node next;

    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked list class
class SinglyLinkedList {
    private Node head;

    // Constructor
    public SinglyLinkedList() {
        this.head = null;
    }

    // Method to insert a node at the end of the linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Method to insert a node at the beginning of the linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to insert a node at a particular position in the linked list
    public void insertAtPosition(int data, int position) {
        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }
        if (position == 1) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position.");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Method to delete a node from a particular position in the linked list
    public void deleteFromPosition(int position) {
        if (position <= 0 || head == null) {
            System.out.println("Invalid position or empty list.");
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Invalid position.");
            return;
        }
        temp.next = temp.next.next;
    }

    // Method to display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// Main class
public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert node at end");
            System.out.println("2. Insert node at beginning");
            System.out.println("3. Insert node at particular position");
            System.out.println("4. Delete node from particular position");
            System.out.println("5. Display linked list");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at end: ");
                    int data1 = scanner.nextInt();
                    list.insertAtEnd(data1);
                    break;
                case 2:
                    System.out.print("Enter data to insert at beginning: ");
                    int data2 = scanner.nextInt();
                    list.insertAtBeginning(data2);
                    break;
                case 3:
                    System.out.print("Enter data to insert: ");
                    int data3 = scanner.nextInt();
                    System.out.print("Enter position to insert: ");
                    int position3 = scanner.nextInt();
                    list.insertAtPosition(data3, position3);
                    break;
                case 4:
                    System.out.print("Enter position to delete: ");
                    int position4 = scanner.nextInt();
                    list.deleteFromPosition(position4);
                    break;
                case 5:
                    System.out.print("Linked list: ");
                    list.display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
