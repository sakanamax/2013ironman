//這個範例我們練習利用 break 終止迴圈
//這邊嘗試匯入 java.io.* 來使用BufferReader

import java.io.*;
class Basic_018_break {
// 這邊因為使用BufferReader, 所以要 throws IOException
	public static void main(String[] args) throws IOException
	{
		System.out.println("請問要在第幾次終止迴圈呢? (1 ~ 10)");
		//產生一個 BufferedReader br 來接收輸入
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//str 由BufferedReader 的redLine()來取得使用者輸入的資料
		String str = br.readLine();
		//將str 轉成整數, 並宣告給 int 變數 num
		int num = Integer.parseInt(str);
		//建立一個 for 迴圈
		for (int i=1; i <= 10; i++)
		{
			System.out.println("第"+i+"次的迴圈");
			//如果 i 的值 等於 num 的值, 就執行 break 跳出迴圈
			if ( i == num )
			{
				break;
			}
		}

	}

}
