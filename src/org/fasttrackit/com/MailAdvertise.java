package org.fasttrackit.com;

public class MailAdvertise implements AdvertiseInterface {

    private String mailAd;

    public MailAdvertise() {

    }

    public String getMailAd() {
        return mailAd;
    }

    public void setMailAd(String mailAd) {
        this.mailAd = mailAd;
    }

    @Override
    public void advertiseSender(String yourAdvertise) {
        System.out.println("Your mail company find a great deal for you! Check this out: " + yourAdvertise);
    }
}
