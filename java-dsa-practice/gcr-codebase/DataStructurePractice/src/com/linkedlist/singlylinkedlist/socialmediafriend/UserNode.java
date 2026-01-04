package com.linkedlist.singlylinkedlist.socialmediafriend;

import java.util.ArrayList;
import java.util.List;

public class UserNode {
    public int userId;
    public String name;
    public int age;
    public List<Integer> friendIds;
    public UserNode next;

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}
