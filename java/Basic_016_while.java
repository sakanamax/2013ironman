//這個範例我們練習 while 敘述

class Basic_016_while {

	public static void main(String[] args) {
		//宣告 int 變數 i 為1
		int i = 1;
		//這邊while 會判斷條件式 i <=5 是否為真, 只要為真就會執行下面的區塊
		while ( i <= 5)
		{
			//列出第 i 次的迴圈
			System.out.println("第"+i+"次的迴圈");
			//對 i 進行遞增, 以免產生無窮迴圈
			i++;
		}
		//如果迴圈結束, 列印訊息
		System.out.println("迴圈結束");

	}

}
