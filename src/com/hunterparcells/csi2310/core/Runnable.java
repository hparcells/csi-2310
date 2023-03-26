package com.hunterparcells.csi2310.core;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Runnable implements java.lang.Runnable, IRunnable {
    private static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private String name;
    private LocalDate date;

    public String getFormattedName() {
        return this.getDate().format(dateFormat) + " - " + this.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public abstract void run();
}
