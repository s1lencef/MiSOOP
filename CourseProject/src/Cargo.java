public class Cargo {
    private String id;
    private String Name;
    private double weight;
    private double value;
    private int count;
    private String cellId;
    private String companyId;
    private String storageId;

    public Cargo(String id){
        if (id.length() == 10) {
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
        if (id.length() == 10) {
            this.id = id;
            return 0;
        }
        else{
            return -1;
        }
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getWeight() {
        return weight;
    }

    public int setWeight(double weight) {
        if (weight>0) {
            this.weight = weight;
            return 0;
        }
        else{
            return -1;
        }
    }

    public double getValue() {
        return value;
    }

    public int setValue(double value) {
        if (value>0) {
            this.value = value;
            return 0;
        }
        else{
            return -1;
        }
    }

    public int getCount() {
        return count;
    }

    public int setCount(int count) {
        if (count>0) {
            this.count = count;
            return 0;
        }
        else{
            return -1;
        }
    }

    public String getCellId() {
        return cellId;
    }

    public int setCellId(String cellId) {
        if (cellId.length() == 10) {
            this.cellId = cellId;
            return 0;
        }
        else{
            return -1;
        }
    }

    public String getCompanyId() {
        return companyId;
    }

    public int setCompanyId(String companyId) {
        if (companyId.length() == 4) {
            this.companyId = companyId;
            return 0;
        }
        else{
            return -1;
        }
    }

    public String getStorageId() {
        return storageId;
    }

    public int setStorageId(String storageId) {
        if (storageId.length() == 4) {
            this.storageId = storageId;
            return 0;
        }
        else{
            return -1;
        }
    }
}
