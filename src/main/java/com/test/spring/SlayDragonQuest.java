package com.test.spring;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {

    private PrintStream printStream;

    private Evil evil;

    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void embark() {
        printStream.println("Embarking on quest to slay the dragon");
        evil.resist();
    }

    public Evil getEvil() {
        return evil;
    }

    public void setEvil(Evil evil) {
        this.evil = evil;
    }
}
