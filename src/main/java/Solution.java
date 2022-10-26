import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        // depth first search
        return dfs(root, new ArrayList());
    }

    private List<Integer> dfs(TreeNode root, List<Integer> list) {
        // base case
        if (root == null) {
            return list;
        }

        // left
        list = dfs(root.left, list);

        // right
        list = dfs(root.right, list);

        // node
        list.add(root.val);

        return list;
    }
}
