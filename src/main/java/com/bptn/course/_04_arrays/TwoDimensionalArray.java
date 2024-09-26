package com.bptn.course._04_arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] grades = {
				{85, 23},
				{20,40},
				{30, 45}
		};
		int max = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				if(grades[i][j] > max ) {
					 max = grades[i][j];
				}
			}
			System.out.println(max);
			max = 0;
		}
	}

}
