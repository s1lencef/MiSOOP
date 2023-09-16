public class Company {
    private String id;
    private String companyName;

    public String getId() {
        return id;
    }

    public int setId(String id) {
        if (id.length() == 4){
            this.id = id;
            return 0;
        }
        else{
            return -1;
        }

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
