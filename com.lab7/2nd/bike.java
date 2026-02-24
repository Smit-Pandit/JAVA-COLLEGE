class bike extends vehicle{
    int cc,speed=0;
    bike(int cc) throws Exception{
        super("bike");
        this.cc = cc;
        switch(cc){
            case 50 -> speed = 70;
            case 125 -> speed = 100;
            case 250 -> speed = 150;
            case 300 -> speed = 200;
            case 700 -> speed = 280;
            case 1000 -> speed = 300;
            case 1100 -> speed = 306;
            default -> throw new Exception("Not a valid cc for bike");
        }
    }
    @Override
    public void maxSpeed() {
        System.out.println("Maximum speed of bike with " + cc + "cc is "+ speed + "km/h");
    }
}