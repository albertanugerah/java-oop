class Child extends GrandChild{

    String grandParent;

    Child(String name){
        super(name);
    }

    Child(String name, String grandParent){
        super(name);
        this.grandParent = grandParent;
    }
    void negor(String orang){
        System.out.println("Woy "+ orang + " Apa Kabar lo Bocah " + this.name + " ?");
    }

}
