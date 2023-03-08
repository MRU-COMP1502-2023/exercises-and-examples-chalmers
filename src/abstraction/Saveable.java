package abstraction;

import java.io.FileNotFoundException;

public interface Saveable {

	public void save(String filename) throws FileNotFoundException;
}
