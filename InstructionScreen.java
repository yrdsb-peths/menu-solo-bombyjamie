import greenfoot.*;

public class InstructionScreen extends World {
    private Menu menuScreen;
    private String[] instructions = {   "Instruction Screen 1", "Instruction Screen 2" };
    private int currentIndex = 0;
    private Label changeScreen;
    private Label instructionLabel;
    private Label goBackButton;
    public InstructionScreen(Menu menuScreen) 
    {
        super(600, 400, 1);
        this.menuScreen = menuScreen;
        instructionLabel = new Label(instructions[currentIndex], 24);
        changeScreen = new Label("Next Screen", 25);
        goBackButton = new Label("To Menu", 25);
        addObject(instructionLabel, 300, 200); 
        addObject(new Button(this::cycleInstruction), 300, 300);
        addObject(new Button(this::returnMenu), 300, 350);
        addObject(changeScreen, 300, 300);
        addObject(goBackButton, 300, 350);
    }
    public void cycleInstruction() 
    {
        currentIndex++;
        if (currentIndex >= instructions.length) 
        {
            currentIndex = 0;
        }
        removeObject(instructionLabel);
        instructionLabel = new Label(instructions[currentIndex], 24);
        addObject(instructionLabel, 300, 200);
    }

    public void returnMenu() 
    {
        Greenfoot.setWorld(menuScreen);
    }
}

  


