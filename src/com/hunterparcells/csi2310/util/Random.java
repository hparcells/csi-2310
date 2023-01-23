package com.hunterparcells.csi2310.util;

import java.util.concurrent.ThreadLocalRandom;

public class Random {
    public static int randomRange(int low, int high) {
        return ThreadLocalRandom.current().nextInt(low, high + 1);
    }
}
