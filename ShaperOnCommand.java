package nailSculptingStore;
public class ShaperOnCommand implements Command {
Trimmer trimmer; 
public ShaperOnCommand(Shaper shaper) {
this.shaper = shaper;
}
public void execute () {
shaper.on();
}
public void undo() {
shaper.off();
}
}