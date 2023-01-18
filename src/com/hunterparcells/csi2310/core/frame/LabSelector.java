package com.hunterparcells.csi2310.core.frame;

import com.hunterparcells.csi2310.core.Lab;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabSelector extends JComboBox<LabComboItem> implements ActionListener {
    public LabSelector(Lab[] labs) {
        super();

        this.addItem(new LabComboItem("Select a lab...", null));
        for(Lab lab : labs) {
            this.addItem(new LabComboItem(lab.getFormattedName(), lab));
        }

        this.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        LabComboItem labItem = (LabComboItem) this.getSelectedItem();

        if(labItem != null) {
            Lab lab = labItem.getValue();
            lab.run();
        }
    }
}
