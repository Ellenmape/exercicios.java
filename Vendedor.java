package com.mycompany.heranca;

import java.util.Date;

public class Vendedor extends Funcionario{
    private int totalitemVendido;
    private float comissaoporItem;
    
    public Vendedor(){
        super();
    }
    public float calcularSalario(){
        return super.getSalario() + (this.comissaoporItem * totalitemVendido);
       }

    public int getTotalitemVendido() {
        return totalitemVendido;
    }

    public void setTotalitemVendido(int totalitemVendido) {
        this.totalitemVendido = totalitemVendido;
    }

    public float getComissaoporItem() {
        return comissaoporItem;
    }

    public void setComissaoporItem(float comissaoporItem) {
        this.comissaoporItem = comissaoporItem;
    }
                
}