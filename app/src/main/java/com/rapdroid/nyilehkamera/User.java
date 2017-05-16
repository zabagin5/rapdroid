package com.rapdroid.nyilehkamera;

/**
 * Created by M. HILMI PRASETYA on 5/12/2017.
 */

public class User {
    public String name;
    public String email;

    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
