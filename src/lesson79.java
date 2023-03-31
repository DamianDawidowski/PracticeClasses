public class lesson79 {

    public static void main(String[] args) {

//        BankAccount damianAccount = new BankAccount("12345", 10000,
//                "Damian", "dd@wp.pl", "3334444356");

//        BankAccount damianAccount = new BankAccount();



//        System.out.println(damianAccount.getAccountNumber());


//        BankAccount bankAccount = new BankAccount();
//        bankAccount.setCustomerName("Damian");
//        bankAccount.setEmail("dd@wp.pl");
//        bankAccount.setPhoneNumber("3334444356");
//        bankAccount.setAccountNumber(12345);
//        bankAccount.setAccountBalance(333);
//
//   //     bankAccount.setAccountBalance(100);

        BankAccount damianAccount = new BankAccount("Damian", "dd@wp.pl", "12345");
        System.out.println("AccountNo: "+ damianAccount.getAccountNumber()  +
                "; name " + damianAccount.getCustomerName());

        damianAccount.depositFunds(11);
        damianAccount.withdrawFunds(1100);
//    }

    }

}
