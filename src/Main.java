public class Main {
    public static void main(String[] args) {
        Interval r1 = new BoundaryInterval(4,7);
        Interval r2 = new ArrayInterval(new int[]{2,5});
        Interval r3 = r1.intersect(r2);
        Interval r4 = r2.intersect(r1);

        System.out.print(r3.getSmallestElem());
        System.out.print(" ");
        System.out.println(r3.getLargestElem());

        System.out.print(r4.getSmallestElem());
        System.out.print(" ");
        System.out.println(r4.getLargestElem());
    }
}