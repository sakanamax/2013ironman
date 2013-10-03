//這邊要匯入 java.io.Console 的類別庫來使用
import java.io.Console;
//這邊嘗試匯入 java.io.* 來使用BufferReader
import java.io.*;

class Basic_006_inputData {

// 這邊因為使用BufferReader, 所以要 throws IOException
	public static void main(String[] args) throws IOException{
	//產生物件實體 console1
	Console console1=System.console();
	//
	String str1;
	String str2;
	//這邊 System.out.print 並不會換行
	System.out.print("java.io.Console Test, Please input something: ");
	//透過console.readLine() 方法 將使用者輸入的資料給str1 值
	str1 = console1.readLine();
	//
	System.out.print("Your input with java.io.Console test is:");
	System.out.println(str1);
	//另外一種方式是透過 BufferedReader 來取得輸入
	System.out.print("BufferedReader test, Please input something: ");
	//產生一個 BufferedReader br 來接收輸入
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
	//str2 由BufferedReader 的redLine()來取得使用者輸入的資料
	str2 = br.readLine();
	//列出使用者輸入的結果
	System.out.println("Your input with BufferedReader test is: "+str2);
	//密碼輸入的處理
	//java.io.Console 提供了簡單readPassword() 方法, 輸入的時候不會顯示密碼
	//語法為  字元陣列=console.readPassword("提示字串");
	
	//宣告一個字元陣列
	char[] inputPW;
	
	//使用readPassword() 方式來取得密碼, 輸入的時候不會顯示在螢幕上面
	inputPW = console1.readPassword("Please input password: ");
	//
	System.out.println("Your password is: ");
	//這邊好像與上一行不可以合併顯示, 否則會產生亂碼
	System.out.println(inputPW);
	}
}
