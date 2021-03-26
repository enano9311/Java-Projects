package Algorithms.Medium;

import java.util.*;

public class ViralInfection {

    public static void ViralInfectionAnalysis(int[] peopleLocations, int spreadDistance){
        // look @ each person, and see how bad it goes
        Map infectionList = new HashMap<Integer, List<Integer>>();
        List<Integer> infectedList = new ArrayList<Integer>();
        for(int person : peopleLocations){
            infectedList = Collections.emptyList();
            infectedList.add(person);

            infectionList.put(person, getInfectedPeople(peopleLocations, spreadDistance, infectedList));
        }

        //loop over infectionList and find the "worst case" and "best case" and print those



        //System.out.println("Worst case scenario! Person at :" + worstCase);
        //System.out.println("Best case scenario! Person at :" + bestCase);

        return;
    }


    private static int[] getInfectedPeople(int[] peopleLocations, int spreadDistance, List<Integer> infectedList){
//        if(infectedList - spreadDistance > peopleLocations[] && infectedList[infectedList.size()] + spreadDistance < peopleLocations[0]){
//            return infectedList;
//        }
        return peopleLocations;
    }


}
