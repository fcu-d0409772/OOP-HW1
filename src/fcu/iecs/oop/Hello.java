package fcu.iecs.oop;

public class Hello {

  /**1072 ����ɦV�]�p���(�q���ǵ{��T�G)[2132] homework1.
 */
  public static void main(String[] args) {

    String lyrics = "Let it go! Let it go! Cannot hold it back anymore";
    
    // 1. �N lyrics �r�ꤤ�� it ���� "her"
    // 2. �N lyrics �r�ꤤ�� Cannot ���� Can't
    // 3. �N �ഫ�᪺�r��L�X
    // �L�X���G���Ӭ� Let "her" go! Let "her" go! Can't hold "her" back anymore

    System.out.println(lyrics.replace("it", "\"her\"").replace("Cannot", "Can\'t"));

  }

}
