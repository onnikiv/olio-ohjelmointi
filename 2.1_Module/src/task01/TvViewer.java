package task01;


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