package com.linkedlist.singlylinkedlist.socialmediafriend;


public class SocialMediaFriends {
    public static void main(String[] args) {
        SocialMediaSLL social = new SocialMediaSLL();
        social.addUser(1, "Aman Gupta", 22);
        social.addUser(2, "Neha Joshi", 21);
        social.addUser(3, "Vikram Rao", 23);
        social.addUser(4, "Sara Khan", 20);

        social.displayUsers();

        System.out.println("\nAdd connections:");
        social.addFriend(1, 2);
        social.addFriend(1, 3);
        social.addFriend(2, 3);
        social.addFriend(3, 4);

        social.displayFriends(1);
        social.displayFriends(2);

        System.out.println("\nMutual friends of 1 and 2: " + social.mutualFriends(1, 2));

        System.out.println("\nRemove 1-3: " + social.removeFriend(1, 3));
        social.displayFriends(1);

        System.out.println();
        social.countFriends();
    }
}
