package com.example.nishant.animation;

/**
 * Created by nishant on 1/27/2017.
 */
public class Entry {
    private String name_entry;
    private String email_entry;
    protected String password_entry;


    private void save() {
        new UserDetail(name_entry, email_entry, password_entry);
    }

}
