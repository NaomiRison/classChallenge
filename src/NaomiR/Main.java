package NaomiR;

public class Main {

    public static void main(String[] args) {
	// instructions for challenge  in account class

        Account myaccount=new Account("576", 0.0, " Bob Brown"," blueturtle@gmail.com",
                " 347-356-7589" );
// i called 2 fields to tes this
        /* output was
        conctructor with parameters called
        576
        0.0                                                                                                                                                                                                                 0.0
         */


        System.out.println(myaccount.getAccountnum());
        System.out.println(myaccount.getBalance());
/* now setting values for fields from class account in main:
// another way to place these values without a setter use constructor
        // constructor initialize objects
        // in class you will call contructor and type in parameters above

        myaccount.setAccountnum(2838);
        myaccount.setBalance(78.45);
        myaccount.setCustomer("Bob");
        myaccount.setEmail("blueturtle29@gmail.com");
        myaccount.getPhonenum("347-356-7589");
        */



        myaccount.withdraw (100.0);
        myaccount. deposit( 50.0);
        myaccount.withdraw(100.0);
        // calling contrutor with name, email, and phonenum
        //called 3rd cinturtor for 999 and passed Tim with making new object
        // only printed tim and 999 from 3rd contsructor
        Account timsAccount= new Account("Tim","tr.chrales@aol.com","347-784-5883");
        System.out.println(timsAccount.getAccountnum()+ " name "+ timsAccount.getCustomer()
        + " and the phone number is :" + timsAccount.getPhonenum());
        // notice when you type get, the name of the fields have capital letters for
        // first letter
        // you called the constructor with paramters of name, email and phone #
        // that same constructor calls the main constructor and passes account num and
        // and balance

    }
}


/*

output:


conctructor with parameters called
576
0.0
 Only 0.0 available.  Withdrawal not processed
 Deposit of  50.0 made. New balance  50.0
 Only 50.0 available.  Withdrawal not processed
 conctructor with parameters called
9999 name Tim and the phone number is :347-784-5883




 */

