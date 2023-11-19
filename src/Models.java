public enum Models {
    COROLLA(5,"Corolla", "2NR-FE", 1800, "Michelin", "BI-PROJECTOR Led", "PETROL"),YARIS(5,"Yaris", "XP-150", 1300, "CONTINENTAL", "XENON", "PETROL"),SUPRA(2,"Supra", "B48", 3700, "MICHELIN SUPREMACY 3ST", "PROEJECTOR", "PETROL"),FORTUNER(7,"Fortuner", "2TR-FE", 2800, "YOKOHAMA", "Halogen headlamps", "PETROL"),LANDCRUISER(7,"Land Cruiser", "1VD-FTV", 3000, "PIRELLI", "HID headlamps", "PETROL"),PRIUS(5,"Prius", "2ZR-FXE", 1500, "BRIDGESTONE","LED Bulbs", "PETROL & HYBRID");

    private final int seats;
    private final String name;
    private final String engine;
    private final int engineSize;
    private final String tyre;
    private final String headlights;
    private final String engineType;
    Models(int seat, String name, String engine, int engineSize, String tyre, String headlights, String enginetype){
        this.seats = seat;
        this.name = name;
        this.engine = engine;
        this.engineSize = engineSize;
        this.tyre= tyre;
        this.headlights = headlights;
        this.engineType = enginetype;
    }

    @Override
    public String toString() {
        return "Toyota " + name + '\n' + "FEATURES ARE AS BELOW" + '\n' +
                " Seats " + seats + '\n' +
                " Engine name " + engine + '\n' +
                " Engine Size " + engineSize + '\n' +
                " Tyres " + tyre + '\n' +
                " Headlights " + headlights + '\n' +
                " Engine Type " + engineType;
    }
}
