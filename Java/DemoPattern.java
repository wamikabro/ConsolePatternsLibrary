package Java;

class DemoPattern {
    protected static void pattern(int size){
        for(int i=1; i<=size; i++){
            for(int j=1; j<=size; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
