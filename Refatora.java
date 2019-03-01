package refatora;
public class Refatora 
{
    public static void main(String[] args) 
    {
        Fatura fatura = new Fatura();
        GeradorDeNotaFiscal a = new GeradorDeNotaFiscal();
        NotaFiscal nf = new NotaFiscal(1, 2500, 1250);
        Fatura f = new Fatura();
        f.setValorMensal(2500);
        a.gerarNF(f);
    }
}
