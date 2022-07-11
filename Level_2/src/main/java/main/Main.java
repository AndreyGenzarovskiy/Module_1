package main;
import task_2.TreeNode;

import static task_2.TreeNode.*;
public class Main {
    public static void main(String[] args){
        TreeNode a = new TreeNode(2);

        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(5);

        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(2);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        int maxLevel = a.maxLevel();
        System.out.println(maxLevel);
    }
}
