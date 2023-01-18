package com.hunterparcells.csi2310.work.lab1;

import com.hunterparcells.csi2310.core.Runnable;
import com.hunterparcells.csi2310.util.Logger;

import java.time.LocalDate;

public class Lab1 extends Runnable {
    public Lab1() {
        this.setName("Lab 1");
        this.setDate(LocalDate.of(2023, 1, 18));
    }

    @Override
    public void run() {
        // Create new people.
        final Person[] people = {
                new Person("James", 20, 1.5),
                new Person("Robert", 21, 2.5),
                new Person("John", 22, 3.5)
        };

        // Log the data of the people.
        for(Person person : people) {
            Logger.log("Name: " + person.getName() + ", Age: " + person.getAge() + ", Experience: " + person.getExperience());
        }
    }
}
