/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Controller.AddSubasta;
import Controller.Command;
import Model.ModelSubasta;
import View.SubastaDisplay;
import java.util.HashMap;

/**
 *
 * @author gabri
 */
public class MockSubasta {
    private SubastaDisplay subastaDisplay;
    private HashMap<String,Command> commands;
    private ModelSubasta subasta;

    public MockSubasta() {
        this.execute();
    }

    private void execute() {
        this.subastaDisplay=subastaDisplay;
        
        this.subasta=new ModelSubasta(subasta.getDescription(),subasta.getPictureList(),
                                      subasta.getCurrentPrice(),subasta.getPujasCounter(),
                                      subasta.getRemainingTime());
        
        this.subastaDisplay.display(subasta);
        commands.put("New Puja", new AddSubasta(subasta));
    }
    
    
}
