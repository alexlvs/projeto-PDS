
package formatacaoTexto;
public class main {
    public static void main(String[] args) {
        Texto texto = new TextoSimples("Exemplo de texto formatado");

        Texto textoNegrito = new NegritoDecorator(texto);
        Texto textoItalico = new ItalicoDecorator(texto);
        Texto textoSublinhado = new SublinhadoDecorator(texto);

        System.out.println("Texto normal: " + texto.formatado());
        System.out.println("Texto em negrito: " + textoNegrito.formatado());
        System.out.println("Texto em itálico: " + textoItalico.formatado());
        System.out.println("Texto sublinhado: " + textoSublinhado.formatado());
    }
}