public class Order {
    private String id;
    private String state;
    private String deliveryPeriod;
    private String departureDate;
    private String arrivalDate;
    private String storageId1;
    private String storageId2;
    private String transportId;

    public Order(String id){
        if (id.length() == 5) {
            this.id = id;
        }
        else{
            System.out.println("Wrong ID");
        }
    }
    public String getId() {
        return id;
    }

    public int setId(String id) {
        if(id.length() == 5) {
            this.id = id;
            return 0;
        }
        else{
            return -1;
        }
    }

    public String getState() {
        return state;
    }

    public int setState(String state) {
        String enableStates = "ПринятВ обработкеОтправленДоставлен";

        if(enableStates.contains(state)) {
            this.state = state;
            return 0;
        }
        else{
            return -1;
        }

    }
    // ограничения на дату( маску задать)
    public String getDeliveryPeriod() {
        return deliveryPeriod;
    }

    public void setDeliveryPeriod(String deliveryPeriod) {
        this.deliveryPeriod = deliveryPeriod;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

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

    public String getTransportId() {
        return transportId;
    }

    public int setTransportId(String transportId) {
        if (transportId.length() == 9) {
            this.transportId = transportId;
            return 0;
        }
        else{
            return -1;
        }
    }
}
