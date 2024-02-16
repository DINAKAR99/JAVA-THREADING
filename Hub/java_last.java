class last_1 extends Thread {

  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }
    // try {
    //   Thread.sleep(5000);
    // } catch (InterruptedException e) {
    //   // TODO Auto-generated catch block
    //   e.printStackTrace();
    // }
  }
}

public class java_last {

  public static void main(String[] args) {
    last_1 l1 = new last_1();

    System.out.println("THE STATE IS :" + l1.getState());
    l1.start();
    System.out.println("THE STATE IS :" + l1.getState());

    System.out.println("THE STATE IS :" + l1.getState());
    System.out.println("THE STATE IS :" + l1.getState());
  }
}
