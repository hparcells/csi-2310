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
            long start = System.currentTimeMillis();
            thread.start();

            try {
                this.thread.join();
                long end = System.currentTimeMillis();
                Logger.log("\n");
                Logger.log("------------------------");
                Logger.log("Code execution complete.");
                Logger.log("Time Elapsed: " + (end - start) + "ms");
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Thread getThread() {
        return this.thread;
    }
}
