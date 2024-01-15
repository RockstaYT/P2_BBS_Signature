package ch.bfh.p2bbs.Types;

import ch.openchvote.util.sequence.Vector;
import ch.openchvote.util.tuples.Octuple;

public class Proof extends Octuple<G1Point, G1Point, G1Point, Scalar, Scalar, Scalar, Vector<Scalar>, Scalar> {

    public static Proof INVALID = new Proof();

    public Proof(G1Point abar, G1Point bbar, G1Point d, Scalar ecalc, Scalar r1calc, Scalar r3calc, Vector<Scalar> msgCommitments, Scalar challange) {
        super(abar, bbar, d, ecalc, r1calc, r3calc, msgCommitments, challange);
    }

    private Proof(){
        super(null, null, null, null, null, null, null, null);
    }

    public G1Point getAbar() {
        return getFirst();
    }

    public G1Point getBbar() {
        return getSecond();
    }

    public G1Point getD() {
        return getThird();
    }

    public Scalar getECalc() {
        return getFourth();
    }

    public Scalar getR1Calc() {
        return getFifth();
    }

    public Scalar getR3Calc() {
        return getSixth();
    }

    public Vector<Scalar> getMsg_commitments() {
        return getSeventh();
    }

    public Scalar getChallenge() {
        return getEighth();
    }

    public Object[] toObjectArray(){
        Object[] temp = new Object[7 + getMsg_commitments().getLength()];
        temp[0] = getFirst();
        temp[1] = getSecond();
        temp[2] = getThird();
        temp[3] = getFourth();
        temp[4] = getFifth();
        temp[5] = getSixth();
        for (int i = 1; i <= getMsg_commitments().getLength(); i++) {
            temp[i+3] = getMsg_commitments().getValue(i);
        }
        temp[temp.length-1] = getEighth();
        return temp;
    }

    public boolean isInvalid(){
        return getAbar() == null || getBbar() == null || getD() == null || getECalc() == null || getR1Calc() == null || getR3Calc() == null || getMsg_commitments() == null || getChallenge() == null;
    }
}
