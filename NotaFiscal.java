package refatora;
class NotaFiscal 
{
    private int id = 1;
    private double valorBruto = 2000;
    private double impostos = 1500;
    public NotaFiscal()
    {
        id = 1;
        valorBruto = 2000;
        impostos = 1500;
    }
    public NotaFiscal(int id, double valorBruto, double impostos) 
    {
        this.id = id;
        this.valorBruto = valorBruto;
        this.impostos = impostos;
    }
    public NotaFiscal(double valorBruto, double impostos) 
    {
        this(0, valorBruto, impostos);
    }
    public int getId() 
    {
        return id;
    }
    public void setId(int id) 
    {
        this.id = id;
    }
    public double getValorBruto() 
    {
        return valorBruto;
    }
    public void setValorBruto(double valorBruto) 
    {
        this.valorBruto = valorBruto;
    }
    public double getImpostos() 
    {
        return impostos;
    }
    public void setImpostos(double impostos) 
    {
        this.impostos = impostos;
    }
    public double getValorLiquido() 
    {
        return this.valorBruto - this.impostos;
    }
}
