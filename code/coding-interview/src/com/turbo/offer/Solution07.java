package com.turbo.offer;

/**
 * @author yutao
 *
 * 输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *
 *
 * 前序遍历：根结点 ---> 左子树 ---> 右子树
 * 中序遍历：左子树---> 根结点 ---> 右子树
 * 后序遍历：左子树 ---> 右子树 ---> 根结点
 **/
public class Solution07 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        TreeNode treeNode = new TreeNode(preorder[0]);
        TreeNode leftTreeNode1 = new TreeNode(preorder[1]);
        treeNode.setLeft(leftTreeNode1);
        // 找出前序遍历数组的首节点（即根节点）在中序遍历数组中的位置
        binaryIndex(preorder[0],inorder);
        return null;
    }

    private int binaryIndex(int node, int[] inorder) {
        /*int ans = 0,left = 0,right = inorder.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(){

            }
        }*/
        return 0;
    }


    public class TreeNode {
      int val;

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }

        TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
