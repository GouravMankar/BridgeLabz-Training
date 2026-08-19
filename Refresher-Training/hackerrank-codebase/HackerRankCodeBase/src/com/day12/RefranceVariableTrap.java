package com.day12;

//Q2. Reference Variable Trap [Medium]
//Write a Rectangle class with instance variables length and width, and a method scale(int factor) that
//multiplies both by the factor. In your Main class, create rect1 = new Rectangle(4, 5). Then write rect2 =
//rect1 (no 'new' keyword). Call rect2.scale(2). Predict, and then verify by printing, what rect1's length
//and width now show. Then modify the program so that rect2 becomes a genuinely independent copy of
//rect1 instead (so scaling rect2 does not affect rect1), without changing the Rectangle class itself - only
//using what a reference variable assignment does versus what 'new' does.
//Tests: rect1 shows the scaled values before the fix (proving aliasing), and remains unchanged after the fix
//(proving independence)
class Ractangle{
	int hight;
	int width;
	public Ractangle(int hight, int width) {
		super();
		this.hight = hight;
		this.width = width;
	}
	public Ractangle(Ractangle r) {
		this.hight=r.hight;
		this.width=r.width;
	}
}
public class RefranceVariableTrap {
public static void main(String[] args) {
	Ractangle r1=new Ractangle(12,15);
	Ractangle r2=r1;
	

	
}
}
