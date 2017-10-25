import java.util.*;

public class Main {

    
    
    public static void main(String[] args) {
        
        VectorHelper vectorHelper;
        Scanner sc = new Scanner(System.in);
        int[] vector1;
        int[] vector2;
        int index,n,rep=0;
        
        index=0;
        
        
        System.out.println("****************************************************");
        System.out.println("    Application 2 : Manipulation des Vecteurs");
        System.out.println("****************************************************");
        System.out.println("1) Ordoner les elements d'un vecteur.");
        System.out.println("2) Inverser l'ordre des elements d'un vecteur.");
        System.out.println("3) Obtenir un nouveau vecteur telque : nouv_vec = 2*anc_vec - 1.");
        System.out.println("4) Recuperer le maximum et le minimum d'un vecteur.");
        System.out.println("5) Addition de deux vecteurs.");
        System.out.println("");
        
        while(rep>6 || rep<1){
        
            System.out.println("Veuillez choisir une foctionalite svp? votre choix : ");
            rep = sc.nextInt();
        }
        
        switch (rep)
        {
                case 1:
                    System.out.println("Introduction du vecteur : ");
                    System.out.print("Donner sa demension : ");
                    n = sc.nextInt();
                    vector1=new int[n];
                    
                    for (int i=0;i<n;i++){
                        System.out.print("Introduire l'element "+(i+1));
                        vector1[i]=sc.nextInt();
                    }
                    vectorHelper = new VectorHelper(vector1);
                    System.out.print("Vecteur : ");
                    
                    for (int i=0;i<vectorHelper.getVector().length;i++){
                        System.out.print((vectorHelper.getVector())[i]);
                        }
                    System.out.println();
                    System.out.print("Resultat du traitement : ");
                    vectorHelper.sortVector();
                    
                     for (int i=0;i<vectorHelper.getVector().length;i++){
                        System.out.print((vectorHelper.getVector())[i]);
                        }
                    
                    
                  ;
                  break;  
                
                case 2:
                    
                    System.out.println("Introduction du vecteur : ");
                    System.out.print("Donner sa demension : ");
                    n = sc.nextInt();
                    vector1=new int[n];
                    
                    for (int i=0;i<n;i++){
                        System.out.print("Introduire l'element "+(i+1));
                        vector1[i]=sc.nextInt();
                    }
                    vectorHelper = new VectorHelper(vector1);
                    System.out.print("Vecteur : ");
                    
                    for (int i=0;i<vectorHelper.getVector().length;i++){
                        System.out.print((vectorHelper.getVector())[i]  );
                        }
                    System.out.println();
                    System.out.print("Resultat du traitement : ");
                    vectorHelper.invertVector();
                    
                     for (int i=0;i<vectorHelper.getVector().length;i++){
                        System.out.print((vectorHelper.getVector())[i]  );
                        }
                    
                  ;
                  break;
                case 3:
                    
                    System.out.println("Introduction du vecteur : ");
                    System.out.print("Donner sa demension : ");
                    n = sc.nextInt();
                    vector1=new int[n];
                    
                    for (int i=0;i<n;i++){
                        System.out.print("Introduire l'element "+(i+1));
                        vector1[i]=sc.nextInt();
                    }
                    vectorHelper = new VectorHelper(vector1);
                    System.out.print("Vecteur : ");
                    
                    for (int i=0;i<vectorHelper.getVector().length;i++){
                        System.out.print((vectorHelper.getVector())[i]  );
                        }
                    System.out.println();
                    System.out.print("Resultat du traitement : ");
                    vectorHelper.changeVector();
                    
                     for (int i=0;i<vectorHelper.getVector().length;i++){
                        System.out.print((vectorHelper.getVector())[i]  );
                        }
                    
                  ;
                  break;
                case 4:
                    
                    System.out.println("Introduction du vecteur : ");
                    System.out.print("Donner sa demension : ");
                    n = sc.nextInt();
                    vector1=new int[n];
                    
                    for (int i=0;i<n;i++){
                        System.out.print("Introduire l'element "+(i+1));
                        vector1[i]=sc.nextInt();
                    }
                    vectorHelper = new VectorHelper(vector1);
                    System.out.print("Vecteur : ");
                    
                    for (int i=0;i<vectorHelper.getVector().length;i++){
                        System.out.print((vectorHelper.getVector())[i]  );
                        }
                    System.out.println();
                    vectorHelper.getMinAndMax();
                    
                  ;
                  break;
                
                case 5:
                    
                    System.out.println("Introduction du premier vecteur : ");
                    System.out.print("Donner sa demension : ");
                    n = sc.nextInt();
                    vector1=new int[n];
                    
                    for (int i=0;i<n;i++){
                        System.out.print("Introduire l'element "+(i+1));
                        vector1[i]=sc.nextInt();
                    }
                    
                    vectorHelper = new VectorHelper(vector1);
                    n=0;
                    System.out.println("Introduction du deuxieme vecteur : ");
                    System.out.print("Donner sa demension : ");
                    n = sc.nextInt();
                    vector2=new int[n];
                    
                    for (int i=0;i<n;i++){
                        System.out.print("Introduire l'element "+(i+1));
                        vector2[i]=sc.nextInt();
                    }
                    
                    try{
                        vectorHelper.addVector(vector2);}
                    catch(Exception e){}
                    
                    System.out.print("Vecteur 1  : ");
                    
                   for (int i=0;i<vector1.length;i++){
                        System.out.print(vector1[i]  );
                        }
                    System.out.println();
                    
                    System.out.print("Vecteur 2  : ");
                    
                    for (int i=0;i<vector2.length;i++){
                        System.out.print(vector2[i]  );
                        }
                    System.out.println();
                    System.out.print("Resultat du traitement : ");
                    
                     for (int i=0;i<vectorHelper.getVector().length;i++){
                        System.out.print((vectorHelper.getVector())[i]  );
                        }
                    
                    
                  ;
                  break;
                default:
                  /*Action*/;             
        }

        
        
        
        
        
        
    }

}
