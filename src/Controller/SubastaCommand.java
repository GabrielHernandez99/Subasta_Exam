/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ModelSubasta;
import View.SubastaDisplay;
import View.SubastaListDisplay;
import View.SubastaLoader;
import View.SubastaStore;

/**
 *
 * @author gabri
 */
public class SubastaCommand implements Command{

    private final SubastaDisplay subastaDisplay;
    private final SubastaListDisplay subastaListDisplay;
    private final SubastaLoader subastaLoader;
    private final SubastaStore subastaStore;

    public SubastaCommand(SubastaDisplay subastaDisplay, SubastaListDisplay subastaListDisplay, SubastaLoader subastaLoader, SubastaStore subastaStore) {
        this.subastaDisplay = subastaDisplay;
        this.subastaListDisplay = subastaListDisplay;
        this.subastaLoader = subastaLoader;
        this.subastaStore = subastaStore;
        this.subastaListDisplay.on(SubastaDetected());
    }
    
    @Override
    public void execute() {
        
        
    }

    private SubastaListDisplay.Puja SubastaDetected() {
        return new SubastaListDisplay.Puja(){
          @Override
          public void detected(ModelSubasta subasta){
              subastaStore.store(subasta);
          }
        };
    }
    
}
