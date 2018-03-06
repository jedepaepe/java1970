package eu.epfc.java1970.lesson22.zprivate;

/**
 * Démonstration de l'usage de private
 * la classe Directory permet de gérer une liste de noeud, 
 *      chaque noeud étant un fichier ou un répertoire
 *      (on a simplifié ici en représentant les noeuds par des String)
 * l'attribut "nrNodes" est le nombre de noeuds dans le répertoire
 *      il est calculé par un algorythme interne à la classe
 *      => on ne veut pas qu'il soit changé de l'extérieur de la classe (casse la cohérence => bug)
 *      => on met "private" nrNodes => il n'est accessible que par la classe
 *      mais zut, on voulait pouvoir lire la valeur de nrNodes
 *      => on crée une méthode getNrNodes qui retourne le nombre de nodes
 */

public class Directory {

    private String name;    // nom du directory
    private String[] nodeList = new String[4];  // liste des fichiers / directories contenus dans le directory
    private int nrNodes = 0;        // compteur du nombre de fichiers / directories

    public Directory(String name) { // constructeur
        this.name = name;
    }

    /**
     * Ajoute un node dans le directory
     * @param node 
     */
    public void add(String node) {
        // TODO check 
        // créer un nv tableau x2 taille
        // copier l'ancien tableau
        // ajouter node
        nodeList[nrNodes] = node;   // ajoute le node en dernière position
        nrNodes++;                  // met à jour le nombre de nodes
    }

    /**
     * retire le node à l'index précisé
     * @param index 
     */
    public void del(int index) {
        if (index >= 0 && index < nrNodes) {
            // retire le node et tasse la liste
            for (int i = index; i < nrNodes; i++) {
                nodeList[i] = nodeList[i + 1];  // remonte le node d'un index
            }
            nodeList[nrNodes] = null;   // supprime la référence du dernier node
            nrNodes--;      // met à jour le nombre de nodes
        }
    }

    /**
     * Retourne le nombre de nodes contenus dans le répertoire
     * @return 
     */
    public int getNrNodes() {
        return nrNodes;
    }

    public static void main(String[] args) {
        Directory d = new Directory("superDir");
        d.add("file1"); // ajoute un node en position index 0
        d.add("file2"); // idem index 1
        d.add("file3"); // idem index 2
        System.out.println(d.nrNodes);  // affiche 3
        d.del(0);   // retire le premier node (et tasse)
        System.out.println(d.nrNodes);  // affiche 2
        d.add("file4");   // ajoute un node en position index 2
        d.del(-100);    // ne fait rien car il n'y a pas de nodes en -100
        d.del(10000);   // idem
    }
}
