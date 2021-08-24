package Project.Squash_Currency_REST.parser;

import java.io.IOException;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class JDOM_Parser {

	public String getCurrency () throws JDOMException, IOException {
		
		String xmlPath = "http://api.napiarfolyam.hu/?bank=mnb&valuta=eur";
		SAXBuilder sb = new SAXBuilder();
		Document document = sb.build(xmlPath); 
		
		List<Element> item=null; 
		String currency=null;  
		Element central_Rate=null; 
		
		Element rootElement = document.getRootElement();
		List<Element> valuta=rootElement.getChildren(); 
		for (int i=0; i<valuta.size(); i++) {
			item=valuta.get(i).getChildren();
			
			for (int j=0; j<item.size(); j++) {
				central_Rate =item.get(j).getChild("kozep"); 
				 currency=central_Rate.getValue(); 
				 
				 }
			}
		
		return currency;
	}
}
