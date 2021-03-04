class VariableHidingParent {
    String name;
    void doIt (){
        System.out.println("Do it Variable Hiding Parent");
    };

}

class VariableHidingChild extends VariableHidingParent{
    String name;
    void doIt (){
        System.out.println("Do it Variable Hiding Child");
        System.out.println("Parent name is " + super.name);
    };
}
