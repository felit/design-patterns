package com.livedrof.designpatterns.behavior.memento.whitebox;

import java.util.Date;

public class Originator {

    private int state;
    private long dateTime;

    public void setState(int state) {
        this.state = state;
    }

    /**
     * 内部状态与其实际传的值不一样，所以称为内部状态
     *
     * @param date
     */
    public void setDate(Date date) {
        this.dateTime = date.getTime();
    }

    public Memento createMemento() {
        return new Memento(this.state, this.dateTime);
    }

    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
        this.dateTime = memento.getDateTime();
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state=" + state +
                ", dateTime=" + dateTime +
                '}';
    }
}
