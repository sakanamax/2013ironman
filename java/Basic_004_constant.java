class Basic_004_constant {
	public static void main(String[] args){
	//練習常數的宣告, 使用final 關鍵字宣告PI 為常數, 型態為float
	final float PI;
	//宣告 PI的值為 3.1416, 加上f 是告訴電腦他是浮點數, 不是double
	PI=3.1416f;
	// 列出 PI的值
	System.out.println("PI="+PI);
	//因為已經設定 final 關鍵字, 所以這邊如果在宣告一次PI的值編譯就會產生錯誤
	//PI=3.1415f;
	}
} 
