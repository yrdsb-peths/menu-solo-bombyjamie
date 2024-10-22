import greenfoot.*;

public class Menu extends World {
    public Menu() {
        super(600, 400, 1);

    addObject(new Button(this::goInstructions), 300, 340);
  }

  public void goInstructions() {
    Greenfoot.setWorld(new InstructionScreen(this));
  }

}
