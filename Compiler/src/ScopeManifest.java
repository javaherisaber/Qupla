
public class ScopeManifest {

	public String scopeId;
	public String scopeName;
	public String type;
	
	public ScopeManifest(String name,String type)
	{
		this.scopeName = name;
		this.scopeId = name.toLowerCase();
		this.type = type.toLowerCase();
	}
	
}
