package step5.topic3.task5;

public enum Operation {
    PLUS{
        @Override
        public void apply(double x, double y) {
            System.out.println(x + y);
        }
    },
    MINUS{
        @Override
        public void apply(double x, double y) {
            System.out.println(x - y);
        }
    },
    TIMES{
        @Override
        public void apply(double x, double y) {
            System.out.println(x * y);
        }
    },
    DIVIDE{
        @Override
        public void apply(double x, double y) {
            if (x == 0 || y == 0){
                throw new IllegalArgumentException("Делить на ноль нельзя");
            }
            System.out.println(x / y);
        }
    };

    public abstract void apply(double x, double y);
}
