package org.fasttrackit.com;

public class FacebookAdvertise implements AdvertiseInterface {

    private String facebookAd;


    public FacebookAdvertise(){

    }

    public String getFacebookAd() {
        return facebookAd;
    }

    public void setFacebookAd(String facebookAd) {
        this.facebookAd = facebookAd;
    }

    @Override
    public void advertiseSender(String yourAdvertise) {
        System.out.println("Facebook find a great deal for you! Check this out: " + yourAdvertise);
    }
}
