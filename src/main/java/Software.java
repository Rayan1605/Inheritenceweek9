public class Software extends Product {
    String version = "";


    Software(){

    }
    Software(String version,String description, double price, long code){
        super(description,price,code);
        this.version = version;

    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


}
