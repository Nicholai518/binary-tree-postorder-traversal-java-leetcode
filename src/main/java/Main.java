import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode nine = new TreeNode(9);
        TreeNode eight = new TreeNode(8);
        TreeNode seven = new TreeNode(7, eight, nine);

        TreeNode four = new TreeNode(4, null, seven);
        TreeNode two = new TreeNode(2, four, null);

        TreeNode six = new TreeNode(6);
        TreeNode five = new TreeNode(5);
        TreeNode three = new TreeNode(3, five, six);

        TreeNode root = new TreeNode(1, two, three);

        List answer = solution.postorderTraversal(root);

        System.out.print("Example One : ");
        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }
    }
}
