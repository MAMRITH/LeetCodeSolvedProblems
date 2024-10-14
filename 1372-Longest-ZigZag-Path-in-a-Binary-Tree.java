class Solution {
   public int longestZigZag(TreeNode root) 
    {
        return longest(root, 0);
    }
    public int longest(TreeNode root, int dir) 
    {
        if (root == null)    return 0;
        int max = 0, leftCount = 0;
        boolean lastLeft = true;
        TreeNode cur = root.left;
        while (cur != null) {
            leftCount++;
            if (lastLeft) {
                max = Math.max(longest(cur.left, 2), max);
                cur = cur.right;
            } else {
                max = Math.max(longest(cur.right, 1), max);
                cur = cur.left;
            }
            lastLeft = !lastLeft;
        }
        int rightCount = 0;
        lastLeft = false;
        cur = root.right;
        while (cur != null) {
            rightCount++;
            if (lastLeft) {
                max = java.lang.Math.max(longest(cur.left, 2), max);
                cur = cur.right;
            } else {
                max = java.lang.Math.max(longest(cur.right, 1), max);
                cur = cur.left;
            }
            lastLeft = !lastLeft;
        }
        if (dir == 1)    leftCount++;
        else if (dir == 2)    rightCount++;
        return Math.max(Math.max(leftCount, rightCount), max);
    }
}