package com.hunterparcells.csi2310.work.project5;

public class packetRepository {
    public static void main(String[] args) {
        HT hashTable = new HT(10);

        System.out.println(hashTable);
        hashTable.add(new Packet(138934, "UDP", 80));
        System.out.println(hashTable);
        hashTable.add(new Packet(548393, "TCP", 21));
        System.out.println(hashTable);
        hashTable.add(new Packet(2938796, "UDP", 443));
        System.out.println(hashTable);

        hashTable.delete(123456);
        System.out.println(hashTable);
        hashTable.delete(2938796);
        System.out.println(hashTable);

        System.out.println(hashTable.search(8538));
        System.out.println(hashTable.search(138934));
    }
}
