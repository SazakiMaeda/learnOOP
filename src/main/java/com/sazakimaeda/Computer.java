package com.sazakimaeda;

public class Computer {

    private Ssd ssd;
    private Ram ram;

    public Computer(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public Computer() {
    }

    public void load() {
        System.out.println("Я загрузился!");
        System.out.println(ssd);
        System.out.println(ram);
    }

    public void setSsd(Ssd ssd) { this.ssd = ssd; }
    public void setRam(Ram ram) { this.ram = ram; }
}
