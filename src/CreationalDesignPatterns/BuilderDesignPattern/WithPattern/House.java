package CreationalDesignPatterns.BuilderDesignPattern.WithPattern;

public class House {
        private String foundation;
        private String walls;
        private String terrace;
        private boolean garden;
        private boolean swimingpool;

        public House(HouseBuilder houseBuilder) {
            this.foundation = houseBuilder.foundation;
            this.walls = houseBuilder.walls;
            this.terrace = houseBuilder.terrace;
            this.garden = houseBuilder.garden;
            this.swimingpool = houseBuilder.swimingpool;
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

        static class HouseBuilder{
            private String foundation;
            private String walls;
            private String terrace;
            private boolean garden;
            private boolean swimingpool;

            public HouseBuilder(String foundation, String walls, String terrace){
                this.foundation = foundation;
                this.walls = walls;
                this.terrace = terrace;
            }

            public HouseBuilder setGarder(boolean garden){
                this.garden = garden;
                return this;
            }
            public HouseBuilder setPool(boolean swimingpool){
                this.swimingpool = swimingpool;
                return this;
            }

            public House build(){
                return new House(this);
            }
        }


}
