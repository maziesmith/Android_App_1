package com.example.prati.mp2;

/**
 * Created by prati on 10/1/2016.
 */

public class CarDealerInfo {

    String DealerName;
    String DealerAddress;
    String DealerNumber;

    public CarDealerInfo(String DealerName, String DealerAddress, String DealerNumber)
    {
        this.DealerName=DealerName;
        this.DealerAddress=DealerAddress;
        this.DealerNumber=DealerNumber;
    }

    public String getDealerName() {
        return DealerName;
    }

    public void setDealerName(String DealerName) {
        this.DealerName = DealerName;
    }

    public String getDealerAddress() {
        return DealerAddress;
    }

    public void setDealerAddress(String DealerAddress) {
        this.DealerAddress = DealerAddress;
    }

    public String getDealerNumber() {
        return DealerNumber;
    }

    public void setDealerNumber(String DealerNumber) {
        this.DealerNumber = DealerNumber;
    }
}
