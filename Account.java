

public class Account extends Thread
{
	static int balance=1000;
	public void run()
	{
		synchronized (Account.class)
		{
			if(balance>=800)
			{
				System.out.println(Thread.currentThread().getName()+"Your Balance is "+balance +"So you can withdraw the amount");
				try
				{
					Thread.sleep(1000);
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				balance=200;
				System.out.println(Thread.currentThread().getName()+" After withdrawal of your balance is "+balance);
			}
			else
			{
				System.out.println(Thread.currentThread().getName()+" Your Balance is "+balance+" so u can't withdraw amount");
			}
		}
	}
}
