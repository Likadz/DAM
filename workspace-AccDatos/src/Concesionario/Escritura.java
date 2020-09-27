package Concesionario;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Escritura {

	public static void main (String [] args) throws ParserConfigurationException{
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
	    Document doc = null;
	    try {
	        doc = docBuilder.parse("C:\\Users\\sarob\\OneDrive\\Escritorio\\DAM\\Acceso a datos\\concesionario.xml");
	        doc.getDocumentElement().normalize();
	    }catch(SAXException saxe){

	    }
	    catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    annadirDOM(doc, "4", "opel", "deniro","1.5");

	    //LEER
	    // almacenamos los nodos para luego mostrar la
		NodeList nList = doc.getElementsByTagName("coche");
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
	}
	public static void annadirDOM(Document doc, String id, String marca, String modelo, String cilindrada){
		System.out.println("añadir coche");
		try{
//			// Se crea un nodo tipo Element con nombre 'titulo' (<Titulo>)
//	        Node nmarca = doc.createElement("Marca");
//	        // Se crea un nodo tipo texto con el títlo del libro
//	        Node nmarca_text = doc.createTextNode(marca);
//	        // Se añade el nodo de texto con el título como hijo del elemento Titulo
//	        nmarca.appendChild(nmarca_text);
//
//
//	        Node nmodelo = doc.createElement("Modelo");
//	        Node nmodelo_text = doc.createTextNode(modelo);
//	        nmodelo.appendChild(nmodelo_text);
//
//
//	        Node ncilindrada = doc.createElement("Cilindrada");
//	        Node ncilindrada_text = doc.createTextNode(cilindrada);
//	        ncilindrada.appendChild(ncilindrada_text);
//
//	        Node ncoche = doc.createElement("Coche");
//	        ((Element)ncoche).setAttribute("Id", id);
//
//	     // Se añade a libro el nodo autor y titulo creados antes
//	        ncoche.appendChild(nmarca);
//	        ncoche.appendChild(nmodelo);
//	        ncoche.appendChild(ncilindrada);
//
//	        /* Finalmente, se obtiene el primer nodo del documento y a él se le
//	        añade como hijo el nodo libro que ya tiene colgando todos sus
//	        hijos y atributos creados antes. */
//	        Node raiz = doc.getChildNodes().item(0);
//	        doc.getDocumentElement().appendChild(ncoche);
//	        raiz.appendChild(ncoche);
//
//
	        Element coche=doc.createElement("Coche");
	        //Creamos un nuevo elemento en la casa
	        Element marca1 = doc.createElement("Marca");
	        //Le añadimos una característica
	        Element modelo1 = doc.createElement("Modelo");
	        //Le añadimos su valor
	        Element cilindrada1 = doc.createElement("Cilindrada");

	        doc.getDocumentElement().normalize();
	        Element root = doc.getDocumentElement();
			System.out.println(root.getNodeName() );

	        //Añadimos la información a la casa ya existente
	        coche.appendChild(marca1);
	        coche.appendChild(modelo1);
	        coche.appendChild(cilindrada1);
	        root.appendChild(coche);

		}catch(Exception e){
	        e.printStackTrace();
	   }
	}

}
