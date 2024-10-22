import greenfoot.*;

public class InstructionScreen extends World {
    public InstructionScreen() {
        super(600, 400, 1);

    addObject(new Button(this::goInstructions), 300, 340);
  }

  

}
