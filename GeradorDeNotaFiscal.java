
package refatora;
public class GeradorDeNotaFiscal 
{
    public void gerarNF(Fatura fatura)
    {
        gera(fatura);
        enviaEmail();
        gravarDados();
    }
    public NotaFiscal gera(Fatura fatura) 
    {
        // calcula valor do imposto
        double valor = fatura.getValorMensal();
        double imposto = 200;
        if(valor < 200) 
        {
            imposto = valor * 0.03;
        }
        else if(valor > 200 && valor <= 1000) 
        {
            imposto = valor * 0.06;
        }
        else 
        {
            imposto = valor * 0.07;
        }
        NotaFiscal nf = new NotaFiscal(valor, imposto);
        return nf;
    }
    public void enviaEmail()
    {
        gerarEmail();
    }

    public void gerarEmail() {
        // envia email
        NotaFiscal nf = new NotaFiscal();
        String msgDoEmail = "Caro cliente,<br/>";
        msgDoEmail += "É com prazer que lhe avisamos que sua nota fiscal foi "
                + "gerada no valor de " + nf.getValorLiquido() + ".<br/>";
        msgDoEmail += "Acesse o site da prefeitura e faça o download.<br/><br/>";
        msgDoEmail += "Obrigado!";
        System.out.println(msgDoEmail);
    }
    public void gravarDados()
    {
        // salva no banco
        NotaFiscal nf = new NotaFiscal();
        String sql = "insert into notafiscal (cliente, valor)"+
                     "values (?," + nf.getValorLiquido() + ")";
	System.out.println("Salvando no banco" + sql);
    }
}



