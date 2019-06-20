public class Clock {

	private int hour; // 0-23 hours
	private int minute; // 0-59 minutes
	private double second; // 0-59 seconds
	private double grain; // 0-3600 seconds
	
	public Clock (int h, int m, double s, double g)
	{
		if (h < 0 || h > 23)
		minute = ( (m >= 0 && h < 59) ? m : 0);
		second = ( (s >= 0.0 && h < 59) ? s : 0.0);
		grain = 0.0;
	
	}
	
	public void setHour(int h)
	{
		hour = h;
	}
	
	public int getHour()
	{
		return hour;
	}
	
	public void setMinute(int m)
	{
		minute = m;
	}
	
	public int getMinute()
	{
		return minute;
	}
	
	public void setSecond(double s)
	{
		second = s;
	}
	
	public double getSecond()
	{
		return second;
	}
	
	public void setGrain(double g)
	{
		grain = g;
	}
	
	public double getGrain()
	{
		return grain;
	}
	
	public void tick () // how the clock works
	{
		second += grain;
		
		if (second >= 60.0) // Method for outputting seconds
		{
			minute += (int)(second/60);
			second %= 60;
		}
		
		if (minute > 59) // Method for outputting minutes
		{
			hour += minute/60;
			minute %= 60;
		}
		
		if (hour >= 24) // Method for outputting hours
		{
			hour = 0;
		}
	}
	
        @Override
	public String toString() //Output time
	{
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clock c = new Clock(2,42,38,400);
		
		System.out.printf("The time is:", c.getHour(), c.getMinute(), c.getSecond(), c.getGrain());
	}

}

