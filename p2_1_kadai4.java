
//口座番号、暗証番号、残高の値の設定、取得、表示
//入金、出金処理
package kadai4;

public class p2_1_kadai4 {
   public static void main(String[] args){
    //インスタンス化
    MyAccount m_acc = new MyAccount();

    //値の設定
    m_acc.setAccNum(36);
    m_acc.setPass(519);
    m_acc.setBalance(114680);

    //値の取得
    m_acc.getAccNum();
    m_acc.getPass();
    m_acc.getBalance();

    //値の取得
    System.out.println("Account Number: " + m_acc.getAccNum());
    System.out.println("Password: " + m_acc.getPass());
    System.out.println("Balance: " + m_acc.getBalance() + "JPY");

    //インスタンス化
    TestATM atm = new TestATM(m_acc);

    //課題[2]-1
    int deposit = 2500;
    System.out.println("Start deposit: " + deposit + "JPY");
    //入金処理
    atm.deposit(deposit);
    //入金後の残高表示処理
    atm.showCurrentBalance();

    //課題[2]-2
    int withdraw = 1100;
    System.out.println("Start withdraw: " + withdraw + "JPY");
    //出金処理
    atm.withdraw(withdraw);
    //出金後の残高表示処理
    atm.showCurrentBalance();

    //課題[2]-3
    withdraw = 1000000;
    System.out.println("Start withdraw; " + withdraw + "JPY");
    //出金処理
    atm.withdraw(withdraw);
    //残高表示処理
    atm.showCurrentBalance();
   }
}
