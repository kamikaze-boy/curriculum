package check;

import constants.Constants;

public class Check {
    
    private static String firstName ="光";
    private static String lastName ="黒濱";

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        System.out.println("printNameメソッド → " + printName(lastName, firstName));
        
/*課題①
【Check.java】にてフィールド変数firstNameとlastNameを宣言し、
firstName →　自分の名字　lastName →　自分の名前で初期化しなさい。
なお、変数のアクセス修飾子は「private」とする。

課題②
【Check.java】にてfirstNameとlastNameを引数で受け取って、
連結して表示させるメソッド「printName」を作成しなさい。
作成した関数のアクセス修飾子は「private」とする。

課題③
【Check.java】にてPetクラスとRobotPetクラスをインスタンス化して、下記の完成イメージを出力させなさい。*/
        Constants constants = new Constants();
        Pet pt = new Pet(constants.CHECK_CLASS_JAVA, constants.CHECK_CLASS_HOGE);
        pt.introduce();
        RobotPet rp = new RobotPet(constants.CHECK_CLASS_R2D2, constants.CHECK_CLASS_LUKE);
        rp.introduce();
    }
    
    private static String printName(String firstName, String lastName) {
        return firstName + lastName;
    
    }

}
