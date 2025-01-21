package edu.bruno.anatomiaClasses;
public class MinhaClasse {
    public static void main(String[] args){
        String primeiroNome = "Jamylle";
        String segundoNome = "Amaral";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

        String [] meus_nomes = {"Jamylle", "Bruno", "Amaral"}; // Array de Strings
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método" + " " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
