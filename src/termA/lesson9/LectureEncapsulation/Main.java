package termA.lesson9.LectureEncapsulation;

public class Main {
    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        Bucket bucket2 = new Bucket();

        bucket2.setCapacity(10);
        bucket2.setCurrent(5);

        //System.out.println(bucket);

        bucket.addLiter();
        bucket.addLiter();
        System.out.println(bucket.percent() + " Percent(%) in the bucket.");
        //System.out.println(bucket);

        System.out.println(bucket.addLiters(100));
        System.out.println(bucket);

        bucket.fill(bucket2);
    }

}
