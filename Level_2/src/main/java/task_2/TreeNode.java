package task_2;

import java.util.ArrayList;

public class TreeNode {
        int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int x) { val = x; }
       public int maxLevel() {
            int maxLevel = 0;
            ArrayList<Integer> aList = new ArrayList<>();
            getFinalLevels(maxLevel + 1, aList);
            return getMaxIndexOfArray(aList);
        }
        public void getFinalLevels(int currentMaxLevel, ArrayList<Integer> aList)
        {
            if(left != null)
            {
                left.getFinalLevels( currentMaxLevel + 1, aList );
            }
            else if(right != null)
            {
                right.getFinalLevels( currentMaxLevel + 1, aList );
            }
            else
            {
                aList.add(currentMaxLevel);
            }
        }

        public static int getMaxIndexOfArray(ArrayList<Integer> array) {
        int max = array.get(0);
        for (var element : array) {
            if (max < element) {
                max = element;
            }
        }
        return max;
    }
}
