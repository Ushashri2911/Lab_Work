package lab;
class PrintEven implements Runnable {
    public void run() {
        for (int i=1;i<=100;i++) {
        	if(i%2==0)
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class PrintOdd implements Runnable {
    public void run() {
        for (int i=1;i<=100;i++) {
        	if(i%2!=0)
            System.out.print(i+"    ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class EvenOddThread {
    public static void main(String[] args) {
        Thread oddThread = new Thread(new PrintOdd());
        Thread evenThread = new Thread(new PrintEven());
        System.out.println("Odd Even");
        oddThread.start();
        evenThread.start();
    }
}
