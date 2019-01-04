package com.lardani.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class OrderedBinaryTreeNode {
    protected OrderedBinaryTreeNode parent;
    protected OrderedBinaryTreeNode left;
    protected OrderedBinaryTreeNode right;
    protected int data;

    public OrderedBinaryTreeNode(){
        this.parent = null;
        this.left = null;
        this.right = null;
        this.data = 0;
    }

    public OrderedBinaryTreeNode(int value){
        this();
        this.setData(value);
        // place in appropriate place on tree
    }

    public OrderedBinaryTreeNode(int value, OrderedBinaryTreeNode parent){
        this();
        this.setData(value);
        this.setParent(parent);
    }

    public void insert(int value) {
        if (value < data) {
            if (left == null) {
                left = new OrderedBinaryTreeNode(value, this);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new OrderedBinaryTreeNode(value, this);
            } else {
                right.insert(value);
            }
        }
    }

    public OrderedBinaryTreeNode getValue(int value) {
        if (data == value) {
            return this;
        } else if (value < data) {
            if (left == null) {
                return null;
            } else {
                return left.getValue(value);
            }
        } else {
            if (right == null) {
                return null;
            } else {
                return right.getValue(value);
            }
        }
    }

    /**
     * Removes the first node found under this tree with the given value from its parent and reassociates that node's
     * children with that node's parent
     * @param value The value of the node to be removed.
     * @return A boolean value signifing whether a node with that value was found and deleted
     */
    public boolean delete(int value) {
        //Logic around setting parent and rebalancing this part of tree
        if (data == value) {
            if (left != null) { left.setParent(parent); left = null; }
            if (right != null) { right.setParent(parent); right = null; }

            if (parent.getLeft() == this) parent.setLeft(null);
            if (parent.getRight() == this) parent.setRight(null);

            return true;
        } else if (value < data) {
            if (left != null) {
                return left.delete(value);
            } else {
                return false;
            }
        } else {
            if (right != null) {
                return right.delete(value);
            } else {
                return false;
            }
        }
    }
}
