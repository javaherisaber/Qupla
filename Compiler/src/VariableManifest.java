
public class VariableManifest {
	
	public String varId;
	public String varName;
	public String varType;
	public ScopeManifest varScope;
	
	public VariableManifest(String name,String type,ScopeManifest Scope)
	{
		this.varName = name;
		this.varType = type.toLowerCase();
		this.varScope = Scope;
		this.varId = name.toLowerCase();
	}
}
