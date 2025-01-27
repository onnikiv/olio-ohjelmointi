package task01;

public class Television {
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