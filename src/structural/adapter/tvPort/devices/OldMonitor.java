package structural.adapter.tvPort.devices;

import structural.adapter.tvPort.interfaces.VGA;

public class OldMonitor implements VGA {

    @Override
    public void setImage(String image) {
        System.out.println(">>> This is your video: " + image);
    }
}
