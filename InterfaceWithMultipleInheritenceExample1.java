package JavaOops;

interface Vechileee {
	void start();
	void stop();
}

interface PlayMusic { 
	void startmusic();
	void stopmusic();
}

class Gclass implements Vechileee,PlayMusic {
	public void start() {
		System.out.println("Started");
	}
	public void stop() {
		System.out.println("Stopped");
	}
	public void startmusic() {
		System.out.println("Start Music");
	}
	public void stopmusic() {
		System.out.println("Stop Music");
	}
}
public class InterfaceWithMultipleInheritenceExample1 {
	public static void main(String[] args) {
		Gclass g = new Gclass();
		g.start();
		g.stop();
		g.startmusic();
		g.stopmusic();
	}
}
