
import java.util.Scanner;

public class Projecte_Salut {

    // Límits
    public static final int MIN_TIS = 100000;
    public static final int MAX_TIS = 999999;
    public static final int MIN_SIMPTOMA = 0;
    public static final int MAX_SIMPTOMA = 3;
    public static final int MIN_EXPLORACIO = 0;
    public static final int MAX_EXPLORACIO = 3;
    public static final int MIN_PRIORITAT = 1;
    public static final int MAX_PRIORITAT = 5;
    public static final int MIN_TEMP = 27;
    public static final int MAX_TEMP = 45;
    public static int MAX_PACIENTS = 10;

    // Simptomes
    public static final String DOLOR = "Dolor";
    public static final String LESIO_TRAUMATICA = "Lesió traumàtica";
    public static final String FEBRE_ALTA = "Febre alta";
    public static final String CONFUSIO = "Conf-Desorient.";

    // Exploracions Dolor
    public static final String TORACIC = "Dolor toràcic";
    public static final String ABDOMINAL = "Dolor abdominal";
    public static final String CAP = "Dolor cap";
    public static final String MIGRANYA = "Migranya";

    // Exploracions Lesió trauma
    public static final String OSSIA = "Fractura òssia";
    public static final String BALA = "Ferida de bala";
    public static final String CREMADA = "Cremada";
    public static final String CEREBRAL = "Lesió cerebral traumàtica";

    // Exploracions Febre alta
    public static final String PNEUMONIA = "Pneumònia";
    public static final String MENINGITIS = "Meningitis";
    public static final String INFECCIO = "Infecció Viral";
    public static final String ALERGIA = "Reacció alérgica";

    // Exploracions CiD
    public static final String INTOXICACIO = "Intoxicació per drogues o alcohol";
    public static final String DESHIDRATACIO = "Deshidratació severa";
    public static final String ACCIDENT_CV = "Accident cerebrovascular";
    public static final String HIPOGLUCEMIA = "Hipoglucèmia severa";

    // Aquí les variables strings
    public static String simptoma;
    public static String exploracio;

    // Aquí les variables numériques
    public static int TIS;
    public static int numSimptoma;
    public static int numExploracio;
    public static int nivellPrioritat;
    public static int temperaturaActual;

    // Aquí les variables boolean
    public static boolean isError = false;
    public static boolean nouPacient = false;
    public static boolean respostaNPcorrecte = true;

    public static int respostaNouPacient;
    public static int intentsFets = 0;
    public static int numeroPacients = 0;
    public static int consultaSimptomaOK = 1;
    public static int consultaSimptomaKO = 0;
    public static int respostaSimptoma;
    public static int estadistiquesOK = 1;
    public static int estadistiquesKO = 0;
    public static int respostaEstadistiques;

    // Variables comptador
    public static int dolorComptador = 0;
    public static int ltComptador = 0;
    public static int febreComptador = 0;
    public static int confusioComptador = 0;
    public static int prioritat1Comptador;
    public static int prioritat2Comptador;
    public static int prioritat3Comptador;
    public static int prioritat4Comptador;
    public static int prioritat5Comptador;


