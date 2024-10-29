package y1.s2.Modules.Module2.cse205_p02.src;

public class OnCampusStudent extends Student {
    private boolean mResident;
    private double mProgramFee;

    /**
     * Creats an OnCampusStudent. Call the Student class ctor to instantiate the instance variables inherited from Student
     */
    public OnCampusStudent(String pId, String pFName, String pLName) {
        super(pId, pFName, pLName);
    }

    /**
     * Calculates the tuition for an OnCampusStudent
     */
    @Override
    public void calcTuition() {
        double t;
        if (getResidency()) {
            t = TuitionConstants.ONCAMP_RES_BASE;
        } else {
            t = TuitionConstants.ONCAMP_NONRES_BASE;
        }
        t += getProgramFee();
        if (getCredits() > TuitionConstants.ONCAMP_MAX_CREDITS) {
            t += (getCredits() - TuitionConstants.ONCAMP_MAX_CREDITS) * TuitionConstants.ONCAMP_ADD_CREDITS;
        }
        setTuition(t);
    }

    /**
     * Accessor method for mProgramFee
     */
    public double getProgramFee() {
        return mProgramFee;
    }

    /**
     * Accessor method for mResident
     */
    public boolean getResidency() {
        return mResident;
    }

    /**
     * Mutator method for mProgramFee
     */
    public void setProgramFee(double mProgramFee) {
        this.mProgramFee = mProgramFee;
    }

    /**
     * Mutator method for mResident
     */
    public void setResidency(boolean mResident) {
        this.mResident = mResident;
    }
}
