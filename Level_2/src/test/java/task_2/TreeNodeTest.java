package task_2;

import static org.junit.jupiter.api.Assertions.*;

class TreeNodeTest {

    @org.junit.jupiter.api.Test
    void maxLevel() {
        TreeNode a = new TreeNode(2);

        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(5);

        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(2);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        int expected = 3;
        int actual = a.maxLevel();
        assertEquals(expected, actual);
    }
}