package week5postlab;

public class Main {
    public static void main(String[] args) {
        Auction auction = new Auction();
        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");

        auction.attach(bidder1);
        auction.attach(bidder2);

        auction.setItem("Vintage Watch");
        auction.startAuction();
        auction.endAuction();
    }
}

