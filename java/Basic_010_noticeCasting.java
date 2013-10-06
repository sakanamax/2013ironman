//這個範例我們來觀察如果進行轉型要注意的小地方
class Basic_010_noticeCasting {
	public static void main(String[] args){
	//宣告兩個 int 變數, 並指定值
	int num1 = 5;
	int num2 = 4;
	System.out.println("num1= " + num1);
	System.out.println("num2= " + num2);
	//宣告一個double 變數 div 
	double div = num1 / num2;
	//顯示 div 輸出的結果, 但是由於 num1,num2 是整數, 所以輸出的值, 
	//不是我們期待中的1.25 而是整數所能輸出的1 然後再指定給div
	System.out.println("double div is  num1 / num2= "+ div);
	//宣告一個double 變數 div2, 並於 num1 以及 num2 前進行強制轉型
	double div2 = (double) num1 / (double) num2;
	//觀察輸出的結果
	System.out.println("double div2 is (double) num1 / (double) num2= " + div2);
	}
}
