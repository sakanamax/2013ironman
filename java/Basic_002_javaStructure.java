// Comment 註解, 可以在任何地方進行註解, 此為單行註解的使用方式
/* 區塊註解開始 
區塊註解
在這個範圍之內的一律視為註解文字
區塊註解結束 */

// 文件註解先不討論 http://www.oracle.com/technetwork/java/javase/documentation/index-jsp-135444.html

/*
所以java檔案的基本結構為(由上而下)

1.package區塊

package
    用來宣告該檔案的類別屬於那個 Package (類別庫)
    必須放在程式最上方, 只能有一個
        如果沒有宣告就是 default
    套件管理以目錄的方式來管理
        同一個Package內的類別名稱不能重複
        相關的類別通常放在同一層目錄

2.import區塊

import
    匯入
        匯入現成套件中的類別, 來縮短開發時間
        必須位於 package 之下, 所有類別區之上
        include 與 import 的差異
            C / C++ 的 include 會把library在編譯時期就全部加入到程式中
            Java 的 import 不會匯入class 到程式內, 只是告知路徑


3.主類別區塊

主類別
    具有唯一性, 且只能有一個主類別
    包含 man() 方法, 為整個程式的執行起點
        main() 方法
            Java 以 main() 作為程式的主體
            在大括號{ } 所涵蓋的所有程式, 稱為程式區塊 (block), 又稱為main()方法 (main method)
            在Java程式中, 一個小的處理"工作"的單位,稱為敘述(statement), 以 ; 分號為結束. 會根據順序執行
    封裝等級必須宣告為public, 預設為public
    主類別名稱必須與檔名相同
    修飾字的宣只能為abstract / final 或是不寫

4.一般類別區塊


*/
public class Basic_002_javaStructure {
	public static void main(String args[]){
		System.out.println("To know java source code structure  ");
	}

}
