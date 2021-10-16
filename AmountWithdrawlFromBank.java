package com.bridgelabz.objectOrientedPrograms;
import com.bridgelabz.utility.BankDetails;
public class AmountWithdrawlFromBank {
	
	   public static void main(String[] args) {
	        int account_No;
	        String name;
	        float amount;

	        BankDetails utility=new BankDetails();
	        System.out.println("Enter Your Name : ");
	        name= utility.getString();
	        System.out.println("Enter Your Account Number : ");
	        account_No= utility.getIntValue();
	        System.out.println("Enter amount you want to Deposit : ");
	        amount= utility.getFloatValue();
	        int flag=0;
	        while (flag==0){
	            float amount1=utility.depositOrWithdrow(name,account_No,amount);
	            System.out.println("Enter your Choice : 1. Repeat 2.Display details 3.Exit");
	            int option= utility.getIntValue();
	            if (option==2){
	                utility.displayDetails(name,account_No,amount1);
	            }
	            if (option==3){
	                flag=1;
	            }
	        }
	    }
}
