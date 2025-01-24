
class Television {
	private int channel;
	public boolean status;
	

	public Television() {
		this.status = false;
		this.channel = (int)(Math.random() * 100) + 1;
	}

	public void turnOn() {
		if (this.status == false) {
			this.status = true;
			System.out.println("Turning the TV ON!");
			System.out.println("Channel: " + this.channel);
			
		} else {
			System.out.println("TV is already ON!");
			System.out.println("Channel: " + this.channel);
		}
	}

	public void turnOff() {
		if (this.status == true) {
			this.status = false;
			System.out.println("Turning the TV OFF!");
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
				System.out.println("Channel atm: "+ this.status);
				this.channel = channel;
				System.out.println("Changing channel to " + channel);
			}
		} else {
			System.out.println("Television is OFF!");
		}
	}
}

public class TvViewer {
	private final String name;
	private String status;


	public TvViewer(String name) {
		this.name = name;
		status = "Awake";
		System.out.println(name + " has " +  status + "n!");

	}

	public void goToSleep() {
		this.status = "Sleeping";
		System.out.println(status);

	}

	public void wakeUp() {

	}

	public String getStatus() {
		return name + " is " + status;
	}
	

	public static void main(String[] args) {
		
		TvViewer viewer = new TvViewer("Jarmo");
		Television tv = new Television();

		System.out.println(viewer.getStatus());
		
		System.out.println("-----");
		tv.turnOn();
		tv.turnOn();

		System.out.println("-----");
		tv.turnOff();
		tv.turnOff();
		
	}


}