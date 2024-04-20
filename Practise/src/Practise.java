class Child1 implements Runnable{

    @Override
    public void run(){
        try{
        	System.out.println("Child1 thread entering into sleep state");
        	Thread.sleep(3000);
        	System.out.println("Child1 thread entered into sleep state");
        }catch(Exception e){
        	System.out.println("Child1 thread was interrupted");
        }
       
        for(int i = 0; i< 5; i++){
            System.out.println("Inside Child1 thread");
        }
    }
}

class Child implements Runnable{

    @Override
    public void run(){
        try{
        	Child1 c = new Child1();
            
            Thread t = new Thread(c);
            
        	System.out.println("Child thread entering into sleep state");
        	t.start();
        	t.join();
        	System.out.println("Child thread entered into sleep state");
        }catch(Exception e){
        	System.out.println("Child thread was interrupted");
        }
       
        for(int i = 0; i< 5; i++){
            System.out.println("Inside Child thread");
        }
    }
}

public class Practise{


    public static void main(String[] args) throws InterruptedException {
        
        Child c = new Child();
        
        Thread t = new Thread(c);
       

        t.start();
        t.interrupt();


        for(int i = 0; i< 5; i++){
            System.out.println("Inside main thread");
        }
        System.out.println("End of main thread");
        
    }
}