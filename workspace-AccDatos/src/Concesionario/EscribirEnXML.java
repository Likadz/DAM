package Concesionario;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.Element;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;

import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class EscribirEnXML {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException{


	List<Coche> coches = parseCocheXML();
    System.out.println(coches);
   }

   private static List<Coche> parseCocheXML() throws ParserConfigurationException, SAXException, IOException
   {
      //Initialize a list of coches
      List<Coche> coches = new ArrayList<Coche>();
      Coche coche = null;

      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder;
	try {
		builder = factory.newDocumentBuilder();


		//Build Document (el xml)
		Document document;
		document = (Document) builder.parse(new File("C:\\Users\\sarob\\OneDrive\\Escritorio\\DAM\\Acceso a datos\\concesionario.xml"));

		//Normalize the XML Structure;
		((org.w3c.dom.Node) document.getDefaultRootElement()).normalize();

		//Here comes the root node
		Element root = (Element) document.getDefaultRootElement();
	      NodeList nList = ((org.w3c.dom.Document) document).getElementsByTagName("coche");
	      for (int temp = 0; temp < nList.getLength(); temp++)
	      {
	         Node node = (Node) nList.item(temp);
	         if (node.getNodeType() == Node.ELEMENT_NODE)
	         {
	            Element eElement = (Element) node;
	            //Create new Employee Object
	            coche = new Coche(66,"seat","ibiza", "2.5");
	            coche.setId(Integer.parseInt((String) ((DocumentBuilderFactory) eElement).getAttribute("id")));
	            coche.setMarca(((org.w3c.dom.Document) eElement).getElementsByTagName("marca").item(0).getTextContent());
	            coche.setModelo(((org.w3c.dom.Document) eElement).getElementsByTagName("modelo").item(0).getTextContent());
	            coche.setCilindrada(((org.w3c.dom.Document) eElement).getElementsByTagName("cilindrada").item(0).getTextContent());

	            //Add Employee to list
	            coches.add(coche);
	         }
	      }
      }catch(Exception e){

  	}
      return coches;
   }
}