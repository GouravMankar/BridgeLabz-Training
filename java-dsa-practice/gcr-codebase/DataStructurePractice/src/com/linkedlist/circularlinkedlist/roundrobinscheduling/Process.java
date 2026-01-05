package com.linkedlist.circularlinkedlist.roundrobinscheduling;
public class Process {

    private Node head;

    public void addProcess(int pid, int burst, int priority) {
        Node node = new Node(pid, burst, priority);

        if (head == null) {
            head = node;
            node.next = node;
            return;
        }

        Node tail = head;
        while (tail.next != head)
            tail = tail.next;

        tail.next = node;
        node.next = head;
    }

    public void displayQueue() {
        if (head == null) {
            System.out.println("Process Queue is empty");
            return;
        }

        Node temp = head;
        System.out.print("Queue: ");
        do {
            System.out.print("[P" + temp.pid + " BT=" + temp.burst + "] ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    private boolean removeByPid(int pid) {
        if (head == null) return false;

        if (head.pid == pid) {
            if (head.next == head) {
                head = null;
                return true;
            }
            Node tail = head;
            while (tail.next != head)
                tail = tail.next;

            head = head.next;
            tail.next = head;
            return true;
        }

        Node cur = head;
        while (cur.next != head && cur.next.pid != pid)
            cur = cur.next;

        if (cur.next == head) return false;

        cur.next = cur.next.next;
        return true;
    }

    // 🔁 Round Robin Scheduling
    public void roundRobin(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule");
            return;
        }

        int time = 0;
        int totalWT = 0;
        int totalTAT = 0;
        int completed = 0;

        while (head != null) {
            Node cur = head;
            int exec = Math.min(timeQuantum, cur.burst);

            cur.burst -= exec;
            time += exec;

            // waiting time for others
            Node temp = cur.next;
            while (temp != cur) {
                temp.waitingTime += exec;
                temp = temp.next;
            }

            System.out.println("Process P" + cur.pid +
                    " executed for " + exec + " units (Time=" + time + ")");
            displayQueue();

            if (cur.burst == 0) {
                cur.turnaroundTime = time;
                totalWT += cur.waitingTime;
                totalTAT += cur.turnaroundTime;
                completed++;

                removeByPid(cur.pid);
            } else {
                head = head.next;
            }
        }

        System.out.println("\n--- Scheduling Result ---");
        System.out.println("Total Processes: " + completed);
        System.out.println("Average Waiting Time: " + (double) totalWT / completed);
        System.out.println("Average Turnaround Time: " + (double) totalTAT / completed);
    }
}
