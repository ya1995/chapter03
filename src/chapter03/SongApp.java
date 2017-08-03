package chapter03;

public class SongApp {

	public static void main(String[] args) {
		Song song = new Song( "좋은날", "아이유", "Real", "이민수", 2010, 3 );	// 기본생성자 
	/*	song.setTitle( "좋은날" );
		song.setArtist( "아이유" );
		song.setAlbum( "Real" );
		song.setYear( 2010 );
		song.setTrack( 3 );
		song.setComposer( "이민수" );*/
		
		song.show();
		
		Song song2 = new Song( "비도오고그래서", "헤이즈" );
		song2.show();
		
		Song song3 = new Song( "Rookie", "레드벨벳" );
		song3.show();
		
	}

}
