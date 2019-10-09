package objects;

public class booleanObject
	{
private String trigger;
private String name;
private boolean value;
public booleanObject(String t, String n, boolean v){
	t = trigger;
	n = name;
	v = value;
}
public String getTrigger()
	{
		return trigger;
	}
public void setTrigger(String trigger)
	{
		this.trigger = trigger;
	}
public String getName()
	{
		return name;
	}
public void setName(String name)
	{
		this.name = name;
		
	}
public boolean isValue()
	{
		return value;
	}
public void setValue(boolean value)
	{
		this.value = value;
	}
		
		
		
	}
