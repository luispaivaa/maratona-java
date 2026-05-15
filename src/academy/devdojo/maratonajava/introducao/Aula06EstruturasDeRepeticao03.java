package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        int maxValue = 50;
        for (int i = 0; i <= maxValue ; i++) {
            if(i > 25) {
                break; //quebra o laço de fora, não o IF
            }
            System.out.println(i);
        }
    }
}
