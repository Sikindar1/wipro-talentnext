package live;
import music.playable;
import music.string.Veena;
import music.wind.Saxophone;
public class Test {

	public static void main(String[] args) {
		Veena v=new Veena();
		v.play();
		Saxophone s=new Saxophone();
		s.play();
		// creating the reference
		playable p1=v;
		playable p2=s;
		p1.play();
		p2.play();

	}

}
