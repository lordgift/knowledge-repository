package app.main;

import java.util.List;

import app.fordict.bean.Eng2Thai;
import app.fordict.bean.Thai2Eng;
import app.fordict.utility.SQLiteManager;
import app.fordict.utility.XMLParser;

public class XMLToSQLite {

	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		XMLParser xmlET = XMLParser.getInstance(Eng2Thai.class);
		List<Object> eng2ThaiList = xmlET.parseDocument("lexitron-data/etlex_fixed");
				
//		XMLParser xmlTE = XMLParser.getInstance(Thai2Eng.class);
//		List<Object> thai2EngList = xmlTE.parseDocument("lexitron-data/telex_fixed");
		
//		SQLiteManager.createTable();		
		SQLiteManager.insertValueByList(eng2ThaiList);
//		SQLiteManager.insertValueByList(thai2EngList);
		
	}

}
