package com.lardani.model;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeNodeTest {

    @Test
    public void verifyRoomIsChildlessOrphan() {
        TreeNode treeNode = new TreeNode(null, new ArrayList<>(), 0);
        assertNull(treeNode.getParent());
        assertEquals(treeNode.getChildren().size(), 0);
    }

    @Test
    public void size() {
        TreeNode treeNode  = new TreeNode(null, new ArrayList<>(), 0);
        treeNode.addChild(new TreeNode());
        treeNode.addChild(new TreeNode());
        treeNode.addChild(new TreeNode());
        assertEquals(treeNode.size(), 4);
    }
}