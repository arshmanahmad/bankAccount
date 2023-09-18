class Bank{
    String name;
    long accountNumber;
    String accountType;
    double balanceAmount;
    
    Bank(String name,long accountNumber, String accountType, double balanceAmount){
        this.name= name;
        this.accountNumber = accountNumber;
        this.accountType =  accountType;
        this.balanceAmount = balanceAmount; 

    }
    void Deposit(double amount){
        if(amount>0){
            balanceAmount = balanceAmount + amount;
            System.out.println("The Deposited Amount is: " +amount);
            System.out.println("Now the total amount is: " +balanceAmount);

        }
        else{
            System.out.println("Invalid input.");
        }
    }
    void Withdraw(double withdraw){
        double remaining = balanceAmount-withdraw;
        if(withdraw>0 && withdraw<=balanceAmount){
            System.out.println("This is widthdraw amount "+ withdraw);
            System.out.println("This is the total amount "+balanceAmount);
            System.out.println("After withdrawal the remaining amount is: "+ remaining);
        }
        else{
            System.out.println("Insufficient Balance.");
        }
    }
    void Display(){
        System.out.println("Your name is "+ name);
        System.out.println("Your AccountNumber is: "+ accountNumber);
        System.out.println("Your AccountType is: "+ accountType);
        System.out.println("Your Total Amount is: "+ balanceAmount);
    }
    public static void main(String []args){
        Bank c1 = new Bank("Arshman",216373612,"Saving account",50000);
        c1.Display();
        System.out.println("----------------");
        c1.Deposit(12000);
        System.out.println("----------------");
        c1.Withdraw(10000);
        System.out.println("----------------");
        c1.Display();
    }

}