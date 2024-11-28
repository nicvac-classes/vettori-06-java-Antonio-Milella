//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
        System.out.println("Quanti atleti ci sono in gara?");
        int n = in.nextInt();
        in.nextLine(); 

        String nomi[] = new nomi[n];
        String nazionali[] = new nazionali[n];
        float tempi[] = new tempi[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nome del " + (i + 1) + "° atleta: ");
            nomi[i] = in.nextLine();

            System.out.println("Nazionale del " + (i + 1) + "° atleta: ");
            nazionali[i] = in.nextLine();

            System.out.println("Tempo del " + (i + 1) + "° atleta: ");
            tempi[i] = in.nextFloat();
        }

        System.out.println("Informazioni inserite:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "° atleta: " + nomi[i] +
                    "; nazionale: " + nazionali[i] +
                    "; tempo: " + tempi[i]);
        }

        System.out.println("Ricerca dell'atleta vincitore...");

        int iMin = 0;
        float min = tempi[0];
        for (int i = 1; i < n; i++) {
            if (tempi[i] < min) {
                iMin = i;
                min = tempi[i];
            }
        }

        System.out.println("Atleta vincitore: " + nomi[iMin] +
                "; nazionale: " + nazionali[iMin] +
                "; tempo: " + tempi[iMin]);
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md