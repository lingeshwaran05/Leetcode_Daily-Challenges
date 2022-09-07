class Solution {
    public String tree2str(TreeNode t) {
        return t == null ? "" : t.val + (t.left != null ? "(" + tree2str(t.left) + ")" : t.right != null ? "()" : "")+ (t.right != null ? "(" + tree2str(t.right) + ")" : "");
    }
}
