package abstraction;

import java.io.FileNotFoundException;

public class GameManager {

	public void save(String filename, Saveable object) throws FileNotFoundException {
		object.save(filename);
	}
	
}
