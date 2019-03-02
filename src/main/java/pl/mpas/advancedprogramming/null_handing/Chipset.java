package pl.mpas.advancedprogramming.null_handing;

public class Chipset {

    private String vendorName;


    public String getVendorName() {
        return vendorName;
    }

    public Chipset(String vendorName) {
        this.vendorName = vendorName;
    }

    @Override
    public String toString() {
        return "Chipset{" +
                "vendorName='" + vendorName + '\'' +
                '}';
    }
}
