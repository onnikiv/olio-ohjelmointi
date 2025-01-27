package task01;

class Television {
	private int channel;
	public boolean status;
	

	public Television() {
		this.status = false;
		this.channel = 1;
	}

	public void turnOn() {
		if (this.status == false) {
			this.status = true;
			
		} else {
			System.out.println("TV is already ON!");
			System.out.println("Channel: " + this.channel);
		}
	}

	public void turnOff() {
		if (this.status == true) {
			this.status = false;
		} else {
			System.out.println("TV is already OFF");
		}
	}

	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		if (this.status == true) {

			if (channel == this.channel) {
				System.out.println("You are already on that Channel!");
				
			} else {
				this.channel = channel; // SPAGETTI 
				if (this.channel == 11) {
					this.channel = 1;
					
				}
			}
		} else {
			System.out.println("task01.Television is OFF!");
		}
	}
}

public class TvViewer {
	private final String name;
	private String status;
	private int day;


	public TvViewer(String name) {
		this.name = name;
		this.day = 1;

	}

	public void goToSleep() {
		this.status = "Sleeping";
		System.out.println("Falling asleep");
		day++;
	}

	public void wakeUp() {
		this.status = "Awake";
		System.out.println("Woke up, day " + day);

	}
	

	public static void main(String[] args) {
		
		TvViewer viewer = new TvViewer("Jarmo");
		Television tv = new Television();

		for (int day = 1; day <= 10; day++) {
			viewer.wakeUp();
			tv.turnOn();
			
			boolean tired = false;

			while (!tired) {
				System.out.println("Watching channel " + tv.getChannel());
				tv.setChannel(tv.getChannel() + 1);
				
				if (tv.getChannel() % 4 == 0)
					tired = true;

			}
			
			tv.turnOff();
			viewer.goToSleep();
		}
	}
}