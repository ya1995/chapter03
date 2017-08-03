package chapter03;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public Song() 	// 기본생성자
	{
		
	}
	public Song( String title, String artist ) {
		this( title, artist, null, null, 0, 0 );	// 클래스 내에서 한 생성자에서 다른 생성자를 호출하고 싶을 땐 이렇게 하면 됨
	}	// 코드재사용
	public Song( 
			String title, 
			String artist, 
			String album, 
			String composer, 
			int year, 
			int track ) {
		
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public void show() {
		System.out.println(artist + " " +  title +  " " + "(" + album + 
				", " + year + ", " + track + "번 트랙, " + composer + " 작곡)");
	}

}
