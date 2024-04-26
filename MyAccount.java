
//口座番号、暗証番号、残高の取得と設定
package kadai4;

public class MyAccount {
    private int m_accNum;//口座番号
    private int m_password;//暗証番号
    private int m_balance;//残高

    /*public MyAccount(){

    }*/

    public int getAccNum(){
        return this.m_accNum;
    }

    public void setAccNum(int accnum){
        this.m_accNum = accnum;
    }

    public int getPass(){
        return this.m_password;
    }

    public void setPass(int pass){
        this.m_password = pass;
    }

    public int getBalance(){
        return this.m_balance;
    }

    public void setBalance(int balance){
        this.m_balance = balance;
    }
}
