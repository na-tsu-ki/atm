
//入金、出金、残高
package kadai4;

public class TestATM {
    private MyAccount m_myAcc;//口座クラス

    public TestATM(MyAccount Account){
        this.m_myAcc = Account;
    }

    //口座に入金
    public void deposit(int cash_deposit){
        int balance;
        balance = m_myAcc.getBalance();
        balance += cash_deposit;
        m_myAcc.setBalance(balance); 
    }

    //口座から出金
    public void withdraw(int cash_want){
        int balance;
        m_myAcc.getBalance();
        balance = m_myAcc.getBalance();
        if(balance - cash_want < 0){
            System.out.println("Can't withdraw: " + cash_want + "JPY");
            System.out.println("Your current balance is: " + m_myAcc.getBalance() + "JPY");
        }else{
            balance -= cash_want;
            m_myAcc.setBalance(balance);
        }
    }

    //残高を表示
    public void showCurrentBalance(){
        System.out.println("Current balance: " + m_myAcc.getBalance() + "JPY");
    }
}
