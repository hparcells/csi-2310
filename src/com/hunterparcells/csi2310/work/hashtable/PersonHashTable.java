package com.hunterparcells.csi2310.work.hashtable;

public class PersonHashTable {
    private final int size;
    private final PersonRecord[] table;

    public PersonHashTable(int size) {
        this.size = size;
        table = new PersonRecord[size];
    }

    public void insertNewRecord(PersonRecord personRecord) {
        long key = personRecord.getKey();

        int index = (int) key % this.size;

        int endpoint = index;
        do {
            if(table[index] == null) {
                table[index] = personRecord;
                break;
            }
            index++;

            if(index == this.size) {
                index = 0;
            }
        }while(index != endpoint);
    }

    public PersonRecord searchRecord(long searchKey) {
        // do later
        return null;
    }

    public void deleteRecord(long searchKey) {
        // do later
    }
}
