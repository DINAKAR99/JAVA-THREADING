import java.io.*;

class Thread11 extends Thread {

  Thread11(String name) {
    super(name);
  }

  public void run() {
    System.out.println(getName());
  }
}

public class java3 {

  public static void main(String[] args) {
    Thread11 bullet1 = new Thread11("hello");
    bullet1.start();
    System.out.println(bullet1.threadId());
    // System.out.println("jhisisk");
  }
}
