package com.linkedlist.singlylinkedlist.Inventorymanagementsystem;

public class InventorySLL {
    private Node head;

    // Add beginning
    public void addFirst(String name, int id, int qty, double price) {
        Node node = new Node(name, id, qty, price);
        node.next = head;
        head = node;
    }

    // Add end
    public void addLast(String name, int id, int qty, double price) {
        Node node = new Node(name, id, qty, price);
        if (head == null) { head = node; return; }
        Node cur = head;
        while (cur.next != null) cur = cur.next;
        cur.next = node;
    }

    // Add at position
    public boolean addAtPosition(int pos, String name, int id, int qty, double price) {
        if (pos <= 0) return false;
        if (pos == 1) { addFirst(name, id, qty, price); return true; }
        Node cur = head;
        int idx = 1;
        while (cur != null && idx < pos - 1) { cur = cur.next; idx++; }
        if (cur == null) return false;
        Node node = new Node(name, id, qty, price);
        node.next = cur.next;
        cur.next = node;
        return true;
    }

    // Remove by ID
    public boolean removeById(int id) {
        if (head == null) return false;
        if (head.id == id) { head = head.next; return true; }
        Node cur = head;
        while (cur.next != null && cur.next.id != id) cur = cur.next;
        if (cur.next == null) return false;
        cur.next = cur.next.next;
        return true;
    }

    // Update quantity by ID
    public boolean updateQty(int id, int newQty) {
        Node cur = head;
        while (cur != null) {
            if (cur.id == id) { cur.qty = newQty; return true; }
            cur = cur.next;
        }
        return false;
    }

    // Search by ID or Name
    public Node search(Integer id, String name) {
        Node cur = head;
        while (cur != null) {
            if ((id != null && cur.id == id) || (name != null && cur.name.equalsIgnoreCase(name))) return cur;
            cur = cur.next;
        }
        return null;
    }

    // Total inventory value
    public double totalValue() {
        double sum = 0.0;
        Node cur = head;
        while (cur != null) {
            sum += cur.qty * cur.price;
            cur = cur.next;
        }
        return sum;
    }

    // Display items
    public void display() {
        if (head == null) { System.out.println("Inventory empty."); return; }
        System.out.println("Inventory (SLL):");
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.name + " | ID: " + cur.id + " | Qty: " + cur.qty + " | Price: ₹" + cur.price);
            cur = cur.next;
        }
    }

    // Merge sort by name or price, asc/desc
    public void sort(boolean byName, boolean ascending) {
        head = mergeSort(head, byName, ascending);
    }

    private Node mergeSort(Node h, boolean byName, boolean asc) {
        if (h == null || h.next == null) return h;
        Node mid = getMiddle(h);
        Node nextToMid = mid.next;
        mid.next = null;
        Node left = mergeSort(h, byName, asc);
        Node right = mergeSort(nextToMid, byName, asc);
        return merge(left, right, byName, asc);
    }

    private Node getMiddle(Node h) {
        Node slow = h, fast = h.next;
        while (fast != null && fast.next != null) {
            slow = slow.next; fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node a, Node b, boolean byName, boolean asc) {
        Node dummy = new Node("", -1, 0, 0.0);
        Node tail = dummy;
        while (a != null && b != null) {
            int cmp = byName ? a.name.compareToIgnoreCase(b.name)
                             : Double.compare(a.price, b.price);
            boolean takeA = asc ? (cmp <= 0) : (cmp >= 0);
            if (takeA) { tail.next = a; a = a.next; }
            else { tail.next = b; b = b.next; }
            tail = tail.next;
        }
        tail.next = (a != null) ? a : b;
        return dummy.next;
    }
}