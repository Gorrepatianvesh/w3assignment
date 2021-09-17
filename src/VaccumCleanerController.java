public class VaccumCleanerController {
	CleanCommand cmd;

	
	public void execute(CleanCommand comm)
	{
		cmd = comm;
	}
	
	public void doCommand()
	{
		cmd.execute();
	}


}
