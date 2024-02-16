class Thread_prio extends Thread {

  Thread_prio(String name) {
    super(name);
  }

  public void run() {
    int i = 0;
    while (i < 1000) {
      System.out.println(getName());
      i++;
    }
  }
}

public class java_priority {

  public static void main(String[] args) {
    Thread_prio bullet1 = new Thread_prio("A");
    Thread_prio bullet2 = new Thread_prio("B");
    Thread_prio bullet3 = new Thread_prio("ELONMUSK");

    bullet1.setPriority(Thread.MAX_PRIORITY);

    bullet1.start();
    bullet2.start();
    bullet3.start();
  }
}
