package com.bptn.course._14_arraylist;

public class ArrayListDemo {
	public static void main(String[] args) {
		// default storage is for 10 items
		// ArrayList<String> myList = new ArrayList<>();
//		LinkedList<String> myList = new LinkedList<>();
//		List numbers = new ArrayList();
		// ArrayList numbers = new ArrayList<>();
		// HashMap<> map = new HashMap<>();

//		ArrayList<Integer> list1 = new ArrayList<Integer>();
//		list1.add(1);
//		list1.add(2);
//		list1.add(3);
//		list1.add(2, 4);
//		list1.add(5);
//		System.out.println(list1);
//
//		myList.add("hello");
//		myList.add("hi");
//		myList.remove("hi");
//		System.out.println(myList);

		int[] nums = { 3, 2, 4 };
		int target = 6;
		int f = nums[0];
		for (int i = 1; i < nums.length; i++) {
			// int next = 0;
			if (nums[i] + f == 6) {
				System.out.println(nums[i] + f);
			}

		}
	}
}
