package computerStore;

public class GraphicCard {
    public String name;
    public int memory;
    public int bit;
    public boolean hdmi;
    public boolean vga;
    public void printInfo() {
    	System.out.print(this.name.toUpperCase());
		System.out.println(" " + this.memory + "GByte" + this.bit + "bit"+(this.hdmi?"HDM�":"")+(this.vga?"VGA":" "));
    }
    public void printHdmi() {
    	System.out.println(this.hdmi?"var":"yok");
    	
    }
    	
    

    
    
}
