public class OrderContent {
    private String orderId;
    private String cargoId;
    private int cargoCount;
    private float cargoValue;
    private float cargoWeight;
    public String getOrderId() {
        return orderId;
    }

    public int setOrderId(String orderId) {
        if(orderId.length() == 5) {
            this.orderId = orderId;
            return 0;
        }
        else{
            return -1;
        }
    }

    public String getCargoId() {
        return cargoId;
    }

    public int setCargoId(String cargoId) {
        if (cargoId.length() == 10) {
            this.cargoId = cargoId;
            return 0;
        }
        else{
            return -1;
        }
    }

    public int getCargoCount() {
        return cargoCount;
    }

    public int setCargoCount(int cargoCount) {
        if (cargoCount>0){
            this.cargoCount = cargoCount;
            return 0;
        }
        else{
            return -1;
        }

    }

    public float getCargoValue() {
        return cargoValue;
    }

    public int setCargoValue(float cargoValue) {
        if (cargoValue>0){
            this.cargoValue = cargoValue;
            return 0;
        }
        else{
            return -1;
        }
    }

    public float getCargoWeight() {
        return cargoWeight;
    }

    public int setCargoWeight(float cargoWeight) {
        if (cargoWeight>0){
            this.cargoWeight = cargoWeight;
            return 0;
        }
        else{
            return -1;
        }
    }
}
