public class Main {
    public static void main(String[] args) {
        Bank myBank = new Bank();

        myBank.addCustomer("Budi", "Santoso");
        myBank.addCustomer("Ani", "Lestari");

        Customer customer1 = myBank.getCustomer(0);

        Account accBudi1 = new Account(1000000.0);
        Account accBudi2 = new Account(500000.0);
        
        customer1.addAccount(accBudi1);
        customer1.addAccount(accBudi2);

        accBudi1.deposit(250000.0);
        accBudi1.withdraw(100000.0);

        System.out.println("=== INFORMASI SISTEM PERBANKAN ===");
        System.out.println("Total Nasabah Bank: " + myBank.getNumOfCustomers());
        System.out.println("\nNasabah 1: " + customer1.getFirstName() + " " + customer1.getLastName());
        System.out.println("Jumlah Rekening Dimiliki: " + customer1.getNumOfAccounts());
        
        System.out.println("\n--- Detail Rekening 1 ---");
        System.out.println("Nomor Akun : " + customer1.getAccount(0).getAccNumber());
        System.out.println("Saldo Akhir: Rp " + customer1.getAccount(0).getBalance());

        System.out.println("\n--- Detail Rekening 2 ---");
        System.out.println("Nomor Akun : " + customer1.getAccount(1).getAccNumber());
        System.out.println("Saldo Akhir: Rp " + customer1.getAccount(1).getBalance());
    }
}
