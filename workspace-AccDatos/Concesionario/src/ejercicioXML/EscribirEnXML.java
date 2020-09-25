package ejercicioXML;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;

import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class EscribirEnXML {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException{
		
		
	List<Coche> employees = parseCocheXML();
    System.out.println(employees);
   }
 
   private static List<Coche> parseCocheXML() throws ParserConfigurationException, SAXException, IOException
   {
      //Initialize a list of employees
      List<Coche> employees = new ArrayList<Coche>();
      Coche coche = null;
       
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document document;
		document = builder.parse(new File("C:\\Users\\2dam3\\Desktop\\DAM_LeireSarobe\\AccesoADatos\\Concesionario\\concesionario.xml"));
      document.getDocumentElement().normalize();
      NodeList nList = document.getElementsByTagName("coche");
      for (int temp = 0; temp < nList.getLength(); temp++)
      {
         Node node = (Node) nList.item(temp);
         if (node.getNodeType() == Node.ELEMENT_NODE)
         {
            Element eElement = (Element) node;
            //Create new Employee Object
            coche = new Coche();
            coche.setId(Integer.parseInt(eElement.getAttribute("id")));
            coche.setMarca(eElement.getElementsByTagName("marca").item(0).getTextContent());
            coche.setModelo(eElement.getElementsByTagName("modelo").item(0).getTextContent());
            coche.setCilindrada(eElement.getElementsByTagName("cilindrada").item(0).getTextContent());
             
            //Add Employee to list
            employees.add(coche);
         }
      }
      return employees;
   }
}