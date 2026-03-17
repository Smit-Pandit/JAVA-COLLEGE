class car extends vehicle{
    String type;
    int speed = 0;
    car(String type) throws Exception {
        super("car");
        this.type = type;
        switch (type) {
            case "sedan" -> speed = 140;
            case "xuv" -> speed = 200;
            case "super" -> speed = 300;
            case "hyper" -> speed = 500;
            default -> throw new Exception("Not a valid type of car");
        }
    }
    @Override
    public void maxSpeed() {
        System.out.println("Maximum speed of " + type + " : "+ speed + "km/h");
    }
}