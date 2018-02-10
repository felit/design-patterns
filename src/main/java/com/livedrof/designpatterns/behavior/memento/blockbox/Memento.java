package com.livedrof.designpatterns.behavior.memento.blockbox;

public class Memento implements MementoInter {

    private int state;
    private long dateTime;

    public Memento(int state, long dateTime) {
        this.state = state;
        this.dateTime = dateTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public long getDateTime() {
        return dateTime;
    }

    public void setDateTime(long dateTime) {
        this.dateTime = dateTime;
    }
}
