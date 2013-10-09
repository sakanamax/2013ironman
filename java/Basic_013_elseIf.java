//這個範例我們介紹複數條件的判斷, 使用 else if 方式
//因為要使用 BufferedReader, 所以要匯入 java.io.*;

import java.io.*;
class Basic_013_elseIf {

	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入整數:");
		////透過BufferedReader 來取使用者輸入的值
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//宣告一個字串 str 從使用者輸入中取得
		String str = br.readLine();
		//使用 Integer.parseInt()方法把 str的字串轉為 int
		int res = Integer.parseInt(str);
		//判斷 res 的值 是否為 1
		if(res == 1)
		{
			System.out.println("輸入的值為1");
		}
		//使用 else if 進行下一個判斷
		else if(res == 2)
		{
			System.out.println("輸入的值為2");
		}
		//當以上皆非的時候執行下列程式
		else
		{
			System.out.println("請輸入 1 或是 2");
		}

	}

}
