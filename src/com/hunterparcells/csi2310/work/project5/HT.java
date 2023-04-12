package com.hunterparcells.csi2310.work.project5;

public class HT {
    private final int size;
    private final Packet[] hashTable;

    public HT(int size) {
        this.size = size;
        hashTable = new Packet[size];
    }

    public int hash(Packet packet) {
        return packet.getSequenceNumber() % this.size;
    }

    public void add(Packet packet) {
        System.out.println();
        System.out.println("Adding packet " + packet.getSequenceNumber() + " at index " + this.hash(packet));
        this.hashTable[this.hash(packet)] = packet;
    }

    public void delete(int sequenceNumber) {
        int index = sequenceNumber % this.size;

        if(this.hashTable[index] == null || this.hashTable[index].getSequenceNumber() != sequenceNumber) {
            System.out.println();
            System.out.println("Packet " + sequenceNumber + " not found");
            return;
        }
        System.out.println();
        System.out.println("Deleting packet " + sequenceNumber + " at index " + index);
        this.hashTable[index] = null;
    }

    public Packet search(int sequenceNumber) {
        System.out.println();
        System.out.println("Looking for packet " + sequenceNumber);
        int index = sequenceNumber % this.size;

        if(this.hashTable[index] == null || this.hashTable[index].getSequenceNumber() != sequenceNumber) {
            System.out.println("Packet " + sequenceNumber + " not found");
            return null;
        }
        System.out.println("Packet " + sequenceNumber + " found");
        return this.hashTable[index];
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < this.size; i++) {
            if(this.hashTable[i] != null) {
                output.append(this.hashTable[i] + " ");
                continue;
            }
            output.append("x ");
        }
        return output.toString();
    }
}
