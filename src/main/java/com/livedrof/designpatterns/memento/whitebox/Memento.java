package com.livedrof.designpatterns.memento.whitebox;

public class Memento {

    private int state;
    private long dateTime;

    public Memento(int state, long dateTime) {
        this.state = state;
        this.dateTime = dateTime;
    }

    public int getState() {
        return state;
    }

    public long getDateTime() {
        return dateTime;
    }
}
