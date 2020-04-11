class EvenOddSum {
	
	public static void main(String args[]) {
		Count first = new Count();
		
		try {
			while(first.iThread.isAlive()) {
				System.out.println("The Thread is working!");
				Thread.sleep(1500); 
	          }
		    }
		catch(InterruptedException e) {
			System.out.println(first + "Error");
		                              }
	}
	
}
