import java.io.*;

class Thread_meth extends Thread {

  Thread_meth(String name) {
    super(name);
  }

  public void run() {
    int i = 0;
    while (true) {
      System.out.println(getName());
      i++;
    }
  }
}

class Thread_meth1 extends Thread {

  Thread_meth1(String name) {
    super(name);
  }

  public void run() {
    int i = 0;
    while (i < 200) {
      System.out.println(getName());
      i++;
    }
  }
}

public class java_methods {

  public static void main(String[] args) {
    Thread_meth f1 = new Thread_meth("tony");
    Thread_meth1 f2 = new Thread_meth1("hulk");
    f2.start();
    try {
      f1.join();
    } catch (Exception e) {
      System.out.println(e);
    }

    // System.out.println("jhisisk");
    f1.start();
  }
}
