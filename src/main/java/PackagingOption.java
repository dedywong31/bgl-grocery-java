import java.util.ArrayList;
public class PackagingOption {
    private String code;
    private int qty;
    private double price;

    public PackagingOption(String code, int qty, double price) {
        this.code = code;
        this.qty = qty;
        this.price = price;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "Packaging Option{" +
                "code='" + this.code + "'" +
                ", qty=" + this.qty +
                ", price=" + this.price +"}";
    }

    /**
     * If mismatch in order results in failure.
     * Incase of user defined objects, the objects should override equals() method.
     * Then assertArrayEquals() method called equals method to check the equality on each object.
     */
    public boolean equals(Object obj){
        PackagingOption packops = (PackagingOption) obj;
        boolean status = false;
        if(this.code.equalsIgnoreCase(packops.code)
            && this.qty == packops.qty
            && this.price == packops.price){
            status = true;
        }
        return status;
    }

    public static ArrayList<PackagingOption> getPackOpsList(){
        ArrayList<PackagingOption> packops = new ArrayList<PackagingOption>();
        packops.add(new PackagingOption("CE",3,14.95d));
        packops.add(new PackagingOption("CE",5,20.95d));
        packops.add(new PackagingOption("HM",2,13.95d));
        packops.add(new PackagingOption("HM",5,29.95d));
        packops.add(new PackagingOption("HM",8,40.95d));
        return packops;
    }
}
