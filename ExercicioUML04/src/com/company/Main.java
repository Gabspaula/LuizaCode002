package com.company;

public class Main {

    public static void main(String[] args) {
        // Imprima o nome do prof e seu curso //
        Professor prof01 = new Professor("Solange", "Ciencias", 4546, 5000.00, 30);
        System.out.println("Prof. " + prof01.getNome() + " curso ministrado " + prof01.getCurso());

        // Salario total professor, valor hora aula * aulas ministradas //
        prof01.salarioProf();
        System.out.println("\n \n ");

        // Criando aluno e calculando media //
        Aluno aluno01 = new Aluno("Joao", 8, 7);
        aluno01.calcularMedia();



    }
}
