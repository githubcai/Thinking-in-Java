import java.util.concurrent.*;

class InnerThread1{
    private int countDown=5;
    private Inner inner;
    private class Inner extends Thread{
        Inner(String name){
            super(name);
            start();
        }
        public void run(){
            try{
                while(true){
                    System.out.println(this);
                    if(--countDown==0){
                        return;
                    }
                    sleep(10);
                }
            }catch(InterruptedException e){
                System.out.println("interrypted");
            }
        }
        public String toString(){
            return getName() + ": " + countDown;
        }
    }
    pubic InnerThread1(String name){
        inner = new Inner(name);
    }
}

class InnerThread2{
    private int countDown=5;
    private Thread t;
    public InnerThread2(String name){
        t = new Thread(name){
            public void run(){
                try{
                    while(true){
                        System.out.println(this);
                        if(--countDown==0){
                            return;
                        }
                        sleep(10);
                    }
                }catch(InterruptedException e){
                    System.out.println("sleep() interrupted");
                }
            }
            public String toString(){
                return getName() + ": " + countDown;
            }
        };
        t.start();
    }
}

class InnerRunnable1{
    private int countDown = 5;
    private Inner inner;
    private class Inner implements Runnable{
        Thread t;
        Inner(String name){
            t = new Thread(this, name);
        }
    }
}
