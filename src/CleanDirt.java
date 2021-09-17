
public class CleanDirt implements CleanCommand {

	Clean clean;
	
	public CleanDirt(Clean clean)
	{
		this.clean = clean;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		clean.cleanDirt();
	}

}

