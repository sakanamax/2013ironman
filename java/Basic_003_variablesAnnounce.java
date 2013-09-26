class Basic_003_variablesAnnounce {

	public static void main(String arg[]){
		//宣告integer整數i, 並給予初值
		int i;
		i =100;
		//宣告boolean布林b, 並給予初值
		boolean b;
		b = false;
		//宣告float單精準度浮點數f, 並給予初值
		double d;
		d = 1.23;
		//宣告char字元 c, 並給予初值
		char c;
		c = 'c';
		//列出變數的值
		System.out.println("integer i="+i);
		System.out.println("boolean b="+b);
		System.out.println("double d="+d);
		System.out.println("char c="+c);
		System.out.println("=====我是分隔線=====");
		//觀察最大值,最小值, 長度
		//這個部份可以練習查詢API
		//可以到http://docs.oracle.com/javase/7/docs/api/ 進行查詢
		//以這邊的範例來說可以點選左上角 package 區內的 java.lang
		//然後點選畫面左邊 Class 內的 Integer 類別
		//就可以在Field Summary 內看到有 MAX_VALUE 可以使用
		System.out.println("Integer Max="+Integer.MAX_VALUE);
		System.out.println("Integer Min="+Integer.MIN_VALUE);
		System.out.println("Integer bits="+Integer.SIZE);
		System.out.println("=====我是分隔線=====");
		//Boolean 並沒有 MAX_VALUE
		System.out.println("Boolean Type="+Boolean.TYPE);
		System.out.println("=====我是分隔線=====");
		//Double 的相關資訊
		System.out.println("Double Max="+Double.MAX_VALUE);
		System.out.println("Double Min="+Double.MIN_VALUE);
		System.out.println("Double bits="+Double.SIZE);
		System.out.println("=====我是分隔線=====");
		//Char 的相關資訊	
		System.out.println("Char bits="+Character.SIZE);
	}

}
