package estruturais.adapter.tvPort.adapters;

import estruturais.adapter.tvPort.devices.OldMonitor;
import estruturais.adapter.tvPort.interfaces.HDMI;

public class HTMIToOldMonitorAdapter extends OldMonitor implements HDMI {

    public HTMIToOldMonitorAdapter(){
        super();
        System.out.println("Wrapping the VGA's OldMonitor's Interface with a HDMI adapter.");
    }

    // This method is not mandatory because it is already being inherited
    @Override
    public void setImage(String image) {
        System.out.println("Converting the image from HDMI to VGA");
        super.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sorry, we don't work with sound");
    }
}
