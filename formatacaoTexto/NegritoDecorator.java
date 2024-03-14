package formatacaoTexto;

public class NegritoDecorator extends DecoradorTexto {
    public NegritoDecorator(Texto texto) {
        super(texto);
    }

    @Override
    public String formatado() {
        return "<b>" + texto.formatado() + "</b>";
    }
}