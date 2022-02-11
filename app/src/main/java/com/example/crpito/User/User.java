package com.example.crpito.User;

public class User {
    private String Mail;
    private String UserName;
    private String Password;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private String Name;

    public User(String mail, String userName, String password, String name) {
        Mail = mail;
        UserName = userName;
        Password = password;
        Name = name;
    }



    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
