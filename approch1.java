package com.si.demo;

	public class Approach1 {
		int sid=21;
		static String sname="Aasrith";
		void display() {
			System.out.println("Aasrith is a Java Developer");
		}
		 static String display1(){
			return "hello";
		}
		public static void main(String[] args) {
			int roll=12;
			Approach1 s1=new Approach1();
			System.out.println(s1.sid);
			System.out.println(Approach1.sname);
			System.out.println(roll);
			s1.display();
			System.out.println(Approach1.display1());
			
		}

	}
