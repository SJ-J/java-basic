package pack;

import pack.a.User;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User userA = new User();
        // class 명이 같으면 import는 하나만 됨
        pack.b.User userB = new pack.b.User();

    }
}
