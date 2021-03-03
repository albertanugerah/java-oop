class Parent {
    String name;

    String grandParent;

    Parent(String name){
        this.name = name;
    }
    Parent(String name, String grandParent){
        this.name = name;
        this.grandParent = grandParent;
    }



    void Negor(String orang){
        System.out.println("Woy "+ orang + " Apa Kabar lo Orang Tua " + this.name + " ?");
    }
}
