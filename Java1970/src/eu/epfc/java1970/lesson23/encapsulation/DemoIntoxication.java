package eu.epfc.java1970.lesson23.encapsulation;

/**
 *
 * @author jedepaepe
 */
public class DemoIntoxication {
    
    public static void main(String[] args) {
        Intoxication gastro = new Intoxication();
        // gastro.nom = "Gastro-entérite";
        gastro.setNom("gastro-entérite");
        gastro.setDescription("hum, pas joli");
        gastro.setPopulation(10_000L);

        gastro.addCriteres("Selles liquides", "Selles jaunes", "Doubleurs bas du ventre");
        
        String[] criteresCassePieds = new String[3];
        criteresCassePieds[0] = "Selles liquides";
        criteresCassePieds[1] = "Selles jaunes";
        criteresCassePieds[2] = "Douleurs bas du ventre";
        gastro.setCriteres(criteresCassePieds);
        
        String[] criteres = {
            "Selles liquides", 
            "Selles jaunes", 
            "Douleurs bas du ventre"
        };
        gastro.setCriteres(criteres);
        
        gastro.setCriteres(new String[] {"Selles liquides", "Selles jaunes", "Doubleurs bas du ventre"});      
        
    }
    
}
