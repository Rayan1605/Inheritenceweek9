public class Product {
    String description = "";
    double price = 0;
    long code = 0;


Product(){

}
Product(String description, double price, long code){
    this.description = description;
    this.price = price;
    this.code = code;

}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }




}
