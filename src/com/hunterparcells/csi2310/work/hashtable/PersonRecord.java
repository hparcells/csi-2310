package com.hunterparcells.csi2310.work.hashtable;

public class PersonRecord {
    private String name;
    private long key;
    private int height;
    private String favoriteDinosaur;

    public PersonRecord(String name, long key, int height, String favoriteDinosaur) {
        this.name = name;
        this.key = key;
        this.height = height;
        this.favoriteDinosaur = favoriteDinosaur;
    }

    public long getKey() {
        return key;
    }
}
