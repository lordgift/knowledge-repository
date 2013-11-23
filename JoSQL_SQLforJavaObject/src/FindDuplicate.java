import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.josql.Query;
import org.josql.QueryExecutionException;
import org.josql.QueryParseException;
import org.josql.QueryResults;

public class FindDuplicate {
	public static void main(String[] args) throws QueryParseException, QueryExecutionException {
		File directoryFile = new File("D:/TheGreanGangRadio/");
		
		// Get a list of java.io.File objects.
		List<File> myObjs = new ArrayList<File>();
		for (File file : directoryFile.listFiles()) {
			myObjs.add(file);
		}
		queryJoSQL(myObjs,"BodySlam");	
		
	}

	private static void queryJoSQL(List<File> myObjs,String condition) throws QueryParseException, QueryExecutionException {
		// Create a new Query.
		Query q = new Query();

		// Parse the SQL you are going to use.
		q.parse("SELECT * FROM java.io.File WHERE upper(name) LIKE upper('%"+condition+"%') ");

		// Execute the query.
		QueryResults qr = q.execute(myObjs);

		// Cycle over the query results.
		List res = qr.getResults ();		

		for(Object file : res) {
			if(file instanceof File) {
				System.out.println(((File) file).getName());
			}
		}
		
		System.out.println("test");
	}
}
