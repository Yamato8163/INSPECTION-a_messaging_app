package com.example.dx.messageapp;

/**
 * Created by DX on 04-Feb-18.
 */

public class Message {

    private String content,username;

    public Message(){

    }
    public Message(String content,String username)
    {
        this.content=content;
        this.username=username;
    }

    public String getContent() {
        return content;
    }

    public String getUsername() {
        return username;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
