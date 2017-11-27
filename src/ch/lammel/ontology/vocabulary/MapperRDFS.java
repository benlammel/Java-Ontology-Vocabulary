package ch.lammel.ontology.vocabulary;

public class MapperRDFS {
	
	private static final String RDFS_BASIC 	= "http://www.w3.org/2000/01/rdf-schema#";
	
	public static final String RDFS_LABEL 		= RDFS_BASIC		+	"label";
	public static final String RDFS_SUBCLASSOF 	= RDFS_BASIC		+	"subClassOf";
	public static final String RDFS_SUBPROPERTYOF = RDFS_BASIC	+	"subPropertyOf";
	public static final String RDFS_DOMAIN 		= RDFS_BASIC		+	"domain";
	public static final String RDFS_RANGE 		= RDFS_BASIC		+	"range";
	public static final String RDFS_RESOURCE 	= RDFS_BASIC		+	"Resource";
	public static final String RDFS_CLASS 		= RDFS_BASIC		+	"Class";
	public static final String RDFS_LITERAL		= RDFS_BASIC		+	"Literal";

}
