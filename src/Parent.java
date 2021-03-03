class Parent extends Child{

    Parent(String name){
        super(name);
    }
    Parent(String name, String grandParent){
        super(name);
        this.grandParent = grandParent;
    }



    void negor(String orang){
        System.out.println("Woy "+ orang + " Apa Kabar lo Orang Tua " + this.name + " ?");
    }
}
