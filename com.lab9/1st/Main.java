class A extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(getName()+" : "+i);
        }
    }
}

public class Main{
    public static void main(String[] args){
        A t=new A();
        
        t.start();
    }
}