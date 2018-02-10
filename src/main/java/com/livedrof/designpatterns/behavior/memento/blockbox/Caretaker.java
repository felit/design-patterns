package com.livedrof.designpatterns.behavior.memento.blockbox;

public class Caretaker {
    private MementoInter memento;

    public void setMemento(MementoInter memento) {
        this.memento = memento;
    }

    public MementoInter getMemento() {
        return memento;
    }
}

