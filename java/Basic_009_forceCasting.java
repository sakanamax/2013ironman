// 這個練習, 我們練習java 的強制資料型態轉換
class Basic_009_forceCasting {

	public static void main(String[] args){
	//宣告一個 dnum 變數為double, 值為160
	double dnum = 160;
	//使用 System.out.println 顯示出來
	System.out.println("身高為" + dnum + "公分");
	//宣告一個 integer 變數, 使用 dnum 指定過去
	//這邊使用強制轉型, 加上 (int) 轉成int資料型態
	int inum = (int) dnum;
	//使用 System.out.println 顯示出來
	System.out.println("身高為" + inum + "公分");
	//這個在編譯的過程就會有問題
	//觀察輸出的結果, 因為double 的佔用空間比較大
	//所以使用佔用空間比較大的 double 指定到int 這樣有問題的	
	//所以我們會使用強制轉型 (型態) 的方式來解決這個問題
	}
}
