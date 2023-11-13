public enum Models {
    COROLLA(5),YARIS(5),SUPRA(2),FORTUNER(7),LANDCRUISER(7),PRIUS(5);

    private int seats;

    private String name;
    Models(int seat, String ){
        this.seats = seat;
    }
}
