package com.hunterparcells.csi2310.core.frame;

import com.hunterparcells.csi2310.core.Lab;

public class LabComboItem {
    private String display;
    private Lab value;

    public LabComboItem(String display, Lab value) {
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

    public Lab getValue() {
        return value;
    }

    public void setValue(Lab value) {
        this.value = value;
    }
}
