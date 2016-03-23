package NaomiR;

/**
 * Created by nrris on 2/1/2016.
 */
public class Account {
/* challenege is create a bank application create fields for account number
balance, custiner name, email, and phone number
create getters and setters for each field
shortcut to includes cliking code, select generate, setters and getters and select
the field(variable name).

this program allows the customer to deposit funds, incrementing
 Also  allows customer to withdraw funds this should deduct from funds. customer is not allowed to withdrawal if it results to insufficient funds ( 0 dollars)
have prints outs of 2 methods
 */
    private  String accountnum;
    private   double balance;
    private String customer;
     private String email;
     private String phonenum;

    // 1st constructor
    public Account(){

        // below calling another constructor with parameters in an contructor with "this" method
        // optional to do this. only can do it when contructor is empty
        // if this empty constructor is called we need to create an object with default values
        // this object is written below with "this" method calling account constructor with all fields
        // the  "this" line has to always be written first in constructor
        // if you were to print no changes are made.
        // if you want pass values to show comment out all field paramters passed in main from account object
        // instead have Account myaccount=new Account(); to print out 56789 and 2.50
        this("56789",2.50, "default name","default email", "default phone num");

        System.out.println( " no parameters in this constructor");
    }

    // constructors could be an overload function.
    public Account (String accountnum, double balance, String customer, String email, String phonenum){
    System.out.println(" conctructor with parameters called");
        //setting field values in constructor this way
        // values autimatically updated in contructir account with paramters
        // this is the major contructor
        this.accountnum=accountnum;
        this.balance=balance;
        this.customer=customer;     // saves fields values directly
        this.email=email;
        this.phonenum=phonenum;



    }
    // adding constructor on intellij

// 3rd contructor contains customer name, email, and phone number
    public Account(String customer, String email, String phonenum) {
        // now calling  major contructor that updates field for account num
        // and balance.  The "this " method is calling major constructor and passinh
        // customer account num and balance as parameters to be used to update fields(variables)
       this("9999",100.55,customer,email,phonenum);
        this.customer = customer;
        this.email=email;
        this.phonenum=phonenum;
    }

    //method deposit will be passed a parameter called depositAmount
    // represents deposit amount
    public void deposit(double depositAmount){

        this.balance+=depositAmount;    // updating/setting balance field with depositAmount
        System.out.println(" Deposit of  " + depositAmount + " made. New balance  "+ this.balance);


    }

    public  void withdraw( double Wamount){

        if( this.balance-Wamount<=0){   //if the balance- wamount is zero, get message about not withdrawing
            System.out.println(" Only " + this.balance + " available.  Withdrawal not processed");
        }
        else{
            this.balance-=Wamount;
            System.out.println(" Withdrawal of " + Wamount + " processed. Remaining balance =" + this.balance);
        }
    }

/*

if fields are private... how can they be accessed?
accessor methods
Getter(a get method) ...ALLOWS other classes TO READ IN field.... field must be returned!
Setter( set method)...  allow other classes  to write into field

from youtube ,  https://www.youtube.com/watch?v=D3Arfy77Vok


 */


// getters allow main class and other classes to read from fields
    public String getAccountnum() {
        return accountnum;
    }

    public void setAccountnum(String accountnum) {
        this.accountnum = accountnum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


