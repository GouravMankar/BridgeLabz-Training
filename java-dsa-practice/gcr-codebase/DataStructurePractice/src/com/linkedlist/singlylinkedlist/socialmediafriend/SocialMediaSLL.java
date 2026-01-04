package com.linkedlist.singlylinkedlist.socialmediafriend;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SocialMediaSLL {
    private UserNode head;

    public void addUser(int userId, String name, int age) {
        UserNode node = new UserNode(userId, name, age);
        node.next = head;
        head = node; // add at beginning
    }

    private UserNode findUserById(int id) {
        UserNode cur = head;
        while (cur != null) {
            if (cur.userId == id) return cur;
            cur = cur.next;
        }
        return null;
    }

    public UserNode search(Integer id, String name) {
        UserNode cur = head;
        while (cur != null) {
            if ((id != null && cur.userId == id) || (name != null && cur.name.equalsIgnoreCase(name))) return cur;
            cur = cur.next;
        }
        return null;
    }

    public boolean addFriend(int userA, int userB) {
        UserNode a = findUserById(userA);
        UserNode b = findUserById(userB);
        if (a == null || b == null || userA == userB) return false;
        if (!a.friendIds.contains(userB)) a.friendIds.add(userB);
        if (!b.friendIds.contains(userA)) b.friendIds.add(userA);
        return true;
    }

    public boolean removeFriend(int userA, int userB) {
        UserNode a = findUserById(userA);
        UserNode b = findUserById(userB);
        if (a == null || b == null) return false;
        boolean changed = a.friendIds.remove((Integer) userB);
        changed |= b.friendIds.remove((Integer) userA);
        return changed;
    }

    public void displayFriends(int userId) {
        UserNode u = findUserById(userId);
        if (u == null) { System.out.println("User not found."); return; }
        System.out.println("Friends of " + u.name + " (ID " + u.userId + "): " + u.friendIds);
    }

    public List<Integer> mutualFriends(int userA, int userB) {
        UserNode a = findUserById(userA);
        UserNode b = findUserById(userB);
        if (a == null || b == null) return Collections.emptyList();
        Set<Integer> setA = new HashSet<>(a.friendIds);
        List<Integer> mutual = new ArrayList<>();
        for (int id : b.friendIds) if (setA.contains(id)) mutual.add(id);
        return mutual;
    }

    public void countFriends() {
        UserNode cur = head;
        while (cur != null) {
            System.out.println(cur.name + " (ID " + cur.userId + ") has " + cur.friendIds.size() + " friends.");
            cur = cur.next;
        }
    }

    public void displayUsers() {
        System.out.println("Users:");
        UserNode cur = head;
        while (cur != null) {
            System.out.println("ID: " + cur.userId + ", Name: " + cur.name + ", Age: " + cur.age);
            cur = cur.next;
        }
    }
}
