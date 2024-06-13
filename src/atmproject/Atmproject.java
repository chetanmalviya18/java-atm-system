
package atmproject;

import java.util.Scanner;

class ATM
{
    float balance=5000f;
    int pin=5764;
    
   /* ATM()
    {
        System.out.println("Enter Your PIN :");
    }*/
    public void checkpin()
    {
        System.out.println("Enter your PIN: ");
        Scanner sc=new Scanner(System.in);
        int enteredpin=sc.nextInt();
        if(enteredpin==pin)
        {
            menu();
        }
        else
        {
            System.out.println("Enter Valid PIN");
            System.out.println("");
            checkpin();
        }
    }
    
    
    public void menu()
    {
        System.out.println("Enter Your Choice");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");
        

        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        
        if(opt==1)
        {
            checkBalance();
        }
        else if(opt==2)
        {
            withdraw();
        }
        else if(opt==3)
        {
            deposit();
        }
        else if(opt==4)
        {
            return;
        }
        else
        {
            System.out.println("Enter Valid Option");
        }
    }
    public void checkBalance()
    {
        System.out.println("Balance: "+balance);
        System.out.println("");
        menu();
    }
    public void withdraw()
    {
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc=new Scanner(System.in);
        float w=sc.nextFloat();
        if(w>balance)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            balance=balance-w;
            System.out.println("MONEY SUCCESSFULLY WITHDRAW");
   

        }
                            System.out.println("");

        menu();
    }
    public void deposit()
    {
        System.out.println("Enter Amount to Deposit: ");
        Scanner sc=new Scanner(System.in);
        float d=sc.nextFloat();
        balance=balance+d;
         System.out.println("MONEY SUCCESSFULLY DEPOSIT");
                            System.out.println("");

         menu();
    }
}

public class Atmproject {

    public static void main(String[] args) {
        ATM m=new ATM();
        m.checkpin();
    }
    
}
