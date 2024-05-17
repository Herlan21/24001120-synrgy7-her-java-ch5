package org.example;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public BankAccount(String accountNumber, double balance, String customerName, String customerEmail, String customerPhone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount; // Menambah saldo dengan jumlah yang dideposit
            System.out.println("Deposit sebesar " + amount + " berhasil. Saldo saat ini: " + this.balance);
        } else {
            System.out.println("Jumlah deposit harus lebih dari 0"); // Validasi untuk jumlah deposit yang tidak valid
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount; // Mengurangi saldo dengan jumlah yang diwithdraw
            System.out.println("Withdraw sebesar " + amount + " berhasil. Saldo saat ini: " + this.balance);
        } else if (amount > this.balance) {
            System.out.println("Saldo tidak mencukupi"); // Pesan error jika saldo tidak cukup
        } else {
            System.out.println("Jumlah withdraw harus lebih dari 0"); // Validasi untuk jumlah withdraw yang tidak valid
        }
    }

    public static void main(String[] args) {
        // Inisialisasi akun
    BankAccount account = new BankAccount("12345678", 5000.0, "John Doe", "john@example.com", "08123456789");

    // Menampilkan informasi awal akun
        System.out.println("Informasi Akun:");
        System.out.println("Nomor Akun: " + account.getAccountNumber());
        System.out.println("Nama Customer: " + account.getCustomerName());
        System.out.println("Email Customer: " + account.getCustomerEmail());
        System.out.println("Nomor Telepon Customer: " + account.getCustomerPhone());
        System.out.println("Saldo Awal: " + account.getBalance());
        System.out.println();

    // Melakukan deposit sebesar 1000.0 ke akun
        account.deposit(1000.0);

    // Melakukan withdraw sebesar 2000.0 dari akun
        account.withdraw(2000.0);

    // Mencoba withdraw lebih dari saldo yang ada (akan menghasilkan pesan error)
        account.withdraw(5000.0);
    }
}
