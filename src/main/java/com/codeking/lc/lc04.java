package com.codeking.lc;

/**
 * @author CodeKing
 * @since 2023/5/15  14:45
 */
public class lc04 {
    public static void main(String[] args) {
        lc04 lc04 = new lc04();
        double v = lc04.findMedianSortedArrays(new int[]{1, 3}, new int[]{0, 0});
        System.out.println(v);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //直接合并数组
        int[] nums = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums, 0, nums1.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
        quickSort(nums, 0, nums.length - 1);
        if (nums.length % 2 == 0) {
            return (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2.0;
        }
        return nums[nums.length / 2];
    }


    void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return; // 递归终止条件，区间无需排序
        }

        int pivotIndex = partition(arr, left, right); // 获取分区点的索引

        quickSort(arr, left, pivotIndex - 1); // 对左子数组进行快速排序
        quickSort(arr, pivotIndex + 1, right); // 对右子数组进行快速排序
    }

    // 利用快排实现
    int partition(int[] arr, int left, int right) {
        int pivot = arr[left]; // 选择第一个元素作为枢轴元素
        int i = left + 1; // 从枢轴元素的下一个位置开始遍历
        int j = right;

        while (true) {
            while (i <= j && arr[i] <= pivot) {
                i++; // 从左侧找到第一个大于枢轴元素的元素
            }
            while (i <= j && arr[j] >= pivot) {
                j--; // 从右侧找到第一个小于枢轴元素的元素
            }

            if (i > j) {
                break; // 如果i和j交叉，结束循环
            }

            swap(arr, i, j); // 交换arr[i]和arr[j]
        }

        swap(arr, left, j); // 将枢轴元素放到正确的位置（分区点）

        return j; // 返回分区点的索引
    }

    void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

}
