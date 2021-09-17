package nailSculptingStore;
public class FilerMediumCommand implements Command {
 Filer filer;
 int prevSpeed;
 
 public FilerMediumCommand(Filer filer) {
 this.filer = filer;
 }
 public void execute() {
 prevSpeed = filer.getSpeed();
 filer.medium();
 }
 public void undo() {
 if (prevSpeed == Filer.HIGH) {
 filer.high();
 } else if (prevSpeed == Filer.MEDIUM) {
 filer.medium();
 } else if (prevSpeed == Filer.LOW) {
 filer.low();
 } else if (prevSpeed == Filer.OFF) {
 filer.off();
 }
 }
}