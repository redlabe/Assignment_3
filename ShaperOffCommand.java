package nailSculptingStore;
public class ShaperOffCommand implements Command {
Shaper shaper;

public ShaperOffCommand(Shaper shaper) {
this.shaper = shaper;
}
public void execute() {
shaper.off();
}
public void undo() {
shaper.on();
}
}
