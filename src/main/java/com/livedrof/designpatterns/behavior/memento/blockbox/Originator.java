package com.livedrof.designpatterns.behavior.memento.blockbox;

import java.util.Date;

/**
 * 备忘发起者
 */
public class Originator {
    private int state;
    private long dateTime;

    public void setState(int state) {
        this.state = state;
    }

    public void setDate(Date date) {
        this.dateTime = date.getTime();
    }

    public MementoInter createMemento() {
        return new Memento(this.state, this.dateTime);
    }

    public void restoreMemento(MementoInter memento) {
        Memento m = (Memento) memento;
        this.state = m.getState();
        this.dateTime = m.getDateTime();
    }
}