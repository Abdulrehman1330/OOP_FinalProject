public enum Models {
    COROLLA(5,"Corolla"),YARIS(5,"Yaris"),SUPRA(2,"Supra"),FORTUNER(7,"Fortuner"),LANDCRUISER(7,"Land Cruiser"),PRIUS(5,"Prius");

    private int seats;

    private String name;
    Models(int seat, String name){
        this.seats = seat;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Toyota " + name;
    }
}
