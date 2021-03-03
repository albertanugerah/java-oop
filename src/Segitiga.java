class Segitiga {
    int kelilingSamaSisi(Integer sisi){
        return sisi * 3;
    }
}

class kelilingSamaKaki extends Segitiga{

    int kelilingSamaKaki(Integer kaki) {
        return super.kelilingSamaSisi(kaki+kaki+kaki);
    }
}