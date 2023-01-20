package com.hunterparcells.csi2310.core.frame;

import com.hunterparcells.csi2310.core.Runnable;
import com.hunterparcells.csi2310.util.Logger;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabSelector extends JComboBox<LabComboItem> implements ActionListener {
    private Thread thread;

    public LabSelector(Runnable[] labs) {
        super();

        this.addItem(new LabComboItem("Select a lab...", null));
        for(Runnable lab : labs) {
            this.addItem(new LabComboItem(lab.getFormattedName(), lab));
        }

        this.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        LabComboItem labItem = (LabComboItem) this.getSelectedItem();

        if(labItem != null) {
            Logger.clear();
            Runnable lab = labItem.getValue();

            this.thread = new Thread(lab);
            thread.start();
        }
    }

    public Thread getThread() {
        return this.thread;
    }
}
