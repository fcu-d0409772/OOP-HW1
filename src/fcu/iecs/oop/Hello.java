package fcu.iecs.oop;

public class Hello {

  /**1072 物件導向設計實習(電腦學程資訊二)[2132] homework1.
 */
  public static void main(String[] args) {

    String lyrics = "Let it go! Let it go! Cannot hold it back anymore";
    
    // 1. 將 lyrics 字串中的 it 換成 "her"
    // 2. 將 lyrics 字串中的 Cannot 換成 Can't
    // 3. 將 轉換後的字串印出
    // 印出結果應該為 Let "her" go! Let "her" go! Can't hold "her" back anymore

    System.out.println(lyrics.replace("it", "\"her\"").replace("Cannot", "Can\'t"));

  }

}
