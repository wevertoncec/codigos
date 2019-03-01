/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refatora;
class Fatura 
{
    private double valorMensal = 2000;
    private String cliente="Weverton";
    public Fatura() {}
    public Fatura(double valorMensal, String cliente) 
    {
        this.valorMensal = valorMensal;
        this.cliente = cliente;
    }
    public double getValorMensal() 
    {
        return valorMensal;
    }
    public void setValorMensal(double valorMensal) 
    {
        this.valorMensal = valorMensal;
    }
    public String getCliente() 
    {
        return cliente;
    }
    public void setCliente(String cliente) 
    {
        this.cliente = cliente;
    }

}
