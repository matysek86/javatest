package pl.mpas.advancedprogramming.null_handing_optional;

import java.util.Optional;

public class Chipset {
    private String vendorName;


    public Optional<String> getVendorName() {
        return Optional.ofNullable(vendorName);
    }

    public Chipset(String vendorName) {
        this.vendorName = vendorName;
    }

    @Override
    public String toString() {
        return "Chipset{" +
                "vendorName='" + vendorName + '\'' +
                '}';
    }}
