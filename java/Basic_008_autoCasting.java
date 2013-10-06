// 這個練習, 我們練習java 的自動資料型態轉換
class Basic_008_autoCasting {

	public static void main(String[] args){
	//宣告一個 inum 變數為整數 integer, 值為160
	int inum = 160;
	//使用 System.out.println 顯示出來
	System.out.println("身高為" + inum + "公分");
	//宣告一個 double 變數, 使用 inum 指定過去
	double dnum = inum;
	//使用 System.out.println 顯示出來
	System.out.println("身高為" + dnum + "公分");
	//觀察輸出的結果, 會顯示 160.0 公分, 因為double 的佔用空間比較大
	//所以使用佔用空間比較小的 int 指定到double 這樣是沒有問題的, 且會自動轉型	
	}
}
