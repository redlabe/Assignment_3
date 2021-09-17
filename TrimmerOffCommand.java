package nailSculptingStore;
public class TrimmerOffCommand implements Command {
Trimmer trimmer;

public TrimmerOffCommand(Trimmer trimmer) {
this.trimmer = trimmer;
}
public void execute() {
trimmer.off();
}
public void undo() {
trimmer.on();
}
}
