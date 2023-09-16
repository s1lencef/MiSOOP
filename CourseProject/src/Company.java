public class Company {
    private String id;
    private String companyName;

    public Company(String id){
        if (id.length() == 4) {
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
