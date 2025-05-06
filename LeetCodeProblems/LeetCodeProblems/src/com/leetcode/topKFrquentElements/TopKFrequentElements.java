package com.leetcode.topKFrquentElements;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TopKFrequentElements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = scanner.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scanner.nextInt();
		}
		System.out.println("Enter the k value: ");
		int k = scanner.nextInt();
		int[] result = topKFrequent(nums, k);
		System.out.println("The values are: " + Arrays.toString(result));
		scanner.close();
	}

	public static int[] topKFrequent(int[] nums, int k) {
		if (k == nums.length) {
			return nums;
		}
		Map<Integer, Integer> count = new HashMap<>();
		for (int n : nums) {
			count.put(n, count.getOrDefault(n, 0) + 1);

		}
		Queue<Integer> heap = new PriorityQueue<>((a, b) -> count.get(a) - count.get(b));
		for (int n : count.keySet()) {
			heap.add(n);
			if (heap.size() > k) {
				heap.poll();
			}
		}
		int[] ans = new int[k];
		for (int i = 0; i < k; i++) {
			ans[i] = heap.poll();
		}
		return ans;
	}
}
