public class Palindromo {
    public static boolean ePalindromo(String texto) {
        int i = 0; // Inicio da String
        int j = texto.length() - 1; //Fim da String

        while (i < j) {
            //Ignorar caracteres que não sejam letras no início
            while (i < j && !Character.isLetter(texto.charAt(i))) {
                i++;
            }
            //Ignorar caracteres que não sejam letras no fim
            while (i < j && !Character.isLetter((texto.charAt(j)))) {
                j--;
            }
            //Converter para minúsculas para que seja possivel comparar
            char inicio = Character.toLowerCase(texto.charAt(i));
            char fim = Character.toLowerCase(texto.charAt(j));

            //Garantir que só processe letras ASCII
            //Percorrer do inicio ao fim
            if (inicio < 'a' || inicio > 'z') {
                i++;
                continue;
            }
            //Percorrer do fim ao inicio
            if (fim < 'a' || fim > 'z') {
                j--;
                continue;
            }
            //Comparar as letras
            if (inicio != fim) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
