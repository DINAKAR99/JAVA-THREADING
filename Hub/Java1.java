

class firstThread extends Thread{
    public void run(){
        int i=0; 
        while(i<1000){

            System.out.println("buggati ");i++;
        }
    }
}

class secondThread extends Thread{
    public void run(){

         int i=0; 
        while(i<1000){
        System.out.println("mustang ");i++;
            }
    }
}





public class Java1 {
    public static void main(String[] args) {
        firstThread a=new firstThread();
        secondThread b=new secondThread();

        a.start();
        b.start();
        
    }
}
