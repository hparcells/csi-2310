package com.hunterparcells.csi2310.work.tree;

import com.hunterparcells.csi2310.core.Runnable;
import com.hunterparcells.csi2310.util.Logger;

import java.time.LocalDate;

public class TreeCode extends Runnable {
    public TreeCode() {
        this.setName("Tree");
        this.setDate(LocalDate.of(2023, 3, 27));
    }

    @Override
    public void run() {
        TreeNode root = new TreeNode("Hunter", null, null, null);
        root.insertNode("Alex");
        root.insertNode("Zach");
        root.insertNode("Bobby");
        root.insertNode("Caleb");
        root.insertNode("Dylan");
        Logger.log(root.branchToString());
        Logger.log(TreeNode.searchNode(root, "Dylan").getPlayerName());
    }
}
