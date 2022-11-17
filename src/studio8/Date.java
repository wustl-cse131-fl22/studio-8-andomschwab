package studio8;

public class Date {

	private int month = 0;
	private int day = 0;
	private int year = 0;
	private boolean isHoliday = false;
	
	public Date(int month, int day, int year, boolean isHoliday) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
	}

	public boolean isHoliday() {
		return this.isHoliday;
	}
	
    public static void main(String[] args) {
    	Date date1 = new Date (8, 2, 1998, true);
    	System.out.println(date1.toString());
    	Date date2 = new Date (11, 18, 2007, true);
    	System.out.println(date2.toString());
    	Date date3 = new Date (11, 17, 2007, true);
    	System.out.println(date3.toString());

    }

	@Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + ", isHoliday=" + isHoliday + "]";
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
