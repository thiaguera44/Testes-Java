package javapoo14;

public class JavaPoo14 {

    public static void main(String[] args) {

        Video v[] = new Video[3];
        
        v[0] = new Video ("Aula 1 de Poo");
        v[1] = new Video ("Aula 1 de PHP");
        v[2] = new Video ("Aula 1 de Python");

        
        Gafanhoto g[] = new Gafanhoto[2];
        
        g[0] = new Gafanhoto("Juba","Jubileu", 22, "M");
        g[1] = new Gafanhoto("creuzita", "Creuza", 12, "F");
        
        
        Visualizacao vis = new Visualizacao(g[0], v[2]);
        vis.avaliar();
        System.out.println(vis.toString());
        
        Visualizacao vis2 = new Visualizacao(g[0], v[1]);
        vis2.avaliar(87.0f);
        System.out.println(vis2.toString());
        
        
        
        
    /*  System.out.println("VIDEOS\n---------------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        
        System.out.println("\nGAFANHOTOS\n-----------------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString()); */

    
    
    }
    
}
