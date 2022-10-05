package computerStore;

public class Main {

	public static void main(String[] args) {
		GraphicCard gk1 = new GraphicCard();
		gk1.name = "Nvidia rtx 3060";
		gk1.memory = 16;
		gk1.bit = 256;
		gk1.hdmi = false;
		gk1.vga = true;
		GraphicCard gk2 = new GraphicCard();
		gk2.name = "GeForce gtx 1050";
		gk2.memory = 32;
		gk2.bit = 384;
		gk2.hdmi = true;
		gk2.vga = false;
		GraphicCard gk3 = new GraphicCard();
		gk3.name = "Nvidia rtx 5090";
		gk3.memory = 64;
		gk3.bit = 768;
		gk3.hdmi = true;
		gk3.vga = false;
	    gk1.printInfo();
		gk2.printInfo();
		gk2.printHdmi();
	
		
		
		
	}

}
