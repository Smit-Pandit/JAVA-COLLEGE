class Demo implements Runnable{
    public Demo(){
        Thread x = new Thread(this);
        x.setName("Example");
        x.start();
    }

    @Override
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}

public class Main{
    public static void main(String[] args){
        Demo x = new Demo();
    }
}