package com.chentianran.eventreporter;

/**
 * Created by tianranchen on 7/10/17.
 */

public class Event {
    /**
     * All data for a event.
     */
    private String title;
    private String address;
    private String description;
    private int good;
    private int bad;
    private int commentNumber;
    private String id;
    private String location;
    private long time;
    private String username;

    /**
     * Constructor
     */
    public Event(String title, String address, String description) {
        this.title = title;
        this.address = address;
        this.description = description;
    }

    public Event() {}
    /**
     * Getters for private attributes of Event class.
     */
    public String getTitle() { return this.title; }
    public String getAddress() { return this.address; }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getGood() {
        return good;
    }

    public void setGood(int good) {
        this.good = good;
    }

    public int getBad() {
        return bad;
    }

    public void setBad(int bad) {
        this.bad = bad;
    }

    public int getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(int commentNumber) {
        this.commentNumber = commentNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
