//這個範例我們使用 continue 來練習改變迴圈執行流程
//這邊嘗試匯入 java.io.* 來使用BufferReader
import java.io.*;
class Basic_019_continue {
// 這邊因為使用BufferReader, 所以要 throws IOException
	public static void main(String[] args) throws IOException
	{
		System.out.println("要跳過第幾次的處理 (1~10)");
		////產生一個 BufferedReader br 來接收輸入
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//str 由BufferedReader 的redLine()來取得使用者輸入的資料
		String str = br.readLine();
		//將str 轉成整數, 並宣告給 int 變數 res
		int res = Integer.parseInt(str);
		//建立一個 for 迴圈
		for (int i=1; i<=10; i++)
		{
			if ( i == res)
			{
				//continue 會暫時停止執行, 然後回到迴圈
				continue;
			}
			System.out.println("第"+i+"次的處理次的處理");
		}

	}

}
