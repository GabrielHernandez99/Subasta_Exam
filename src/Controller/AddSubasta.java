/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ModelSubasta;

/**
 *
 * @author gabri
 */
public class AddSubasta implements Command{
    private ModelSubasta subasta;

    public AddSubasta(ModelSubasta subasta) {
        this.subasta = subasta;
    }

    
    @Override
    public void execute() {
    }
    
    
}
