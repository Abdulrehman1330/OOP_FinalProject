public enum Models {
    COROLLA(5,"Corolla", "2NR-FE"),YARIS(5,"Yaris", "XP-150"),SUPRA(2,"Supra", "B48"),FORTUNER(7,"Fortuner", "2TR-FE"),LANDCRUISER(7,"Land Cruiser", "1VD-FTV"),PRIUS(5,"Prius", "2ZR-FXE");

    private int seats;

    private String name;
    private String engine;
    private
    Models(int seat, String name, String engine){
        this.seats = seat;
        this.name = name;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Toyota " + name + '\n' +
                " Engine name " + engine + '\n' +
                " Engine Size " + ;
    }
}
