public class Main {

   public static void main(String[] args) {

       Player user = new Player("ユーザ");

       Player com = new Player("CPU");


       //入力指示表示

       System.out.println("1.グー");

       System.out.println("2.チョキ");

       System.out.println("3.パー");

       System.out.println("あなたの手を選択してください。>");

        //以降にテストコードを追加して検証を行う

        // System.out.println("テスト結果");

        // System.out.println(user.getHand().getHandName());



       //comの手を生成

       com.createRandomHand();

       //以降にテストコードを追加して検証を行う



   }

}
        