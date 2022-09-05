class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        return dfs(root,new ArrayList<>(),0);
    }
   private List<List<Integer>> dfs(Node node, List<List<Integer>> res, int level) {
        if (node == null) return res;
        if (res.size() == level) res.add(new ArrayList<>());
        res.get(level).add(node.val);
        for (Node child : node.children) dfs(child, res, level + 1);
        return res;
}
}
