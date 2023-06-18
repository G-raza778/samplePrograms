package Section_3;

	import java.text.SimpleDateFormat;
import java.util.Date;

	public class dateAndTime {
	public static void main(String[] args) {
		SimpleDateFormat formatter=new SimpleDateFormat();
		Date date=new Date();
		System.out.println(formatter.format(date));
	}
	}


