package com.livedrof.designpatterns.memento.blockbox;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class TestMemento {
    private Originator originator;
    private Caretaker caretaker;

    @Before
    public void setUp() {
        this.originator = new Originator();
        this.caretaker = new Caretaker();
    }

    @Test
    public void test() {
        this.originator.setDate(new Date());
        this.originator.setState(100);
        //保存动作
        this.caretaker.setMemento(this.originator.createMemento());
        //保存后的更新，状态改变
        this.originator.setState(300);
        System.out.println(this.originator.toString());
        //Client不能访问其内部状态
//        this.caretaker.getMemento().getState();
        //恢复动作
        this.originator.restoreMemento(this.caretaker.getMemento());
        System.out.println(this.originator.toString());

    }
}
