package termA.lesson9.LectureEncapsulation;

public class Main {
    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        Bucket bucket2 = new Bucket();

        Bucket[] buckets = new Bucket[3];
        buckets[0] = new Bucket();
        buckets[0].setCapacity(5);
        buckets[0].setCurrent(3);

        buckets[1] = new Bucket();
        buckets[1].setCapacity(7);
        buckets[1].setCurrent(4);

        buckets[2] = new Bucket();
        buckets[2].setCapacity(6);
        buckets[2].setCurrent(3);


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
        //magic();

        //System.out.println(reduceAmountInBuckets(buckets , 40));
        printArray(fillExactAmount(buckets , 10));
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

    public static Bucket reduceAmountInBuckets(Bucket[] buckets , float max){
        Bucket b = new Bucket();

        for (int i = 0; i < buckets.length; i++) {
            if(buckets[i].percent() > max){
                float spillWater = (buckets[i].getCapacity() * max)/ 100;
                float toRemove = buckets[i].getCurrent() - spillWater;
                b.setCapacity(b.getCapacity() + buckets[i].getCapacity());
                buckets[i].setCurrent((int)(buckets[i].getCurrent() - toRemove));
                b.setCurrent((int)(b.getCurrent() + toRemove));
            }
        }
        return b;
    }

    public static int[] fillExactAmount(Bucket[] buckets , int amount){
        int sum = 0;
        int count = 0;
        for (int i = 0; i < buckets.length; i++) {
            if(buckets[i].getCurrent() >= buckets[i].getCapacity() / 2){ // 5 3 7 4 3 2
                 sum += buckets[i].getCurrent();
                 count++;
            }
        }
        if(sum != amount){
            return new int[0];
        }
        int[] indexBuckets = new int[count];
        int index = 0;
        for (int i = 0; i < buckets.length; i++) {
            if(buckets[i].getCurrent() >= buckets[i].getCapacity() / 2){
                indexBuckets[index] = i;
                index++;
            }
        }
        for (int i = 0; i < buckets.length; i++) {
            buckets[i].spill();
        }

        return indexBuckets;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }



}
