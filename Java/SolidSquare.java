package Java;
// This is how you'll create a class for your pattern.
class SolidSquare {
    /*
    * Make sure to make a method called pattern which takes necessary parameters.
    * It must be protected static void (double check)
    * Clean coding is recommended with no unnecessary code.
    * Follow IJK sequence for local variables.
    * */
    protected static void pattern(int size){
        for(int i=1; i<=size; i++){
            for(int j=1; j<=size; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    // Please don't continue from here, make new class for your pattern.
    // Keep naming convention in mind.
}
