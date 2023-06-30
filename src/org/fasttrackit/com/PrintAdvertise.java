package org.fasttrackit.com;

public class PrintAdvertise implements AdvertiseInterface {

    private String printAd;

    public PrintAdvertise() {

    }

    public String getPrintAd() {
        return printAd;
    }

    public void setPrintAd(String printAd) {
        this.printAd = printAd;
    }

    @Override
    public void advertiseSender(String yourAdvertise) {
        System.out.println("We find a great deal for you! Check this out: " + yourAdvertise);
    }
}
