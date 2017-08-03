package tv;

public class TV {
	private boolean power;
	private int channel;
	private int volume;
	
	public TV() {
		
	}
	public TV( int channel, int volume, boolean power ) {
		this.power = power;
		this.channel = channel;
		this.volume = volume;
	}
	/*public boolean channel( boolean up ) {
		return channel;
	}*/
	
	
	public boolean isPower() {
		return power;
	}
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	
	// 4번
		public void power( boolean on ) {
			power = on;
			
		}
		// 5번
		public void channel( int channel ) {
			if( power == false ) {
				return;
			}
			
			if( channel < 1 ) {
				channel = 255;
			}else if( channel > 255 ) {
				channel = 1;
			}
			
			this.channel = channel;
		}
		public void channel( boolean up ) {
			channel( channel + (up ? 1 : -1 ) );
		}
		
		public void volume( int volume ) {
			if( power == false ) {
				return;
			}
			if( volume < 0 ) {
				volume = 0;
			}else if( volume > 100 ) {
				volume = 100;
			}
			this.volume = volume;
		}
		
		public void volume( boolean up ) {
			volume( volume + ( up ? 1 : -1 ) );
		}
		
		public void status() {
			
			System.out.println( "TV[channel=" + channel +
					", volume=" + volume +
					", power=" + power +
					"]"
					);
		}
	

}
