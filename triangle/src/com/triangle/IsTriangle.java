package com.triangle;
/*
 * ����һ���������࣬������һ�����������εķ��������������ε������ߣ������ж�
 * ���������ǵȱ������Ρ����������λ���һ�������Ρ�
 */
public class IsTriangle {
	public String just(double a, double b, double c){
		//����ͨ������֮�ʹ��ڵ����ߣ�����ֻ��С�ڵ��������ж������Ƿ�Ϊһ��������
		if((a+b)>c && (a-b)<c && (b-a)<c 
			&& (b+c)>a && (b-c)<a && (c-b)<a
			&& (a+c)>b && (a-c)<b && (c-a)<b){
			//���������ȣ��򷵻صȱ�������
			if(a==b && b == c){ 
				return "equilateral";
			}
			//���ֻ����������ȣ��򷵻ص���������
			else if(a==b || a==c || b==c){
				return "isosceles";
			}
			//��������������ȣ��򷵻�һ��������
			else{
				return "scalene";
			}
		}
		//��������������ι����������򷵻ز���һ��������
		else{
			return "not a triangle";
		}}}
