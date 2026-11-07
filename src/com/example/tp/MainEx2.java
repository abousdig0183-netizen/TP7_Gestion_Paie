
package com.example.tp;

public class MainEx2 {

    public static void main(String[] args) {

        FileSystem system = new FileSystem();

        // Fichiers principaux
        FileItem f1 = new FileItem("rapport.docx", 2500);
        FileItem f2 = new FileItem("photo.jpg", 350000);
        FileItem f3 = new FileItem("cours.pdf", 95000);

        // Premier repertoire
        Directory documents = new Directory("Documents");
        documents.add(f1);
        documents.add(f3);

        // Sous-repertoire
        Directory pictures = new Directory("Pictures");
        pictures.add(f2);

        documents.add(pictures);

        // Deuxieme repertoire
        Directory projects = new Directory("Projects");
        projects.add(new FileItem("code.java", 1800));
        projects.add(new FileItem("data.txt", 700));

        // Ajout des racines
        system.addRoot(documents);
        system.addRoot(projects);
        system.addRoot(new FileItem("welcome.txt", 1000));

        // Affichage final
        System.out.println("=== CONTENU DU SYSTEME ===");
        system.listAll();

        System.out.println();
        System.out.println("Taille totale : "
                + system.totalSize() + " B");
    }
}
