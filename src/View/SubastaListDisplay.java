/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.ModelSubasta;

/**
 *
 * @author gabri
 */
public interface SubastaListDisplay {
    void on(Puja puja);

    public interface Puja {
        void detected(ModelSubasta subasta);
    }
    
    
}
