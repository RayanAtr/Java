package fr.hetic;

class Calculateur {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculateur <nombre> <nombre> <opérateur>");
            return;
        }
        
        
        double nombre1, nombre2;
        String operateur;
        
        try {
            nombre1 = Double.parseDouble(args[0]);
            nombre2 = Double.parseDouble(args[1]);
            operateur = args[2];
        } catch (NumberFormatException e) {
            System.out.println("Les deux premiers arguments doivent être des nombres valides.");
            return;
        }
        
       
        double resultat = 0;
        switch (operateur) {
            case "+":
                resultat = nombre1 + nombre2;
                break;
            case "-":
                resultat = nombre1 - nombre2;
                break;
            case "*":
                resultat = nombre1 * nombre2;
                break;
            default:
                System.out.println("Opérateur non pris en charge. Utilisez '+', '-' ou '*'.");
                return;
        }
        
    
        System.out.println("Résultat de " + nombre1 + " " + operateur + " " + nombre2 + " = " + resultat);
    }
}