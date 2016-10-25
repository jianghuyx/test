package com.weixin.demo;

public class TestApp {
//	public static void getResult(){
//		int param1 = 5;
//		int param2 = 6;
//		getDataSum(param1,param2);
//	}
	
		public int getDataSum(int p1,int p2){
			int sum = 0;
			try{
				sum = p1+p2;
			}catch(Exception e){
				e.printStackTrace();
			}
			return sum;
		}
}
