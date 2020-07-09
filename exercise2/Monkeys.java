import java.util.Arrays;

class Monkeys {

    boolean monkeyBusiness(Monkey[] monkeys) {
        //BONUS EXERCISE
        //We have a set of monkeys.  Each Monkey has a boolean smile property, which indicates if that particular monkey is smiling.  Determine whether or not the majority of monkeys are smiling.  If the majority are smiling, return true.  if the majority are not smiling, return false.  If it is a tie, return true.

        int smilingCount = 0;
        int numOfMonkeys = monkeys.length;

        if (numOfMonkeys == 1) { // handles if set of monkeys given is only one and to avoid unnecessarily iterating through an array of length 1
            return monkeys[0].smile;
        }

        for (Monkey monkey : monkeys
        ) {
            if (monkey.smile) {
                smilingCount++;
            }
        }

        int majorityMarker = numOfMonkeys / 2 + 1; // this line handles odd numOfMonkeys by dividing by 2 and adding 1 (similar behavior to rounding up).

        if (numOfMonkeys % 2 == 0 && smilingCount == numOfMonkeys / 2) { // this line handles tie for even numOfMonkeys. Simply checked that smilingCount equals half of the numOfMonkeys
            return true;
        } else if (smilingCount >= majorityMarker) { // equals sign is needed to handle if numOfMonkeys smiling is greater than those not smiling by the count of 1 (i.e set of three, 2 smiling and 1 not smiling).
            return true;
        } else {
            return false;
        }
    }

    class Monkey {
        String name;
        boolean smile;
    }

    public static void main(String[] args) {
        //Bonus exercise instructions:  create an array of at least 3 monkeys, utilizing the nested Monkey class, and determine whether the majority of them are smiling or not.  
        //required monkey data:
        // Rafiqi is smiling
        // Curious George is smiling
        // King Kong is not smiling
        //You are NOT allowed to move the Monkey class.  Keep it where it is.  
        Monkeys monkeys = new Monkeys();
        Monkey rafiqi = monkeys.new Monkey();
        rafiqi.name = "Rafiqi";
        rafiqi.smile = true;

        Monkey curiousGeorge = monkeys.new Monkey();
        curiousGeorge.name = "Curious George";
        curiousGeorge.smile = true;

        Monkey kingKong = monkeys.new Monkey();
        kingKong.name = "King Kong";
        kingKong.smile = false;


        Monkey[] monkeyList = {rafiqi, curiousGeorge, kingKong};

        if (monkeyList.length > 0 ) {
            if (monkeys.monkeyBusiness(monkeyList)) {
                System.out.println("Majority of monkeys are smiling or equally smiling and not smiling");
            } else {
                System.out.println("Majority of monkeys are not smiling");
            }
        } else {
            System.out.println("Error! Empty monkey list. Cannot have monkey business without monkey.");
        }
    }
}