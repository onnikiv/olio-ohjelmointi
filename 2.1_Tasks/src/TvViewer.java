
class Television {
	private int channel;
	public String status;
	

	public Television() {
		this.status = "OFF";
	}

	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		if (this.channel != 0) {
			this.channel = channel;
			
		} 
	}
}

public class TvViewer {
	private final String name;
	private String status;


	public TvViewer(String name) {
		this.name = name;
		status = "Awake";
		System.out.println(name + " has " +  status + "n!");;

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
		viewer.goToSleep();
		System.out.println(viewer.getStatus());

		
	}


}