package nailSculptingStore;
public interface Command {
	public void execute();
	public void undo();
}