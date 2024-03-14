package formatacaoTexto;

public class SublinhadoDecorator extends DecoradorTexto {
    public SublinhadoDecorator(Texto texto) {
        super(texto);
    }

    @Override
    public String formatado() {
        return "<u>" + texto.formatado() + "</u>";
    }
}