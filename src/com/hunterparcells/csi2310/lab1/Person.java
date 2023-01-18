package com.hunterparcells.csi2310.lab1;

/**
 * Person object.
 *
 * @author Hunter Parcells
 */
class Person {
    private String name;
    private int age;
    private double experience;

    /**
     * Creates a new Person object.
     *
     * @param name       The name of the person.
     * @param age        The age of the person
     * @param experience Experience in years.
     */
    public Person(String name, int age, double experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }
}
