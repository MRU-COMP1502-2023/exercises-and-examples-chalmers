package staticKeyword;

public class WebData {

	static String data;

	public WebData() {

		// check if the data has already been downloaded
		if (data == null) {
			System.out.println("downloading data");
			data = "the data";
		}
	}

	public String getData() {
		return data;

	}


}
