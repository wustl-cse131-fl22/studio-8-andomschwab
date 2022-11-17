package studio8;


public class Time {
	private int hour;
	private int minute;
	private boolean isMilitaryTime;
	
	public static void main(String[] args) {
		Time time1 = new Time(22, 30, false);
		System.out.println(time1.toString());
		Time time2 = new Time(15, 00, true);
		System.out.println(time2.toString());
		Time time3 = new Time(12, 56, true);
		System.out.println(time3.toString());
		Time time4 = new Time(11, 40, true);
		System.out.println(time4.toString());
    	
    }
	
	/**
	 * returns us a string containing our time.
	 * @param N/A
	 * @return String
	 */
	@Override
	public String toString() {
		if(!isMilitaryTime) {
			return (hour-12) + ":" + minute;
		} else {
			return (hour) + ":" + minute;
		}
	}

	/**
	 * gives us the hour hand.
	 * @param N/A
	 * @return int
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * sets the hour hand.
	 * @param int hour
	 * @return N/A
	 */
	public void setHour(int hour) {
		this.hour = hour;
	}

	/**
	 * gives us the minute hand.
	 * @param N/A
	 * @return int
	 */
	public int getMinute() {
		return minute;
	}

	/**
	 * sets the minute hand.
	 * @param int minute
	 * @return N/A
	 */
	public void setMinute(int minute) {
		this.minute = minute;
	}

	/**
	 * checks the format of the time. Returns true if military time.
	 * @param N/A
	 * @return boolean isMilitaryTime
	 */
	public boolean isMilitaryTime() {
		return isMilitaryTime;
	}

	/**
	 * sets true if military time.
	 * @param boolean isMilitaryTime
	 * @return N/A
	 */
	public void setMilitaryTime(boolean isMilitaryTime) {
		this.isMilitaryTime = isMilitaryTime;
	}


	public Time(int hour, int minute, boolean isMilitaryTime) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.isMilitaryTime = isMilitaryTime;
	}
	
	

}