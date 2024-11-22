


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");

        
        // variaveis();
        // operadoresAritmeticos();
        // operadoresLogicos();
        // estruturasCondicionais();
        // stringsEDatas();
        // lacosNumericos();
        vetores();
    }
    
    public static void variaveis() {
        System.out.println("------------------------------------------------");
        System.out.println("VARIÁVEIS");

        char c = 'a';
        String s = "Olá";
        boolean b1 = true;
        int d = 5;
        System.out.println("O valor de c é: " + c);
        System.out.println("O valor de s é: " + s);
        System.out.println("O valor de b1 é: " + b1);
        System.out.println("O valor de d é: " + d);
        
    }

    public static void operadoresAritmeticos() {
        System.out.println("------------------------------------------------");
        System.out.println("OPERADORES ARITMÉTICOS");
        int a = 3;
        int b = 2;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        float divisao =  (float) a / b;
        int resto = a % b;
        
        System.out.println("O resultado da soma é: " + soma);
        System.out.println("O resultado da subtração é: " + subtracao);
        System.out.println("O resultado da multiplicação é: " + multiplicacao);
        System.out.println("O resultado da divisão é: " + divisao);
        System.out.println("O resultado do resto é: " + resto);
        
    }

    public static void operadoresLogicos() {
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
    }

    public static void estruturasCondicionais() {
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
    }

    public static void stringsEDatas(){
        System.out.println("------------------------------------------------");
        System.out.println("MANIPULAÇÃO DE STRINGS E DATAS");

        //Olá, {nome}. Hoje é {dia-da-semana}, bom dia.

        String nome = "Yuri";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());

        String nomeOutro = "Yuri";
        System.out.println(nome.equals(nomeOutro));

        nomeOutro = "yuri";
        System.out.println(nome.equals(nomeOutro));

        System.out.println(nome.equalsIgnoreCase(nomeOutro));

        // ISO 8681
        LocalDate hoje = LocalDate.now();
        String language = "pt";
        String country = "BR";
        Locale pais = Locale.of(language, country);

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, pais);
        System.out.println(diaSemana);
        
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "Bom dia";
        }
        else if(agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "Boa tarde";
        }
        else if(agora.getHour() >= 18 && agora.getHour() < 24){
            saudacao = "Boa noite";
        }
        else{
            saudacao = "";
        }
        System.out.printf("Olá, %s. Hoje é %s, e são %s:%s, %s.%n", nome, diaSemana, agora.getHour(),agora.getMinute(),saudacao.toUpperCase());
        
    }

    public static void lacosNumericos(){
        System.out.println("------------------------------------------------");
        System.out.println("LAÇOS NUMÉRICOS");

        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + " = " + i * j);
                //para cada iteração do i, terá 10 iterações do j
            }
        }
    }

    public static void vetores(){
        System.out.println("------------------------------------------------");
        System.out.println("VETORES");

        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;
        int numero4 = 4;
        int numero5 = 5;
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);
        System.out.println(numero4);
        System.out.println(numero5);
        System.out.printf("%d,%d,%d,%d,%d\n", numero1, numero2, numero3, numero4, numero5);


        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        for (int i=0; i<numeros.length; i++)
            System.out.println(numeros[i]);

        int[] numeros2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(numeros2));

        String[] letras = {"A","B","C","D","E"};
        System.out.println(Arrays.toString(letras));

        // verificar maior, menor e média
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;


        for (int i=0; i < numeros.length;i++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }
            if(numeros[i] < menor){
                menor = numeros[i];
            }
            media += numeros[i];
        }
        System.out.printf("Maior = %d, Menor = %d, Média = %d\n", maior,menor,media/numeros.length);
    }
}
