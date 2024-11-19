

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");

        int a = 3;
        int b = 2;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        float divisao =  (float) a / b;
        int resto = a % b;
        char c = 'a';
        String s = "Olá";
        boolean b1 = true;
        System.out.println("------------------------------------------------");
        System.out.println("OPERAÇÕES MATEMÁTICAS");

        System.out.println("O valor de c é: " + c);
        System.out.println("O valor de s é: " + s);
        System.out.println("O valor de b1 é: " + b1);
        System.out.println("O resultado da soma é: " + soma);
        System.out.println("O resultado da subtração é: " + subtracao);
        System.out.println("O resultado da multiplicação é: " + multiplicacao);
        System.out.println("O resultado da divisão é: " + divisao);
        System.out.println("O resultado do resto é: " + resto);

        System.out.println("------------------------------------------------");
        System.out.println("OPERADORES LÓGICOS");

        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println("Vamos à praia? " + vamosAPraia);
        
        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);

        //Alterando o valor para cair em : (else)
        fimDeSemana = false;
        mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);

        System.out.println("------------------------------------------------");
        System.out.println("ESTRUTURAS CONDICIONAIS");

        int nota = 70;

        // se nota maior ou igual a 70, então aprovado;
        //if-else
        if(nota >= 70) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Não aprovado");
        }
        nota = 50;
        if(nota >= 70) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Não aprovado");
        }

        nota = 80;
        //A 80 B 80 a 70 C 60 D 0
        if (nota >= 80){
            System.out.println("Graduação A");
        }
        else if (nota < 80 && nota >= 70){
            System.out.println("Graduação B");
        }
        else if (nota < 70 && nota >= 60){
            System.out.println("Graduação C");
        }
        else if (nota < 60 && nota >= 0){
            System.out.println("Graduação D");
        }
        else{
            System.out.println("Nota inválida!");
        }

        nota = 70;
        String graduacao;

        if (nota >= 80){
            graduacao = "A";
        }
        else if (nota < 80 && nota >= 70){
            graduacao = "B";
        }
        else if (nota < 70 && nota >= 60){
            graduacao = "C";
        }
        else if (nota < 60 && nota >= 0){
            graduacao = "D";
        }
        else{
            graduacao = "";
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Reprovado!");
                break;
            default:
                System.out.println("Graduação inválida!");
        }

        System.out.println("------------------------------------------------");
        System.out.println("MANIPULAÇÃO DE STRINGS E DATAS");

        //Olá, {nome}. Hoje é {dia-da-semana}, bom dia.

        String nome = "Yuri";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());

           

    }
}
