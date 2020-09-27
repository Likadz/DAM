package Concesionario;
import org.w3c.dom.*;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import java.io.*;
public class Concesionario {
public static void main(String[] args) throws SAXException
{

		//Get Document Builder
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();


			//Build Document (el xml)
			Document document;
			document = builder.parse(new File("C:\\Users\\sarob\\OneDrive\\Escritorio\\DAM\\Acceso a datos\\concesionario.xml"));

			//VALIDAMOS CONTRA EL ESQUEMA XSD
			Schema schema = null;
			try {
			  String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
			  SchemaFactory factory1 = SchemaFactory.newInstance(language);
			  schema = factory1.newSchema(new File("C:\\Users\\sarob\\OneDrive\\Escritorio\\DAM\\Acceso a datos\\concesionario.xsd"));
			} catch (Exception e) {
			}
			Validator validator = schema.newValidator();
			validator.validate(new DOMSource(document));


			//Elimina nodos vacíos y combina adyacentes en caso de que los hubiera
			document.getDocumentElement().normalize();

			//Here comes the root node
			Element root = document.getDocumentElement();
			System.out.println(root.getNodeName());

			// almacenamos los nodos para luego mostrar la
			NodeList nList = document.getElementsByTagName("coche");
			System.out.println("============================");

			//recorremos la lista de coches
			for (int temp = 0; temp < nList.getLength(); temp++)
			{
				 Node node = nList.item(temp);
				 System.out.println("");    //Just a separator
				 if (node.getNodeType() == Node.ELEMENT_NODE)//imprimir datos
				 {
				    Element eElement = (Element) node;
				    System.out.println("Coche id : "    + eElement.getAttribute("id"));
				    System.out.println("Marca : "  + eElement.getElementsByTagName("marca").item(0).getTextContent());
				    System.out.println("Modelo : "   + eElement.getElementsByTagName("modelo").item(0).getTextContent());
				    System.out.println("Cilindrada : "    + eElement.getElementsByTagName("cilindrada").item(0).getTextContent());
				 }
			}

		}catch (ParserConfigurationException e1) {
			e1.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
