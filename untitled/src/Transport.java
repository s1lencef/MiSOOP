public class Transport {
    private String id;
    private String state;
    private  float tonnage;
    private float caseload;
    private  int nextMaintenanceDistance;
    private String maintenanceDate;
    private double passedDistance;
    private String storageNumber;

    public String getId() {
        return id;
    }

    public int setId(String id) {
        if (id.length() == 9) {
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
        String enableStates = "В путиНа ТОНа складе";

        if(enableStates.contains(state)) {
            this.state = state;
            return 0;
        }
        else{
            return -1;
        }
    }

    public float getTonnage() {
        return tonnage;
    }

    public int setTonnage(float tonnage) {
        if (tonnage>0) {
            this.tonnage = tonnage;
            return 0;
        }
        else{
            return -1;
        }
    }

    public float getCaseload() {
        return caseload;
    }

    public int setCaseload(float caseload) {
        if (caseload>0) {
            this.caseload = caseload;
            return 0;
        }
        else{
            return -1;
        }
    }

    public float getNextMaintenanceDistance() {
        return nextMaintenanceDistance;
    }

    public int setNextMaintenanceDistance(int nextMaintenanceDistance) {
        if (nextMaintenanceDistance>=10) {
            this.nextMaintenanceDistance = nextMaintenanceDistance;
            return 0;
        }
        else{
            return -1;
        }
    }

    public String getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate(String maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    public double getPassedDistance() {
        return passedDistance;
    }

    public int setPassedDistance(double passedDistance) {
        if (passedDistance>=10) {
            this.passedDistance = passedDistance;
            return 0;
        }
        else{
            return -1;
        }
    }

    public String getStorageNumber() {
        return storageNumber;
    }

    public int setStorageNumber(String storageNumber) {
        if (storageNumber.length() == 6){
            this.storageNumber = storageNumber;
            return 0;
        }
        else{
            return-1;
        }

    }
}
