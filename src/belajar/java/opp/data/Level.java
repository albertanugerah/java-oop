package belajar.java.opp.data;

//kebiasaannya enum itu CAPITALIZE
//membuat constructor = field enum harus panggil constructor dan butuh  parameter dari constructnya, disni parameternya description
public enum Level {
    STAFF("Level Staff"),
    ASKEP("Level ASKEP"),
    MANAGER("Level Manager");


    private String description;

    Level(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
