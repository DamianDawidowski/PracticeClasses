public class Java_udemy_exercise29 {
    public static void main(String[] args) {
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3, 3, 3,1));
        System.out.println(getBucketCount(3.26, 0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        int bucketsToBuy;
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {
            return   bucketsToBuy = -1;
        }
        bucketsToBuy=getBucketCount(width,height,areaPerBucket)-extraBuckets;
        return bucketsToBuy;
    }

    public static int getBucketCount(double area, double areaPerBucket ) {
        int bucketsToBuy;
        if ((area <= 0) ||  (areaPerBucket <= 0) ) {
            return   bucketsToBuy = -1;
        }
        double fractionalBucketNumber = area / areaPerBucket;
        bucketsToBuy = (int) Math.ceil(fractionalBucketNumber);

        return bucketsToBuy;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        int bucketsToBuy;
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) ) {
            return bucketsToBuy = -1;
        }

        double area = width * height;
        double fractionalBucketNumber = area / areaPerBucket;
        bucketsToBuy = (int) Math.ceil(fractionalBucketNumber);


        return bucketsToBuy;
    }


}




