package nailSculptingStore;
public class TrimmerOnCommand implements Command {
Trimmer trimmer; 
public TrimmerOnCommand(Trimmer trimmer) {
this.trimmer = trimmer;
}
public void execute () {
trimmer.on();
}
public void undo() {
trimmer.off();
}
}