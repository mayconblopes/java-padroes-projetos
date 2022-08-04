package one.digitalinnovation.gof.strategy;
import lombok.Data;

@Data
public class Robo {

    private Comportamento comportamento;

    public void mover() {
        comportamento.mover();
    }

}
