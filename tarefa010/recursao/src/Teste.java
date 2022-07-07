import java.util.Random;

public class Teste {
    public static void main(String[] args) {
        Random gerador = new Random();
        long startTime;

        MergeSortRecursivo recursivo = new MergeSortRecursivo();
        MergeSortInterativo interativo = new MergeSortInterativo();

        /*Ordenação para vetor de 100*/
        int vetor100rec[] = new int[100];
        int vetor100int[] = new int[100];
        int tamanho1 = vetor100int.length;

        for (int i = 0; i < tamanho1; i++) {
            vetor100int[i] = gerador.nextInt(100);
            vetor100rec[i] = vetor100int[i];
        }

        startTime = System.currentTimeMillis();
        interativo.mergeSort(vetor100int);
        System.out.println("\nO tempo para executar a ordenacao com merge interativo para 100 numeros e: " + startTime);

        startTime = System.currentTimeMillis();
        recursivo.mergeSort(vetor100rec, 0, tamanho1 - 1);
        System.out.println("O tempo para executar a ordenacao com merge recursivo para 100 numeros e: " + startTime);

        /*Ordenação para vetor de 1000*/

        int vetor1000rec[] = new int[1000];
        int vetor1000int[] = new int[1000];
        int tamanho2 = vetor1000rec.length;

        for (int i = 0; i < tamanho2; i++) {
            vetor1000rec[i] = gerador.nextInt(1000);
            vetor1000int[i] = vetor1000rec[i];
        }

        startTime = System.currentTimeMillis();
        interativo.mergeSort(vetor1000int);
        System.out.println("\nO tempo para executar a ordenacao com merge interativo para 1000 numeros e: " + startTime);

        startTime = System.currentTimeMillis();
        recursivo.mergeSort(vetor1000rec, 0, tamanho2 - 1);
        System.out.println("O tempo para executar a ordenacao com merge recursivo para 1000 numeros e: " + startTime);



        /*Ordenação para vetor de 10000*/

        int vetor10000rec[] = new int[10000];
        int vetor10000int[] = new int[10000];
        int tamanho3 = vetor10000rec.length;

        for (int i = 0; i < tamanho3; i++) {
            vetor10000rec[i] = gerador.nextInt(10000);
            vetor10000int[i] = vetor10000rec[i];
        }

        startTime = System.currentTimeMillis();
        interativo.mergeSort(vetor10000int);
        System.out.println("\nO tempo para executar a ordenacao com merge interativo para 10000 numeros e: " + startTime);

        startTime = System.currentTimeMillis();
        recursivo.mergeSort(vetor10000rec, 0, tamanho3 - 1);
        System.out.println("O tempo para executar a ordenacao com merge recursivo para 10000 numeros e: " + startTime);

    }


}
