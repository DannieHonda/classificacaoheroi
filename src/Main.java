import javax.sound.midi.MidiFileFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] herois = {{"Ferro", "1000"},
                {"Bronze", "2000"},
                {"Prata", "5000"},
                {"Ouro", "7000"},
                {"Platina", "8000"},
                {"Ascendente", "9000"},
                {"Imortal", "10000"},
                {"Radiante", "10001"}};

        int maiorNivelXp = 10001;

        for (int x = 0; x < herois.length; x++) {
            String classificacaoHeroi = herois[x][0];
            int nivelXpHeroi = Integer.parseInt(herois[x][1]);

            if (nivelXpHeroi >= maiorNivelXp) {
                System.out.println("O Herói de nome " + classificacaoHeroi + " está no nível " + nivelXpHeroi);
            }
        }
    }
}