package week6;
import java.util.Comparator;

public class YearComparator implements Comparator<PlayerVO> {
	@Override
	public int compare(PlayerVO p1, PlayerVO p2) {
		return p1.getReYear() - p2.getReYear();
	}
}
