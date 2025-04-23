public class bank {
    
        private double balance;
    
       
        public void deposit(double amount) {
            balance += amount;
        }
    
    
        public void checkBalance() {
            System.out.println("Balance: $" + balance);
        }
    
        public static void main(String[] args) {
            Bank myBank = new Bank();
            myBank.deposit(1000);  
            myBank.checkBalance(); 
        }
    }
    

