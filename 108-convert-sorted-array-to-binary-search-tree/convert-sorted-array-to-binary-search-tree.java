class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        return make(nums, 0, nums.length - 1);
    }

    public TreeNode make(int[] nums, int left, int right) {

        if (left > right)
            return null;

        int mid = (left + right) / 2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = make(nums, left, mid - 1);
        root.right = make(nums, mid + 1, right);

        return root;
    }
}