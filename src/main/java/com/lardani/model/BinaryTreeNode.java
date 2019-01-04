package com.lardani.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class BinaryTreeNode {
    protected BinaryTreeNode parent;
    protected BinaryTreeNode left;
    protected BinaryTreeNode right;
    protected int data;

    public BinaryTreeNode(){
        this.parent = null;
        this.left = null;
        this.right = null;
        this.data = 0;
    }

    /**
     * Find the size of the tree under it plus itself
     * @return
     */
    public int size() {
        if (children().size() == 0) {
            return 1;
        } else {
            return 1 + children().stream().reduce(
                    0,
                    (acc, val) -> acc + val.size(),
                    (x, y) -> x + y
            );
        }
    }

    public List<BinaryTreeNode> children() {
        List<BinaryTreeNode> children = new ArrayList<>();
        if (left != null) children.add(left);
        if (right != null) children.add(right);
        return children;
    }
}
