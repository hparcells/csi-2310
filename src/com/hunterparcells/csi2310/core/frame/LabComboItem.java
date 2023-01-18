package com.hunterparcells.csi2310.core.frame;

import com.hunterparcells.csi2310.core.Runnable;

public class LabComboItem {
    private String display;
    private Runnable value;

    public LabComboItem(String display, Runnable value) {
        this.display = display;
        this.value = value;
    }

    public String toString() {
        if(this.getValue() != null) {
            return this.getValue().getFormattedName();
        }
        return this.getDisplay();
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public Runnable getValue() {
        return value;
    }

    public void setValue(Runnable value) {
        this.value = value;
    }
}
