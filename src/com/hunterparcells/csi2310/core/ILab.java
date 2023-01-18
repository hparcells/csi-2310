package com.hunterparcells.csi2310.core;

import java.time.LocalDate;

public interface ILab {
    String getFormattedName();

    String getName();

    void setName(String name);

    LocalDate getDate();

    void setDate(LocalDate date);
}
