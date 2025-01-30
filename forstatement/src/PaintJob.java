public class PaintJob {

    public static int getBucketCount(double width, double height ,double areaPerBucket,int extraBuckets) {
        if(width <=0 || height <=0 || areaPerBucket<=0 || extraBuckets < 0) {
            return -1;
        }
        double areaToPaint = width * height;
        double remainderAfterExtraBuckets = areaToPaint - (extraBuckets*areaPerBucket);
        int bucketsToBuy = (int)(Math.ceil(remainderAfterExtraBuckets/areaPerBucket));
        return bucketsToBuy;
    }

    public static int getBucketCount(double width, double height ,double areaPerBucket) {
        if(width <=0 || height <=0 || areaPerBucket<=0) {
            return -1;
        }
        double areaToPaint = width * height;
        int bucketsToBuy = (int)(Math.ceil(areaToPaint/areaPerBucket));
        return bucketsToBuy;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if(area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double areaToPaint = area;
        int bucketsToBuy = (int)(Math.ceil(areaToPaint/areaPerBucket));
        return bucketsToBuy;
    }

    public static void main(String[] args) {
        System.out.print("Bob will need an extra of : " + getBucketCount(3.4,2.1,1.5,2) + " Buckets!");
    }
}
