
class Arrays {

    //Take the arrays.js file, and refactor the code into Java in this file.
    int[] nums = {10, 23, 3, 4, 5, 2, 1};
    String[] greetings = {"hello", "howdy", "hallo", "hola", "bonjour", "ciao", "أهلا"};
    boolean[] binaries;

    void printNums() {
        for (int n : nums) {
            System.out.println(n);
        }
    }

    void printGreetings() {
        for (String g : greetings) {
            System.out.println(g);
        }
    }

    void printBinaries() {
        byte[] binArr = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int size = binArr.length;
        binaries = new boolean[size];

        for (int i = 0; i < size; i++) {
            binaries[i] = binArr[i] != 0 ? true : false;
        }

        for (boolean b: binaries) {
            System.out.println(b);
        }
    }
}








