import java.io.File;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;


public class TestParser {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws ParserConfigurationException 
	 */
	public static void main(String[] args) throws ParserConfigurationException, Exception {
		// TODO Auto-generated method stub

		//PARSER!!! =D
		
		//Come prima cosa aggancio il file al parser
		File file = new File("image_of_the_day.xml");
		//Non abbiamo fatto il new... perchèa bbiamo la saxparserfactory che lo crea per noi...
		SAXParserFactory factory = SAXParserFactory.newInstance(); 
		SAXParser parser = factory.newSAXParser();
		RssHandler handler=new RssHandler();
		parser.parse(file, handler);		
	}

}
