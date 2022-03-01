package javatest4_1;
import java.util.*;
import java.math.*;
//알고리즘을 수정해야함 
//전체적인 부분 수정
class rectangl{
	int x1;
	int x2;
	int y1;
	int y2;
	
	void set(int x1, int y1, int x2, int y2) {
		//좌표설정
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
		
	}
	public boolean check() {
		
		if ((this.x1>=this.x2)&&(this.y1<=this.y2))
			return false;
		else 
			return true;
	}
	public int getArea() {
		int a;
		int b;
		if(this.check()==true)
		{	a=this.x2-this.x1;
			b=this.y1-this.y2;
			return a*b;
		}
		else 
			return 0;
			
	}
	public void show() {
		
		if(this.check()==true) {
			getArea();
			System.out.printf("왼쪽상단 :(%d,%d)\n",this.x1,this.y1);
			System.out.printf("왼쪽하단 :(%d,%d)\n",this.x1,this.y2);
			System.out.printf("오른쪽상단 :(%d,%d)\n",this.x2,this.y1);
			System.out.printf("오른쪽상단 :(%d,%d)\n",this.x2,this.y2);
			System.out.println("직사각형의 넓이는 : "+ getArea());
		}
		else {
			System.out.print("직사각형 출력불가");
		}
		

	}
	public boolean equals(rectangl r) {
		
		rectangl t = new rectangl();
		int t_x= t.x2-t.x1;
		int t_y= t.y2-t.y1;
		int r_x= r.x2-r.x1;
		int r_y= r.y2-r.y1;
		if(t_x==r_x&&t_y==r_y) {
			return true;
		}
		else 
			return false;
		
	}
	
}

public class test4_1 {
	
	public static void main(String args[])
	{
		//rectangle rectangl;
		rectangl r = new rectangl();
		rectangl s = new rectangl();
		
		s.set(1,1,2,3);
		//r.show();
		s.show();
		System.out.println(s.getArea());
		r.set(2,1,4,5);
		r.show();
		System.out.println(r.getArea());
		if(r.equals(s))
			System.out.println("두 사각형은 같습니다.");
	}

	
}
