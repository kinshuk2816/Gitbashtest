package Account;

public class Account1 {

	private long accnum;
	private double balance;
	private person accholder;
	private static int counter=1001;
	
	
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Account1.counter = counter;
	}
	public long getAccnum() {
		return accnum;
	}
	public void setAccnum(long accnum) {
		this.accnum = accnum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	public person getAccholder() {
		return accholder;
	}
	public void setAccholder(person accholder) {
		this.accholder = accholder;
	}
	void deposit() {
       
	
	}
             
      
	  void withdraw() {
		  
		  
		  
	  }
	  
	  void getbalance() {
		  
		  
	  }
	  Account1(){
		  counter++;
	  }
	       void getAccount1Details(){
	    	   System.out.println(this.accnum+" "+this.accholder+" "+this.balance);
	       }
		public void setPerson(String name) {
			// TODO Auto-generated method stub
			
		}
	       
	    private static Account1[] dispalyAccount(Account1[] arr) {
				return arr;
		// TODO Auto-generated method stub
		
	}

			private static Account1[] addAccount(Account1[] arr) {
		// TODO Auto-generated method stub
		return arr;
	}
	    
	
}