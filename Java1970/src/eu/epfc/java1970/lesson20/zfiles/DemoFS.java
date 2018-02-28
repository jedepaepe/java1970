package eu.epfc.java1970.lesson20.zfiles;

/**
 * Démo de l'utilisation de Node & File & Directory
 * sorry mais je ne me souviens pas bien de l'exemple du cours
 * donc, je propose la structure suivante:
 * c:
 *  users
 *      netbeans.xml
 *      install.exe
 *  tmp
 *      work.docx
 */
public class DemoFS {
    public static void main(String[] args) {
        // crée un objet :Directory pour le disque c:
        Directory diskC = new Directory("c:");
        // crée un objet :Directory pour répertoire "users", le parent est "c:"
        Directory users = new Directory("users", diskC);
        // crée un objet :File pour le fichier "netbeans.xml", le parent est "users"
        File netbeans = new File("netbeans.xml", users, 2431);
        // ...
        File install = new File("install.exe", users, 15300);
        Directory tmp = new Directory("tmp", diskC);
        File work = new File("work.docx", tmp, 14239);
        
        // example d'application non vue au cours:
        // reconstitue le path du fichier "work"
        // 1. copie "work.docx" dans pathOfWork (en fait, copie la référence de "work.docx")
        //      donc pathOfWork => work.docx
        String pathOfWork = work.getName();
        // 2. crée une variable de type node et assigne lui work:File
        Node node = work;
        // 3. tant que node a un parent
        while(node.getParent() != null) {
            // 4. récupère la référence du parent (au premier passage, ce sera tmp:Directory et au second, ce sera disk:Directory
            node = node.getParent();
            // 5. insère le nom du node courant au path (et aussi \)
            //      premier passage pathOfWork => tmp\work.docx
            //       second passage pathOfWork => c:\tmp\work.docx
            pathOfWork = node.getName() + "\\" + pathOfWork;
        }
        // affiche le résultat
        System.out.println(pathOfWork);
    }
}
