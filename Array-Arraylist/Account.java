public class Account {
    private double balance;
    private int accNumber;
    private static int counter = 1000; // Atribut static untuk nomor akun otomatis

    public Account(double initBalance) {
        this.balance = initBalance;
        this.accNumber = ++counter; // Setiap objek baru dibuat, nomor akun bertambah
    }

    public int getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
