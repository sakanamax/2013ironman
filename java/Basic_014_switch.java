//這個範例我們練習複數的判斷練習, 使用 switch 的方式來進行
//因為要使用 BufferedReader, 所以要匯入 java.io.*;

import java.io.*;
class Basic_014_switch {
	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入整數:");
		//透過BufferedReader 來取使用者輸入的值
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//宣告一個字串 str 從使用者輸入中取得
		String str = br.readLine();
		//使用 Integer.parseInt()方法把 str的字串轉為 int
		int res = Integer.parseInt(str);
		
		//使用 switch 的方式, 如果符合值就會進行程式, 直到遇到 break 為止
		switch (res){
		//這邊用的是冒號 :  case 後面列出條件的 值
		case 1:
			System.out.println("輸入值為1");
			//使用 break 來終止敘述
			break;
		case 2:
			System.out.println("輸入值為2");
			break;
		//如果都沒有符合, 則採取 default 的敘述
		default:
			System.out.println("請輸入 1 或是 2");
			break;
		}

	}

}
