/**
 * Created by Jesper on 19-7-2014.
 */
public class Main {



    public static void main(String[] args) {
        // geef som van het triplet mee aan de constructor
        PythagorasTriplet pythagorasTriplet =  new PythagorasTriplet(1000);
        System.out.println(pythagorasTriplet.createPossibleSummations());

    }


}
