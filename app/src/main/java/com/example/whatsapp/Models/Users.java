package com.example.whatsapp.Models;

public class Users {

    String profilepics , mail, username, password , userID , lastmessage;

    public Users(String profilepics, String mail, String username, String password, String userID, String lastmessage) {
        this.profilepics = profilepics;
        this.mail = mail;
        this.username = username;
        this.password = password;
        this.userID = userID;
        this.lastmessage = lastmessage;
    }

    public Users(){}

    //Sign-up constructor

    public Users(String username, String password, String userID) {
        this.username = username;
        this.password = password;
        this.userID = userID;
    }


    public String getProfilepics() {
        return profilepics;
    }

    public void setProfilepics(String profilepics) {
        this.profilepics = profilepics;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getLastmessage() {
        return lastmessage;
    }

    public void setLastmessage(String lastmessage) {
        this.lastmessage = lastmessage;
    }
}
