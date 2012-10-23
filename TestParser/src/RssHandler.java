import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;




public class RssHandler extends DefaultHandler  {
	
	//Per prendere un elemento bisogna creare una variabile booleana per capire se siamo
	//nell'elemento giusto e una variabile che contiene il dato che ci serve.
	//Bisogna creare tante variabili booleane quanti sono i valori che ci servono
	boolean inTitle=false;
	String title=null;
	
	//QUesto metodo serve per capire quando inizia il file xml 
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
		System.out.println("Inizio Documento!");
	}
	
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
		System.out.println("Fine Documento!");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
		System.out.println("Inizio Elemento:"+qName);
		if(qName.equals("title")){
			inTitle=true;
		}
		
		for (int i = 0; i < attributes.getLength(); i++) {
			System.out.println("Attributo:"+attributes.getQName(i)+" valore:"+attributes.getValue(i));
			
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
		System.out.println("Fine Elemento:"+qName);
		
		if(qName.equals("title")){
			inTitle=false;
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
		String s=new String(ch,start,length);
		System.out.println("Testo:"+s);
		if (inTitle){
			title=s;
		}
	}
}
