//這個範例主要進行算術運算子練習
class Basic_007_arithmeticOperators {

	public static void main(String[] args){

	//宣告整數 x 以及 y
	int x,y;
	//給與 x, y 值
	x = 20;
	y = 7;
	//列出 x, y 的值
	System.out.println("x="+x);
	System.out.println("y="+y);
	//開始進行算術運算子 加減乘除 的部份
	System.out.println("x + y= " + (x+y));
	System.out.println("x - y= " + (x-y));
	System.out.println("x * y= " + (x*y));
	System.out.println("x / y= " + (x/y));
	//使用 % 來取得 x 除以 y 的餘數
	System.out.println("x % y= " + (x%y));
	System.out.println("-----------------------------------------------");
	//接下來試試看遞增 遞減
	int a, b, c;
	a = 10;
	//顯示a 的值
	System.out.println("a= "+a);
	//使用 a++ 遞增 但是 ++ 放在後面
	a++;
	System.out.println("After a++, a= " + a);
	//這邊因為是使用 a++, 會先將a的值給b 之後才會+1
	b=a++;
	System.out.println("b=a++, b= "+ b);
	System.out.println("now, a= " + a);
	//這邊因為是使用 ++a, 所以先會 +1 再給c 的值
	c=++a;
	System.out.println("c=++a, c= " + c);

	}
}
