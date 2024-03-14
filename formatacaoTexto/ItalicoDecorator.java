package formatacaoTexto;

public class ItalicoDecorator extends DecoradorTexto {
    public ItalicoDecorator(Texto texto) {
        super(texto);
    }

    @Override
    public String formatado() {
        return "<i>" + texto.formatado() + "</i>";
    }
}
