package com.hunterparcells.csi2310.work.project5;

public class Packet {
    private final int sequenceNumber;
    private final String protocol;
    private final int port;

    public Packet(int sequenceNumber, String protocol, int port) {
        this.sequenceNumber = sequenceNumber;
        this.protocol = protocol;
        this.port = port;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public String toString() {
        return sequenceNumber + ":" + protocol + ":" + port;
    }

    public String getProtocol() {
        return protocol;
    }

    public int getPort() {
        return port;
    }
}
