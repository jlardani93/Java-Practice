package com.lardani.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class TreeNode {
    private TreeNode parent;
    private List<TreeNode> children;
    private int data;

    public TreeNode(){
        this.parent = null;
        this.children = new ArrayList<>();
        this.data = 0;
    }

    /**
     * Find the size of the tree under it plus itself
     * @return
     */
    public int size() {
        if (children.size() == 0) {
            return 1;
        } else {
            return 1 + children.stream().reduce(
                    0,
                    (acc, val) -> acc + val.size(),
                    (x, y) -> x + y
                );
        }
    }

    public void addChild(TreeNode newChild) {
        newChild.setParent(this);
        this.children.add(newChild);
    }
}
