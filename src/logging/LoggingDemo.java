package logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggingDemo {

	
	public static void main(String[] args) throws SecurityException, IOException {
		Logger LGR = Logger.getLogger("myLogger");
		
		LGR.setLevel(Level.FINEST);
		
		FileHandler fileHandler = new FileHandler("myLog.txt", false); // true to append
		fileHandler.setLevel(Level.FINE);
		fileHandler.setFormatter(new SimpleFormatter());
		LGR.addHandler(fileHandler); // add handler to the logger. Logs now written to file

		
		LGR.info("loading data");
		LGR.warning("invalid user input handled");
		LGR.fine("exiting...");

	}

}
