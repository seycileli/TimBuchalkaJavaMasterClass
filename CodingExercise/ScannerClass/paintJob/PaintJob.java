package scanner;

import java.util.Scanner;

public class PaintJob {

    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));


    }

    public static int getBucketCount
            (double width, double height, double areaPerBucket, int extraBuckets) {
        double bucketNeeded = 0;

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            double area = width * height;
            bucketNeeded = area/ areaPerBucket;

            if (bucketNeeded % (int) bucketNeeded > 0) {
                bucketNeeded = (int) bucketNeeded + 1;
            } else bucketNeeded = (int) bucketNeeded;
        }
        return (int) (bucketNeeded - extraBuckets);
    }

    public static int getBucketCount
            (double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount (double area, double areaPerBucket) {
        return getBucketCount(1, area, areaPerBucket);
    }
}
