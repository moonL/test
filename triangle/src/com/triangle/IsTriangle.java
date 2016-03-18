package com.triangle;
/*
 * 这是一个三角形类，其中有一个测试三角形的方法，输入三角形的三个边，可以判断
 * 此三角形是等边三角形、等腰三角形还是一般三角形。
 */
public class IsTriangle {
	public String just(double a, double b, double c){
		//首先通过两边之和大于第三边，两边只差小于第三边来判断输入是否为一个三角形
		if((a+b)>c && (a-b)<c && (b-a)<c 
			&& (b+c)>a && (b-c)<a && (c-b)<a
			&& (a+c)>b && (a-c)<b && (c-a)<b){
			//如果三边相等，则返回等边三角形
			if(a==b && b == c){ 
				return "equilateral";
			}
			//如果只有两条边相等，则返回等腰三角形
			else if(a==b || a==c || b==c){
				return "isosceles";
			}
			//如果三边两两不等，则返回一般三角形
			else{
				return "scalene";
			}
		}
		//如果不满足三角形构成条件，则返回不是一个三角形
		else{
			return "not a triangle";
		}}}
