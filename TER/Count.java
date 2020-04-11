public class Count implements Runnable {

	Thread iThread;
	
	Count() {
		
		iThread = new Thread(this, "Numbers");
		System.out.println(iThread + "was Created");
		
		iThread.start();
		System.out.println(iThread + "was Started");
	}
	public void run() {

		try {
			int even = 2;
      int result = 0;
			for(int i = 1; i < 12 ; i++)  {
				if (i % even == 0) {
					System.out.println(i + " is an even number");
					Thread.sleep(1000);
          result += i;
          System.out.println("Result of sum of even numbers is " + result);
          } 
				else {
					System.out.println(i + " is an odd number");
					Thread.sleep(1000);
          result += i;
          System.out.println("Result of sum of odd numbers is " + result);
          }
			                          }
		    }
		catch(InterruptedException e)
		{
			System.out.println("Error");
		}
		System.out.println("The Thread has finished");
	  }

}
