package edu.iis.powp.events.predefine;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.adapter.LinePlotterAdapter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectSpecialLineTypeOptionListener implements ActionListener {

    private LinePlotterAdapter speciaLinePlotter;

    public SelectSpecialLineTypeOptionListener(IPlotter usedPlotter){
        super();
        this.speciaLinePlotter = (LinePlotterAdapter) usedPlotter;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        speciaLinePlotter.setSpecialLineType();
    }
}