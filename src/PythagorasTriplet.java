import java.util.ArrayList;

/**
 * Created by Jesper on 19-7-2014.
 */
public class PythagorasTriplet {

    int a, b, c, targetTripletSum;

    public PythagorasTriplet(int targetTripletSum) {
        this.targetTripletSum = targetTripletSum;
    }

    public int createPossibleSummations() {
        for (a = 1; a < (targetTripletSum / 3) - 1; a++) {
            for (b = a+1; b < (((targetTripletSum - a) /2)); b++) {
                c = 1000 - a - b;
                if (isValidPythagorasEquation(a,b,c) && aLowersBLowersC(a, b, c) && sumIsTargetSum(a, b, c)) {
                    System.out.println("" + a + " + " + b + " + " + c + " = 1000" );
                    System.out.println("a = " + a + "; b = " + b + "; c = " + c);
                    System.out.println(a + "^2 + " + b + "^2 = " + c + "^2" );
                    System.out.println("" + a * a + " + " + b * b + " = " + c * c);
                    return a * b * c;
                }
            }
        }
        // standaardwaarde retourneren maar zou nooit mogen gebeuren
        return 0;
    }

    private boolean aLowersBLowersC(int a, int b, int c) {
        return (a < b && b < c) ? true : false;
    }

    private boolean sumIsTargetSum(int a, int b, int c) {
        return (a + b + c == 1000) ? true : false;
    }

    public boolean isValidPythagorasEquation(int a, int b, int c) {
        return (Math.sqrt(a * a + b * b) == c) ? true : false;
    }

}
