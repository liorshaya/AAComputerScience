package StudyForFun.YearA.Madmah2.Proposal;

public class Auction {
    private Product product;
    public Proposal[] proposals;
    private int minimumOffer;
    private int minimalParticipants;

    public boolean addProposal(Proposal toAdd){
        if(toAdd.getBid() > this.minimumOffer){
            Proposal[] newArray = new Proposal[this.proposals.length+1];
            for (int i = 0; i < this.proposals.length; i++) {
                newArray[i] = proposals[i];
            }
            newArray[this.proposals.length] = toAdd;
            this.proposals = newArray;
            return true;
        }
        return false;
    }

    public String toString(){
        if(proposals.length < this.minimalParticipants){
            return "The auction not happening";
        }
        else{
            int maxBid = -1;
            int secMaxBid = -1;
            String name = "";
            for (int i = 0; i < proposals.length; i++) {
               if(proposals[i].getBid() > maxBid){
                   secMaxBid = maxBid;
                   maxBid = proposals[i].getBid();
                   name = proposals[i].getName();
               }
               else if (proposals[i].getBid() > secMaxBid) {
                   secMaxBid = proposals[i].getBid();
               }
            }
            return "The winner in auction is " + name + " That paid for " + this.product + " price of " + secMaxBid + "shekels";
        }

    }
}
