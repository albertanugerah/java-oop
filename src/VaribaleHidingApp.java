public class VaribaleHidingApp {
    public static void main(String[] args) {

        VariableHidingChild child = new VariableHidingChild();
        child.name = "Albert";
        child.doIt();
        System.out.println(child.name);

        VariableHidingParent parent = (VariableHidingParent) child;
        parent.doIt();
        System.out.println(parent.name);
    }
}
