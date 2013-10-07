//這個範例要來練習if判斷式的撰寫
//因為要使用 BufferedReader, 所以要匯入 java.io.*;
import java.io.*;
class Basic_011_if {

	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入整數");
		//透過BufferedReader 來取使用者輸入的值
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//宣告一個字串 str 從使用者輸入中取得
		String str = br.readLine();
		//使用 Integer.parseInt()方法把 str的字串轉為 int
		int res = Integer.parseInt(str);
		
		//判斷 res 的值 是否為 1
		//如果 if 的程式只有一行, 就可以直接寫下去
		if(res == 1)
			//如果成真就執行顯示System.out.println()
			System.out.println("輸入的是1");
		//如果輸入的不是1 就顯示 結束	
		System.out.println("結束");

	}

}
