package StudyForFun.YearA.Madmah2.Nadlan;

public class Agency {
    private Nehes[] nehasim;

    public String mostSeller(){

        int mostCount = 0;
        String sellerName = nehasim[0].getSeller().getFullName();

        for (int i = 0; i < nehasim.length; i++) {
            int currCount = 0;
            for (int j = 0; j < nehasim.length; j++) {
                if(nehasim[i].getSeller() == nehasim[j].getSeller()){
                    currCount++;
                }
            }
            if(currCount > mostCount){
                mostCount = currCount;
                sellerName = nehasim[i].getSeller().getFullName();
            }
        }
        return sellerName;
    }

    public int allMeterSizes(){
        int sum = 0;
        for (int i = 0; i < nehasim.length; i++) {
            if(nehasim[i] != null){
                sum+= nehasim[i].getGodelMeter();
            }
        }
        return sum;
    }
}
