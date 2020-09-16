public class checktimetaken {

    public static long start;
    public static long end;

    public static void startAlgo() {
        start = System.currentTimeMillis();
    }

    public static long endAlgo() {
        end = System.currentTimeMillis();
        return end - start;
    }

    public static void main(String[] args) {

        startAlgo();
        // System.out.println("Hello World");
        for (int i = 0; i < 10; i++) {
            System.out.println(i * i);
        }
        System.out.println(endAlgo() + "ms");
    }

}
