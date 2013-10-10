//這個範例我們要來練習 do while 的迴圈

class Basic_017_doWhile {

	public static void main(String[] args) {
		//宣告一個 int 變數 i, 值為1
		int i = 1;
		// do while 與 while 的差別是 do while 會先執行程式, 但是 while 會先判斷
		//也就是說 do while 至少會執行一次
		do{
			//顯示目前是第 i 次的迴圈
			System.out.println("第"+i+"次的迴圈");
			//設定遞增條件避免無窮迴圈
			i++;
		//這邊則是在執行完之後才判斷 i 是否 <= 5, 如果成真就繼續執行
		}while( i <= 5);
		
		System.out.println("迴圈結束");

	}

}
