package termA.lesson9.LectureEncapsulation;

public class Main {
    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        Bucket bucket2 = new Bucket();




        //bucket2.setCapacity(30);
        //bucket2.setCurrent(11);

        //System.out.println(bucket);

        //bucket.addLiter();
        //bucket.addLiter();
        //System.out.println(bucket.percent() + " Percent(%) in the bucket.");
        //System.out.println(bucket);

        //System.out.println(bucket.addLiters(100));
        //System.out.println(bucket);

        //bucket.fill(bucket2);
        //System.out.println(bucket);
        magic();
    }

     public static void magic(){
        Bucket b1 = new Bucket();
        Bucket b2 = new Bucket();

        b1.setCapacity(7);
        b2.setCapacity(5);

        b1.fill();              // b1 = 7 , b2 = 0
        b1.spill(2);     // b1 = 5 , b2 = 0
        b2.addLiters(2); // b1 = 5 , b2 = 2
        b1.spill(5);     // b1 = 0 , b2 = 2
        b1.fill();              // b1 = 7 , b2 = 2
        b1.spill(3);     // b1 = 4 , b2 = 2
        b2.addLiters(3); // b1 = 4 , b2 = 5
        b2.spill(5);     // b1 = 4 , b2 = 0
        b1.spill(4);     // b1 = 0 , b2 = 0
        b2.addLiters(4); // b1 = 0 , b2 = 4
        b1.fill();              // b1 = 7 , b2 = 4
        b1.spill(1);     // b1 = 6 , b2 = 4
        b2.addLiters(1); // b1 = 6 , b2 = 5

        System.out.println(b1);
        System.out.println(b2);
    }



}
