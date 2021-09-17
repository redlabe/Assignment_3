package nailSculptingStore;
public class DeviceLoader {
public static void main(String[] args) {
DeviceControlWithUndo deviceControl = new DeviceControlWithUndo();
Trimmer nailTrimmer = new Trimmer("Nail Kit");
Shaper nailShaper=new Shaper("Nail Kit");
Filer nailFiler = new Filer(“Nail Kit”);

TrimmerOnCommand trimmerOn=new TrimmerOnCommand(nailTrimmer);
TrimmerOffCommand trimmerOff=new TrimmerOffCommand(nailTrimmer);

ShaperOnCommand shaperOn=new ShaperOnCommand(nailShaper);
ShaperOffCommand shaperOff= new ShaperOffCommand(nailShaper);


FilerLowCommand nailFilerLow = new FilerLowCommand(nailFiler);
FilerMediumCommand nailFilerMedium = new FilerMediumCommand(nailFiler);
FilerHighCommand nailFilerHigh = new FilerHighCommand(nailFiler);
FilerOffCommand nailFilerOff = new FilerOffCommand(nailFiler);


deviceControl.setCommand(0, trimmerOn, trimmerOff);
deviceControl.setCommand(1, shaperOn, ShaperOff);
deviceControl.setCommand(2, nailFilerMedium, nailFilerOff);
deviceControl.setCommand(3, nailFilerHigh, nailFilerOff);
deviceControl.setCommand(4, nailFilerLow, nailFilerOff);



deviceControl.onButtonWasPushed(0);
deviceControl.offButtonWasPushed(0);
System.out.println(deviceControl);
deviceControl.undoButtonWasPushed();
deviceControl.offButtonWasPushed(0);
deviceControl.onButtonWasPushed(0);
System.out.println(deviceControl);
deviceControl.undoButtonWasPushed();

deviceControl.onButtonWasPushed(1);
deviceControl.offButtonWasPushed(1);
System.out.println(deviceControl);
deviceControl.undoButtonWasPushed();
deviceControl.offButtonWasPushed(1);
deviceControl.onButtonWasPushed(1);
System.out.println(deviceControl);
deviceControl.undoButtonWasPushed();


 deviceControl.onButtonWasPushed(2);
 remoteControl.offButtonWasPushed(2);
 System.out.println(deviceControl);
 deviceControl.undoButtonWasPushed();

 deviceControl.onButtonWasPushed(3);
 remoteControl.offButtonWasPushed(3);
 System.out.println(deviceControl);
 deviceControl.undoButtonWasPushed();

 deviceControl.onButtonWasPushed(4);
remoteControl.offButtonWasPushed(4);
 System.out.println(deviceControl);
 deviceControl.undoButtonWasPushed();
}
}







