
public class CleanWater implements CleanCommand {

	Clean clean;
	
	public CleanWater(Clean clean)
	{
		this.clean = clean;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		clean.cleanWater();
	}

}
