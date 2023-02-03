public class AccessModifier {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "AyushGupta";
        myAcc.SetPasword("abcdefghijklmnopqrstuvwxyz");
    }
}

class BankAccount {
    public String username;
    private String password;
    public void SetPasword(String pwd)
    {
        password = pwd;
    }
}

