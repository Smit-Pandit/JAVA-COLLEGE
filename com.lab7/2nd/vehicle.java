class vehicle{
    String thing;
    vehicle(String t){
        this.thing = t;
    }
    public void maxSpeed(){
        System.out.println("Maximum speed of "+ thing +" is 0 km/h");
    }
    public void start(){
        System.out.println("Starting the "+thing+"...");
        System.out.println("brrr..... brrr.....");
    }
    public void stop(){
        System.out.println("Turning the engine off!!");
    }
}