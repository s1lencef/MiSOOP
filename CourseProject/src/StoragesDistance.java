public class StoragesDistance {
    private String storageId1;
    private String storageId2;

    private double distance;

    public String getStorageId1() {
        return storageId1;
    }

    public int setStorageId1(String storageId1) {
        if (storageId1.length() == 6) {
            this.storageId1 = storageId1;
            return 0;
        }
        else{
            return -1;
        }
    }

    public String getStorageId2() {
        return storageId2;
    }

    public int setStorageId2(String storageId2) {
        if (storageId2.length() == 6) {
            this.storageId2 = storageId2;
            return 0;
        }
        else{
            return -1;
        }
    }

    public double getDistance() {
        return distance;
    }

    public int setDistance(double distance) {
        if (distance >0){
            this.distance = distance;
            return 0;
        }
        else{
            return -1;
        }

    }
}
