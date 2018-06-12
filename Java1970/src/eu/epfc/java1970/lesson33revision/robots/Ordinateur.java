package eu.epfc.java1970.lesson33revision.robots;

class Ordinateur {
    private double puissance;
    private String version;
    
    public void loadFile(String fileName) {
        System.out.println("Load fichier " + fileName);
    }

    public double getPuissance() {
        return puissance;
    }

    public void setPuissance(double puissance) {
        this.puissance = puissance;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Ordinateur(double puissance, String version) {
        this.puissance = puissance;
        this.version = version;
    }

    public Ordinateur() {
    }

    @Override
    public String toString() {
        return "Ordinateur{" + "puissance=" + puissance + ", version=" + version + '}';
    }

    
    
    public static void main(String[] args) {
        Ordinateur ordinateur = new Ordinateur(10, "1.0");
    }
}
