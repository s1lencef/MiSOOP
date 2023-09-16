public class Storage {
    private String id;
    private String address;
    private float maxValue;
    private float fullness;

    public Storage(String id){
        if (id.length() == 6) {
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
        if (id.length() == 6){
            this.id = id;
            return 0;
        }
        else{
            return-1;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getMaxValue() {
        return maxValue;
    }

    public int setMaxValue(float maxValue) {
        if (maxValue >=100) {
            this.maxValue = maxValue;
            return 0;
        }
        else{
            return -1;
        }
    }

    public float getFullness() {
        return fullness;
    }

    public int setFullness(float fullness) {
        if (fullness <=1 && fullness>=0) {
            this.fullness = fullness;
            return 0;
        }
        else{
            return -1;
        }

    }
}
