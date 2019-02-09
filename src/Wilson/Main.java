package Wilson;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{20,1,50,32,99};
        int[] array2 = new int[]{20,1,12,99};

        studentrecord test1 = new studentrecord(array);
        studentrecord test2 = new studentrecord(array2);

        System.out.println(test1.hasImproved());
        System.out.println(test2.hasImproved());

        System.out.println(test1.finalAverage());
        System.out.println(test2.finalAverage());
    }
}
