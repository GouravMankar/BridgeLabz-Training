package com.trainCompanion;

public class TrainCompanion {

    Node head;
    Node curr;

    // add compartments
    public void addCompartment(String name) {
        Node temp = new Node(name);

        if (head == null) {
            head = temp;
            curr = temp;
            return;
        }

        Node node = head;
        while (node.next != null) {
            node = node.next;
        }

        node.next = temp;
        temp.prev = node;
    }

    // display compartments
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " , ");
            temp = temp.next;
        }
        System.out.println();
    }

    // remove compartment
    public void removeCompartment(String name) {
        if (head == null) {
            System.out.println("No compartments to remove!");
            return;
        }

        Node temp = head;

        // if first node is to be removed
        if (head.data.equals(name)) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        while (temp != null) {
            if (temp.data.equals(name)) {

                if (temp.next == null) { // last node
                    temp.prev.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }

        System.out.println("Compartment not found!");
    }

    // move ahead
    public void moveAhead() {
        if (curr == null) {
            System.out.println("Please enter compartment!");
            return;
        }

        if (curr.next == null) {
            System.out.println("No next compartment");
            return;
        }

        curr = curr.next;
        System.out.println("Moved to " + curr.data);
    }

    // move backward
    public void moveBackward() {
        if (curr == null) {
            System.out.println("Please enter compartment!");
            return;
        }

        if (curr.prev == null) {
            System.out.println("No previous compartment!");
            return;
        }

        curr = curr.prev;
        System.out.println("Moved to " + curr.data);
    }

    // show adjacent compartments
    public void showAdjacentCompartment() {
        if (curr == null) {
            System.out.println("Enter Compartment!");
            return;
        }

        if (curr.next != null) {
            System.out.println("Next compartment is " + curr.next.data);
        } else {
            System.out.println("Next compartment is not available!");
        }

        if (curr.prev != null) {
            System.out.println("Previous compartment is " + curr.prev.data);
        } else {
            System.out.println("Previous compartment is not available!");
        }
    }
}
