import java.text.SimpleDateFormat;
import java.util.Date;


public class CurrentDateTime {

	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));

	}

}
