package Concesionario;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class EscrituraXML {
	public static void main(String[] args) throws ParserConfigurationException{
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
	    Document doc = null;
	    try {
	        doc = docBuilder.parse("C:\\Users\\sarob\\OneDrive\\Escritorio\\DAM\\Acceso a datos\\concesionario.xml");
	        doc.getDocumentElement().normalize();

	        Coche newCoche= new Coche();
	        NodeList nList = doc.getElementsByTagName("coche");
	        newCoche.setId(nList.getLength()+1);
	        newCoche.setMarca("Opel");
	        newCoche.setModelo("nada");
	        newCoche.setCilindrada("1.5");


	    } catch (SAXException ex) {

	    } catch (IOException e) {
			e.printStackTrace();
		}

	}
}
