package com.hunterparcells.csi2310.work.project2;

public class packetSelector {

    // Define packets, and initialize it to null.
    private static StackWork packets = null;

    public static void main(String[] args) {

        System.out.println("Packet selector is now running...\n");

        packets = new StackWork(10, 10, 10);

        packets.Push(95, 0);
        packets.Push(103, 0);
        packets.Push(81, 0);
        packets.Push(120, 0);
        packets.Push(74, 0);
        packets.Push(134, 0);
        packets.Push(62, 0);
        packets.Push(101, 0);
        packets.Push(59, 0);
        packets.Push(148, 0);

        packets.displayStackData();

        reorganizeNetworkTraffic();

        packets.displayStackData();

    }


    // Precondition: The StackWork object packets is different than null.
    // Postcondition: The elements of the stack S0 that are equal to, or less than 100, are inserted in the stack S1.
    // The elements of the stack S0 that are greater than 100 are inserted in the stack S2.
    public static void reorganizeNetworkTraffic() {
        while(packets.getS0top() != 0) {
            int value = packets.Pop(0);
            if(value <= 100) {
                packets.Push(value, 1);
            }else {
                packets.Push(value, 2);
            }
        }
    }

}       
