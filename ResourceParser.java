public interface ResourceParser {
    /**
     * Return an array of classes that specify what kind of resources
     * this parser can handle 
     **/
    public Class[  ] getResourceTypes( );

    /**
     * Read the property named by key from the specified bundle, convert
     * it to the specified type, and return it.  For complex resources,
     * the parser may need to read more than one property from the bundle; 
     * typically it may be a number of properties whose names begin with the 
     * specified key.
     **/
    public Object parse(GUIResourceBundle bundle, String key, Class type)
        throws Exception;
}