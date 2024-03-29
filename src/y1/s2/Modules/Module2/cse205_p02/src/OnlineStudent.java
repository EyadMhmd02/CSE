package y1.s2.Modules.Module2.cse205_p02.src;

public class OnlineStudent extends Student {
    private boolean mTechFee;

    /**
     * Creats an OnlineStudent. Call the Student class ctor to instantiate the instance variables inherited from Student
     */
    public OnlineStudent(String pId, String pFName, String pLName) {
        super(pId, pFName, pLName);
    }

    /**
     * Calculates the tuition for an OnlineStudent
     */
    @Override
    public void calcTuition() {
        double t = getCredits() * TuitionConstants.ONLINE_CREDIT_RATE;
        if (getTechFee()) t += TuitionConstants.ONLINE_TECH_FEE;
        setTuition(t);
    }

    /**
     * Accessor method for mTechFee
     */
    public boolean getTechFee() {
        return mTechFee;
    }

    /**
     * Mutator method for mTechFee
     */
    public void setTechFee(boolean pTechFee) {
        mTechFee = pTechFee;
    }
}