    public static void main(String[] args) {


        int[] llistaTIS = new int[MAX_PACIENTS];
        int[] llistaSimptoma = new int[MAX_PACIENTS];
        int[] llistaExploracio = new int[MAX_PACIENTS];
        int[] llistaPrioritat = new int[MAX_PACIENTS];
        int[] llistaTemperatura = new int[MAX_PACIENTS];

        Scanner entrada = new Scanner(System.in);

        System.out.println("Benvingut/da!");
        do {
            intentsFets = 0;
            do {
                intentsFets++;
                // Demanem TIS
                System.out.println("Si us plau, introdueixi el seu TIS.");

                isError = !entrada.hasNextInt(); // si no es sencer registra
                // error
                if (!isError) {
                    TIS = entrada.nextInt(); // Guardem
                    isError = TIS < MIN_TIS || TIS > MAX_TIS;
                    if (!isError) {
                        llistaTIS[numeroPacients] = TIS;
                        intentsFets = 0;
                        do {
                            intentsFets++;
                            System.out.println("\nQuin símptoma presenta?:");
                            System.out.println("  " + DOLOR + "(0)");
                            System.out.println("  " + LESIO_TRAUMATICA + "(1)");
                            System.out.println("  " + FEBRE_ALTA + "(2)");
                            System.out.println("  " + CONFUSIO + "(3)");
                            isError = !entrada.hasNextInt();

                            if (!isError) { // si es sencer seguim
                                numSimptoma = entrada.nextInt();
                                isError = numSimptoma < MIN_SIMPTOMA
                                        || numSimptoma > MAX_SIMPTOMA;
                                llistaSimptoma[numeroPacients] = numSimptoma;
                            }

                            if (isError && intentsFets != 3) {
                                System.out.println("Error en dades.");
                                entrada.nextLine();
                            }
                        } while (isError && intentsFets < 3);

                        if (!isError) {
                            intentsFets = 0;
                            do {
                                intentsFets++;
                                System.out.println("\nQuin ha sigut el resultat de la exploració?:");
                                switch (numSimptoma) {

                                    case 0:
                                        dolorComptador++;
                                        simptoma = DOLOR;
                                        System.out.println(
                                                "  " + TORACIC + "(0)");
                                        System.out.println(
                                                "  " + ABDOMINAL + "(1)");
                                        System.out.println("  " + CAP + "(2)");
                                        System.out.println(
                                                "  " + MIGRANYA + "(3)");

                                        break;

                                    case 1:
                                        ltComptador++;
                                        simptoma = LESIO_TRAUMATICA;
                                        System.out
                                                .println("  " + OSSIA + "(0)");
                                        System.out.println("  " + BALA + "(1)");
                                        System.out.println(
                                                "  " + CREMADA + "(2)");
                                        System.out.println(
                                                "  " + CEREBRAL + "(3)");

                                        break;

                                    case 2:
                                        febreComptador++;
                                        simptoma = FEBRE_ALTA;
                                        System.out.println(
                                                "  " + PNEUMONIA + "(0)");
                                        System.out.println(
                                                "  " + MENINGITIS + "(1)");
                                        System.out.println(
                                                "  " + INFECCIO + "(2)");
                                        System.out.println(
                                                "  " + ALERGIA + "(3)");

                                        break;

                                    case 3:
                                        confusioComptador++;
                                        simptoma = CONFUSIO;
                                        System.out.println(
                                                "  " + INTOXICACIO + "(0)");
                                        System.out.println(
                                                "  " + DESHIDRATACIO + "(1)");
                                        System.out.println(
                                                "  " + ACCIDENT_CV + "(2)");
                                        System.out.println(
                                                "  " + HIPOGLUCEMIA + "(3)");

                                        break;
                                }
                                isError = !entrada.hasNextInt();
                                if (!isError) { // si es sencer pasem a
                                    // comprobar el
                                    // rang
                                    numExploracio = entrada.nextInt();
                                    isError = numExploracio < MIN_EXPLORACIO
                                            || numExploracio > MAX_EXPLORACIO;
                                    llistaExploracio[numeroPacients] = numExploracio;
                                }
                                if (isError && intentsFets != 3) {
                                    System.out.println("Error en dades.");
                                    entrada.nextLine();
                                }
                            } while (isError && intentsFets < 3);
                            if (!isError) {

                                switch (numSimptoma) {
                                    case 0:
                                        switch (numExploracio) {
                                            case 0:
                                                exploracio = TORACIC;
                                                break;
                                            case 1:
                                                exploracio = ABDOMINAL;
                                                break;
                                            case 2:
                                                exploracio = CAP;
                                                break;
                                            case 3:
                                                exploracio = MIGRANYA;
                                                break;
                                        }
                                        break;
                                    case 1:
                                        switch (numExploracio) {
                                            case 0:
                                                exploracio = OSSIA;
                                                break;
                                            case 1:
                                                exploracio = BALA;
                                                break;
                                            case 2:
                                                exploracio = CREMADA;
                                                break;
                                            case 3:
                                                exploracio = CEREBRAL;
                                                break;
                                        }

                                        break;
                                    case 2:
                                        switch (numExploracio) {
                                            case 0:
                                                exploracio = PNEUMONIA;
                                                break;

                                            case 1:
                                                exploracio = MENINGITIS;
                                                break;

                                            case 2:
                                                exploracio = INFECCIO;
                                                break;

                                            case 3:
                                                exploracio = ALERGIA;
                                                break;
                                        }
                                        break;
                                    case 3:
                                        switch (numExploracio) {
                                            case 0:
                                                exploracio = INTOXICACIO;
                                                break;

                                            case 1:
                                                exploracio = DESHIDRATACIO;
                                                break;

                                            case 2:
                                                exploracio = ACCIDENT_CV;
                                                break;

                                            case 3:
                                                exploracio = HIPOGLUCEMIA;
                                                break;
                                        }
                                        break;

                                }
                                intentsFets = 0;
                                do {
                                    intentsFets++;
                                    System.out
                                            .println("\nQuin nivell de prioritat considera en una escala entre " + MIN_PRIORITAT + " i " + MAX_PRIORITAT + " ?.");
                                    isError = !entrada.hasNextInt();
                                    if (!isError) { // si es sencer seguim
                                        nivellPrioritat = entrada.nextInt();
                                        isError = nivellPrioritat < MIN_PRIORITAT
                                                || nivellPrioritat > MAX_PRIORITAT;
                                        llistaPrioritat[numeroPacients] = nivellPrioritat;
                                    }
                                    if (isError && intentsFets != 3) {
                                        System.out.println("Error en dades.");
                                        entrada.nextLine();
                                    }
                                } while (isError && intentsFets < 3);
                                if (nivellPrioritat == 1) {
                                    prioritat1Comptador++;
                                }
                                if (nivellPrioritat == 2) {
                                    prioritat2Comptador++;
                                }
                                if (nivellPrioritat == 3) {
                                    prioritat3Comptador++;
                                }
                                if (nivellPrioritat == 4) {
                                    prioritat4Comptador++;
                                }
                                if (nivellPrioritat == 5) {
                                    prioritat5Comptador++;
                                }
                                if (!isError) {
                                    intentsFets = 0;
                                    do {
                                        intentsFets++;
                                        System.out.println(
                                                "\nQuina es la seva temperatura actual en un rang entre " + MIN_TEMP + " i " + MAX_TEMP + " graus?");
                                        isError = !entrada.hasNextInt();
                                        System.out.println();
                                        if (!isError) { // si es sencer seguim
                                            temperaturaActual = entrada
                                                    .nextInt();
                                            isError = temperaturaActual < MIN_TEMP
                                                    || temperaturaActual > MAX_TEMP;
                                            llistaTemperatura[numeroPacients] = temperaturaActual;
                                        }
                                        if (isError && intentsFets != 3) {
                                            System.out
                                                    .println("Error en dades.");
                                            entrada.nextLine();
                                        }
                                    } while (isError && intentsFets < 3);
                                }
                            }
                        }
                    }
                }

                if (isError && intentsFets < 3) {
                    System.out.println("Error en dades.");
                    entrada.nextLine();
                } else if (isError && intentsFets == 3) {
                    System.out
                            .println("Programa finalitzat per error en dades");
                    isError = false;

                } else { // aqui suposem que está dintre del rang

                    numeroPacients++;
                }

            } while (isError && intentsFets < 3);
            // demanem si es vol introduir nou pacient a la bdd

            System.out.println("\nVol introduir un altre pacient? Si(1),No(0)");

            // es sencer?
            do {
                respostaNPcorrecte = entrada.hasNextInt();
                if (respostaNPcorrecte) {
                    // si es sencer mirem si está dins el rang
                    respostaNouPacient = entrada.nextInt();
                    // si diu que si sortim del bucle i pasem a entrar dades
                    // tis, simptoma...
                    if (respostaNouPacient == 1) {
                        nouPacient = true;
                        // si diu que no pasem directament al print final del
                        // resumde pacients i tanquem el programa
                    } else if (respostaNouPacient == 0) {
                        nouPacient = false;
                    } else {
                        // si fica un altre número que no sigui ni 1 ni 0 li
                        // tornem a demanar
                        System.out.println("Torni a introduir");
                        respostaNPcorrecte = false;
                    }
                } else {
                    // si fica un no sencer li tornem a demanar
                    System.out.println("Torni a introduir");
                    entrada.next();
                    respostaNPcorrecte = false;
                }

            } while (!respostaNPcorrecte);

        } while (nouPacient);
        // print del registre de pacients totals
        System.out.println();

        System.out.printf("%-7s %-19s %-19s %-19s %-19s", "TIS",
                "Símptoma", "Exploració", "Nivell prioritat",
                "Temperatura actual\n");
        System.out.printf("%-7s %-19s %-19s %-19s %-19s", "------",
                "------------------", "------------------", "------------------",
                "------------------\n");

        for (int i = 0; i < numeroPacients; i++) {
            System.out.printf("%-8d", llistaTIS[i]);

            if (llistaSimptoma[i] == 0) {
                System.out.printf("%-20s", DOLOR);
                switch (llistaExploracio[i]) {
                    case 0:
                        System.out.printf("%-36s", TORACIC);
                        break;
                    case 1:
                        System.out.printf("%-36s", ABDOMINAL);
                        break;
                    case 2:
                        System.out.printf("%-36s", CAP);
                        break;
                    case 3:
                        System.out.printf("%-36s", MIGRANYA);
                        break;
                }
            } else if (llistaSimptoma[i] == 1) {
                System.out.printf("%-20s", LESIO_TRAUMATICA);
                switch (llistaExploracio[i]) {
                    case 0:
                        System.out.printf("%-36s", OSSIA);
                        break;
                    case 1:
                        System.out.printf("%-36s", BALA);
                        break;
                    case 2:
                        System.out.printf("%-36s", CREMADA);
                        break;
                    case 3:
                        System.out.printf("%-36s", CEREBRAL);
                        break;
                }
            } else if (llistaSimptoma[i] == 2) {
                System.out.printf("%-20s", FEBRE_ALTA);
                switch (llistaExploracio[i]) {
                    case 0:
                        System.out.printf("%-36s", PNEUMONIA);
                        break;
                    case 1:
                        System.out.printf("%-36s", MENINGITIS);
                        break;
                    case 2:
                        System.out.printf("%-36s", INFECCIO);
                        break;
                    case 3:
                        System.out.printf("%-36s", ALERGIA);
                        break;
                }
            } else if (llistaSimptoma[i] == 3) {
                System.out.printf("%-20s", CONFUSIO);
                switch (llistaExploracio[i]) {
                    case 0:
                        System.out.printf("%-36s", INTOXICACIO);
                        break;
                    case 1:
                        System.out.printf("%-36s", DESHIDRATACIO);
                        break;
                    case 2:
                        System.out.printf("%-36s", ACCIDENT_CV);
                        break;
                    case 3:
                        System.out.printf("%-36s", HIPOGLUCEMIA);
                        break;
                }
            }
            System.out.printf("%-20d", llistaPrioritat[i]);
            System.out.printf("%-20d", llistaTemperatura[i]);
            System.out.println();
        }
        if (numeroPacients == 1) {
            System.out.println("\nS'han introduït " + numeroPacients
                    + " registre de pacients");
        } else {
            System.out.println("\nS'han introduït " + numeroPacients
                    + " registres de pacients");

        };
        System.out.println();
        // Preguntem a l'usuari si vol fer una consulta per símptoma
        System.out.println("Vol consultar per tipus de simptoma?(si: 1/ no: 0)");
        do {
            if (!entrada.hasNextInt()) {
                System.out.println("Error de dades, contesti " + consultaSimptomaOK + " o " + consultaSimptomaKO);
            } else {
                respostaSimptoma = entrada.nextInt();
                if (respostaSimptoma != 0 && respostaSimptoma != 1) {
                    System.out.println("Error de dades, contesti " + consultaSimptomaOK + " o " + consultaSimptomaKO);
                    entrada.nextLine();
                } else {
                    isError = false;
                }
            }
        } while (isError || respostaSimptoma != 0 && respostaSimptoma != 1);
        // Ordenem la consulta per símptoma amb l'algorisme d'ordenació BubbleSort
        for (int i = 0; i < numeroPacients - 1; i++) {
            for (int j = i + 1; j < numeroPacients; j++) {
                if (llistaPrioritat[i] < llistaPrioritat[j]) {
                    int canviPrioritat = llistaPrioritat[i];
                    llistaPrioritat[i] = llistaPrioritat[j];
                    llistaPrioritat[j] = canviPrioritat;

                    int canviTIS = llistaTIS[i];
                    llistaTIS[i] = llistaTIS[j];
                    llistaTIS[j] = canviTIS;

                    int canviSimproma = llistaSimptoma[i];
                    llistaSimptoma[i] = llistaSimptoma[j];
                    llistaSimptoma[j] = canviSimproma;

                    int canviExploracio = llistaExploracio[i];
                    llistaExploracio[i] = llistaExploracio[j];
                    llistaExploracio[j] = canviExploracio;

                    int canviTemperatura = llistaTemperatura[i];
                    llistaTemperatura[i] = llistaTemperatura[j];
                    llistaTemperatura[j] = canviTemperatura;
                }
            }
        }
        if (respostaSimptoma == consultaSimptomaOK) {
            System.out.println("Quin tipus de símptoma?");
            System.out.println("  " + DOLOR + "(0)");
            System.out.println("  " + LESIO_TRAUMATICA + "(1)");
            System.out.println("  " + FEBRE_ALTA + "(2)");
            System.out.println("  " + CONFUSIO + "(3)");
            do {
                if (!entrada.hasNextInt()) {
                    System.out.println("Tipus incorrecte, torni a introduir");
                    entrada.nextLine();
                } else {
                    numSimptoma = entrada.nextInt();
                    if (numSimptoma < 0 || numSimptoma > 3) {
                        System.out.println("Tipus incorrecte, torni a introduir");
                        entrada.nextLine();
                    } else {
                        isError = false;
                    }
                }
            } while (isError || numSimptoma < 0 || numSimptoma > 3);
            if (numSimptoma == 0) {
                System.out.println("Dades de pacients amb símptoma: " + DOLOR);
                System.out.printf("%-7s %-19s %-19s %-19s %-19s", "TIS",
                        "Símptoma", "Exploració", "Nivell prioritat",
                        "Temperatura actual\n");
                System.out.printf("%-7s %-19s %-19s %-19s %-19s", "------",
                        "------------------", "------------------", "------------------",
                        "------------------\n");

                for (int i = 0; i < numeroPacients; i++) {
                    if (llistaSimptoma[i] == 0) {
                        System.out.printf("%-8d", llistaTIS[i]);
                        System.out.printf("%-20s", DOLOR);
                        switch (llistaExploracio[i]) {
                            case 0:
                                System.out.printf("%-36s", TORACIC);
                                break;
                            case 1:
                                System.out.printf("%-36s", ABDOMINAL);
                                break;
                            case 2:
                                System.out.printf("%-36s", CAP);
                                break;
                            case 3:
                                System.out.printf("%-36s", MIGRANYA);
                                break;
                        }

                        System.out.printf("%-20d", llistaPrioritat[i]);
                        System.out.printf("%-20d", llistaTemperatura[i]);
                        System.out.println();
                    }

                }
            } else if (numSimptoma == 1) {
                System.out.println("Dades de pacients amb símptoma: " + LESIO_TRAUMATICA);
                System.out.printf("%-7s %-19s %-19s %-19s %-19s", "TIS",
                        "Símptoma", "Exploració", "Nivell prioritat",
                        "Temperatura actual\n");
                System.out.printf("%-7s %-19s %-19s %-19s %-19s", "------",
                        "------------------", "------------------", "------------------",
                        "------------------\n");

                for (int i = 0; i < numeroPacients; i++) {
                    if (llistaSimptoma[i] == 1) {
                        System.out.printf("%-8d", llistaTIS[i]);
                        System.out.printf("%-20s", LESIO_TRAUMATICA);
                        switch (llistaExploracio[i]) {
                            case 0:
                                System.out.printf("%-36s", OSSIA);
                                break;
                            case 1:
                                System.out.printf("%-36s", BALA);
                                break;
                            case 2:
                                System.out.printf("%-36s", CREMADA);
                                break;
                            case 3:
                                System.out.printf("%-36s", CEREBRAL);
                                break;
                        }
                        System.out.printf("%-20d", llistaPrioritat[i]);
                        System.out.printf("%-20d", llistaTemperatura[i]);
                        System.out.println();
                    }

                }

            } else if (numSimptoma == 2) {
                System.out.println("Dades de pacients amb símptoma: " + FEBRE_ALTA);
                System.out.printf("%-7s %-19s %-19s %-19s %-19s", "TIS",
                        "Símptoma", "Exploració", "Nivell prioritat",
                        "Temperatura actual\n");
                System.out.printf("%-7s %-19s %-19s %-19s %-19s", "------",
                        "------------------", "------------------", "------------------",
                        "------------------\n");

                for (int i = 0; i < numeroPacients; i++) {
                    if (llistaSimptoma[i] == 2) {
                        System.out.printf("%-8d", llistaTIS[i]);
                        System.out.printf("%-20s", FEBRE_ALTA);
                        switch (llistaExploracio[i]) {
                            case 0:
                                System.out.printf("%-36s", PNEUMONIA);
                                break;
                            case 1:
                                System.out.printf("%-36s", MENINGITIS);
                                break;
                            case 2:
                                System.out.printf("%-36s", INFECCIO);
                                break;
                            case 3:
                                System.out.printf("%-36s", ALERGIA);
                                break;
                        }
                        System.out.printf("%-20d", llistaPrioritat[i]);
                        System.out.printf("%-20d", llistaTemperatura[i]);
                        System.out.println();
                    }
                }

            } else if (numSimptoma == 3) {
                System.out.println("Dades de pacients amb símptoma: " + CONFUSIO);
                System.out.printf("%-7s %-19s %-19s %-19s %-19s", "TIS",
                        "Símptoma", "Exploració", "Nivell prioritat",
                        "Temperatura actual\n");
                System.out.printf("%-7s %-19s %-19s %-19s %-19s", "------",
                        "------------------", "------------------", "------------------",
                        "------------------\n");

                for (int i = 0; i < numeroPacients; i++) {
                    if (llistaSimptoma[i] == 3) {
                        System.out.printf("%-8d", llistaTIS[i]);
                        System.out.printf("%-20s", CONFUSIO);
                        switch (llistaExploracio[i]) {
                            case 0:
                                System.out.printf("%-36s", INTOXICACIO);
                                break;
                            case 1:
                                System.out.printf("%-36s", DESHIDRATACIO);
                                break;
                            case 2:
                                System.out.printf("%-36s", ACCIDENT_CV);
                                break;
                            case 3:
                                System.out.printf("%-36s", HIPOGLUCEMIA);
                                break;
                        }
                        System.out.printf("%-20d", llistaPrioritat[i]);
                        System.out.printf("%-20d", llistaTemperatura[i]);
                        System.out.println();
                    }

                }

            }
            System.out.println();

            // Preguntem a l'usuari si vol un resum estadístic
            System.out.println("Vols veure un resum estadístic de les dades? (si: 1/ no:0) ");
            do {
                if (!entrada.hasNextInt()) {
                    System.out.println("Error de dades, contesti " + estadistiquesOK + " o " + estadistiquesKO);
                } else {
                    respostaEstadistiques = entrada.nextInt();
                    if (respostaEstadistiques != 0 && respostaEstadistiques != 1) {
                        System.out.println("Error de dades, contesti " + estadistiquesOK + " o " + estadistiquesKO);
                        entrada.nextLine();
                    } else {
                        isError = false;
                    }
                }
            } while (isError || respostaEstadistiques != 0 && respostaEstadistiques != 1);

            // Tanquem la clase scanner perqué l'usuari no introduirá més dades
            entrada.close();

            // Treiem per pantalla el resum de les estadístiques dels pacients introduits
            if (respostaEstadistiques == 1) {
                System.out.println("Número de pacients introduïts: " + numeroPacients + "\n");
                System.out.println("Número de pacients per símptomes:\n");
                if (dolorComptador != 0) {
                    System.out.println("\t" + DOLOR + " : " + dolorComptador);
                }
                if (ltComptador != 0) {
                    System.out.println("\t" + LESIO_TRAUMATICA + " : " + ltComptador);
                }
                if (febreComptador != 0) {
                    System.out.println("\t" + FEBRE_ALTA + " : " + febreComptador);
                }
                if (confusioComptador != 0) {
                    System.out.println("\t" + CONFUSIO + " : " + confusioComptador);
                }
                System.out.println();
                System.out.println("Número de pacients per nivell de prioritat:\n");
                if (prioritat5Comptador != 0) {
                    System.out.println("\tPrioritat 5: " + prioritat5Comptador);
                }
                if (prioritat4Comptador != 0) {
                    System.out.println("\tPrioritat 4: " + prioritat4Comptador);
                }
                if (prioritat3Comptador != 0) {
                    System.out.println("\tPrioritat 3: " + prioritat3Comptador);
                }
                if (prioritat2Comptador != 0) {
                    System.out.println("\tPrioritat 2: " + prioritat2Comptador);
                }
                if (prioritat1Comptador != 0) {
                    System.out.println("\tPrioritat 1: " + prioritat1Comptador);
                }
            }
        }

    }
}