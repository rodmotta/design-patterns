package structural.adapter.tvPort.client;

import structural.adapter.tvPort.adapters.HDMIToVGAAdapter;
import structural.adapter.tvPort.adapters.HTMIToOldMonitorAdapter;
import structural.adapter.tvPort.devices.Computer;
import structural.adapter.tvPort.devices.OldMonitor;

public class Client {
    public static void main(String[] args) {
        oldMonitorAdapter();
        System.out.println();
        oldMonitorClassAdapter();
    }

    private static void oldMonitorClassAdapter() {
        System.out.println("----- Old Monitor Class Adapter -----");

        Computer pc = new Computer();
        HTMIToOldMonitorAdapter monitorAdapter = new HTMIToOldMonitorAdapter();
        pc.connectPort(monitorAdapter);
        pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");

        System.out.println("-------------------------------------");
    }

    private static void oldMonitorAdapter() {
        System.out.println("----- Old Monitor Adapter -----");

        Computer pc = new Computer();
        OldMonitor oldMonitor = new OldMonitor();

        //pc.connectPort(oldMonitor); // Don't work! That's the reason why we create the adapter
        pc.connectPort(new HDMIToVGAAdapter(oldMonitor));
        pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");

        System.out.println("-------------------------------");
    }
}
