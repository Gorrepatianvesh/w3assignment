
public class CleanCarpet implements CleanCommand {

	Clean clean;
	
	public CleanCarpet(Clean clean)
	{
		this.clean = clean;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		clean.cleanCarpet();
	}

}
