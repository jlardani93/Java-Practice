package com.lardani.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderedBinaryTreeNodeTest {

    @Test
    public void insert() {
        OrderedBinaryTreeNode root = new OrderedBinaryTreeNode();
        root.insert(1);
        assertEquals(root.right.getData(), 1);
        root.insert(-1);
        assertEquals(root.left.getData(), -1);
        root.insert(2);
        assertEquals(root.right.right.getData(), 2);
    }

    @Test
    public void getValue() {
        OrderedBinaryTreeNode root = new OrderedBinaryTreeNode();
        root.insert(1);
        root.insert(2);
        root.insert(5);
        root.insert(3);
        assertEquals(root.getValue(4), null);
        assertEquals(root.getValue(3).getData(), 3);
    }

    @Test
    public void delete() {
        OrderedBinaryTreeNode root = new OrderedBinaryTreeNode();
        root.insert(1);
        root.insert(2);
        root.insert(5);
        root.insert(3);
        assertEquals(root.delete(1), true);
        assertEquals(root.delete(1), false);
        assertEquals(root.getValue(2).getParent(), root);
    }
}