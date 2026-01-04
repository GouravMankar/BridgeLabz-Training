package com.linkedlist.singlylinkedlist.Inventorymanagementsystem;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        InventorySLL inv = new InventorySLL();
        inv.addLast("Basmati Rice", 501, 20, 120.0);
        inv.addFirst("Tur Dal", 502, 10, 160.5);
        inv.addAtPosition(2, "Sugar", 503, 15, 45.0);

        inv.display();

        System.out.println("Total value: ₹" + inv.totalValue());
        System.out.println("Update qty of ID 503 to 25: " + inv.updateQty(503, 25));
        System.out.println("Remove ID 502: " + inv.removeById(502));

        inv.display();

        inv.sort(true, true); // by name ascending
        System.out.println("Sorted by Name (ASC):");
        inv.display();

        inv.sort(false, false); // by price descending
        System.out.println("Sorted by Price (DESC):");
        inv.display();

        Node found = inv.search(501, null);
        System.out.println("Found ID 501: " + (found != null ? found.name : "Not found"));
    }
}