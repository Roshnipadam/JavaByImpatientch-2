package com.random.kafka.com.learn;

import java.util.ArrayList;

public class ForteenNetwork {
    public class Member {
        private String name;
        private ArrayList<Member> friends;

        public Member(String name) {
            this.name = name;
            friends = new ArrayList<>();
        }

        public void leave() { members.remove(this); }
    }

    private ArrayList<Member> members = new ArrayList<>();

    public Member enroll(String name) {
        Member newMember = new Member(name);
        members.add(newMember);
        return newMember;
    }

    public void printMembers() {
        for (Member m : members) System.out.print(m.name + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        ForteenNetwork myFace = new ForteenNetwork();
        ForteenNetwork.Member fred = myFace.enroll("Fred");
       ForteenNetwork.Member helen = myFace.enroll("Helen");
        myFace.printMembers();
        fred.leave();
        myFace.printMembers();

    }
}
