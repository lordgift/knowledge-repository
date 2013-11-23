/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.fordict.utility;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import app.fordict.bean.Eng2Thai;
import app.fordict.bean.Thai2Eng;

/**
 * 
 * @author Gift
 */
public class XMLParser extends DefaultHandler {
	private static final XMLParser INSTANCE = new XMLParser(); 

	private static List<Object> list;
	private static Object bean;
	private static String value;

	private XMLParser(){}
	public static XMLParser getInstance(Class clazz) throws InstantiationException, IllegalAccessException {
		
		clear();
		
		bean = clazz.newInstance();
		list = new ArrayList<Object>();
		
		return INSTANCE != null ? INSTANCE : new XMLParser();
	}
	
	private static void clear() {
		if(list != null) list.clear();
		if(bean != null) bean = null;
	}
	
	public List<Object> parseDocument(String filePath) {
		try {
			System.out.println(filePath);
//			list = new ArrayList<Eng2Thai>();
			
			// get a new instance of parser
			SAXParser sp = SAXParserFactory.newInstance().newSAXParser();
			
			// parse the file and also register this class for call backs
			sp.parse(new File(filePath), this);

		} catch (SAXException se) {
			se.printStackTrace();
		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
		
		return list;
	}

	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		value = new String(ch, start, length);
//		System.out.println(value);
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		
		//value come at endElement 
		if(bean instanceof Eng2Thai) {
			setIncomingTagForEng2Thai(qName);
		} else if(bean instanceof Thai2Eng) {
			setIncomingTagForThai2Eng(qName);
		}
		
	}


	private void setIncomingTagForEng2Thai(String qName) {
		if (qName.equalsIgnoreCase("DOC")) {
			list.add((Eng2Thai) bean);
			bean = new Eng2Thai();
		} else {
			Eng2Thai eng2Thai = (Eng2Thai) bean;
			if (qName.equalsIgnoreCase("id")) {
				eng2Thai.set_id( Integer.parseInt(value) );
			} else if (qName.equalsIgnoreCase("esearch")) {
				eng2Thai.setEsearch( value );
			} else if (qName.equalsIgnoreCase("eentry")) {
				eng2Thai.setEentry( value );
			} else if (qName.equalsIgnoreCase("tentry")) {
				eng2Thai.setTentry( value );
			} else if (qName.equalsIgnoreCase("ecat")) {
				eng2Thai.setEcat( value );
			} else if (qName.equalsIgnoreCase("ethai")) {
				eng2Thai.setEthai( value );
			} else if (qName.equalsIgnoreCase("esyn")) {
				eng2Thai.setEsyn( value );
			} else if (qName.equalsIgnoreCase("eant")) {
				eng2Thai.setEant( value );
			}
		}
	}
	
	private void setIncomingTagForThai2Eng(String qName) {
		if (qName.equalsIgnoreCase("DOC")) {
			list.add((Thai2Eng) bean);
			bean = new Thai2Eng();
		} else {
			Thai2Eng thai2Eng = (Thai2Eng) bean;
			if (qName.equalsIgnoreCase("id")) {
				thai2Eng.set_id( Integer.parseInt(value) ); 
			} else if (qName.equalsIgnoreCase("tsearch")) {
				thai2Eng.setTsearch( value );
			} else if (qName.equalsIgnoreCase("tentry")) {
				thai2Eng.setTentry( value );
			} else if (qName.equalsIgnoreCase("eentry")) {
				thai2Eng.setEentry( value );
			} else if (qName.equalsIgnoreCase("tcat")) {
				thai2Eng.setTcat( value );
			} else if (qName.equalsIgnoreCase("tsyn")) {
				thai2Eng.setTsyn( value );
			} else if (qName.equalsIgnoreCase("tenglish")) {
				thai2Eng.setTenglish( value );
			} else if (qName.equalsIgnoreCase("tant")) {
				thai2Eng.setTant( value );
			} else if (qName.equalsIgnoreCase("tnum")) {
				thai2Eng.setTnum( value );
			} else if (qName.equalsIgnoreCase("tdef")) {
				thai2Eng.setTdef( value );
			} else if (qName.equalsIgnoreCase("tsample")) {
				thai2Eng.setTsample( value );
			}
		}
	}
}
