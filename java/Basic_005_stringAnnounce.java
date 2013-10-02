class Basic_005_stringAnnounce {
	public static void main(String[] args){
	//這個練習進行String的宣告練習
	//有關於String的詳細資訊可以看官方API 說明文件 
	//http://docs.oracle.com/javase/7/docs/api/java/lang/String.html 
	//可以透過兩種方式來宣告字串
	//第1種是原始資料型態的方式 String 字串物件的名稱=初始值;
	String str1 = "This is string 1";
	System.out.println("str1="+str1);
	//當然也可以先宣告型態在給值
	String str2;
	str2="str2 - Give value after announce";
	System.out.println("str2="+str2);
	//第2種方式是透過建構子(Constructor)的方式來宣告
	//宣告的方式為 String 字串物件的名稱 = new String(初始值);
	String str3 = new String("This is str3 by constructor");
	System.out.println("str3="+str3);
	//也可以在建立建構子的時候先不給值, 之後再來設定值的內容
	String str4 = new String();
	//這邊會看到如果沒有設定值, 預設是空字串
	System.out.println("str4 default value is="+str4);
	//接下來我們設定 str4 的值
	str4="str4 - Give value after announce";
	System.out.println("str4="+str4);
	//另外也可以直接使用 等號的方式來進行值的給予, 但是還是要宣告型態
	String str5;
	str5=str4;
	System.out.println("We use str5=str4, it will show  "+str5);
	//接下來研究如果變更str4的內容, 那str4 以及 str5 又會如何?
	str4="Change str4 value after give it's value";
	System.out.println("Try to find out, when str4 is change, what happen to str5?");
	System.out.println("str4="+str4);
	System.out.println("str5="+str5);
	}
}
