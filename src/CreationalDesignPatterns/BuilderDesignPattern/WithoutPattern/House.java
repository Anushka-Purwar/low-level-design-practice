package CreationalDesignPatterns.BuilderDesignPattern.WithoutPattern;

public class House {
    private String foundation;
    private String walls;
    private String terrace;
    private boolean garden;
    private boolean swimingpool;

    public House(String foundation, String walls, String terrace, boolean garden, boolean swimingpool) {
        this.foundation = foundation;
        this.walls = walls;
        this.terrace = terrace;
        this.garden = garden;
        this.swimingpool = swimingpool;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + walls + '\'' +
                ", roof='" + terrace + '\'' +
                ", hasGarage=" + garden +
                ", hasSwimmingPool=" + swimingpool;


    }

}
