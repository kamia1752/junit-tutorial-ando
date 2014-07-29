package junit.tutorial.framework;

public class Frameworks {

    public static Boolean isSupport(ApplicationServer appServer, Database db) {
        // TODO Auto-generated method stub
        switch(appServer){
        case GlassFish: 
        	return true;
        case JBoss:
        	if( db == Database.DB2 || db == Database.PostgreSQL) return true;
        	return false;
        case Tomcat:
        	if( db == Database.MySQL) return true;
        	return false;
        default:
        	return false;
        }
    }
    
}
