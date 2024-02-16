class Thread1 implements Runnable {

  public void run() {
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
    System.out.println("im in a lambo");
  }
}

class Thread2 implements Runnable {

  public void run() {
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
    System.out.println("im in a rari");
  }
}

public class java2 {

  public static void main(String[] args) {
    Thread1 bullet1 = new Thread1();
    Thread2 bullet2 = new Thread2();
    Thread gun1 = new Thread(bullet1);
    Thread gun2 = new Thread(bullet2);

    gun1.start();
    gun2.start();
  }
}
