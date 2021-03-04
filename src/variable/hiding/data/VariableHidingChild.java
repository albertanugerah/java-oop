package variable.hiding.data;

public class VariableHidingChild extends VariableHidingParent{
        public String name;
        public void doIt(){
            System.out.println("Do it Variable Hiding Child");
            System.out.println("Parent name is " + super.name);
        };
}
