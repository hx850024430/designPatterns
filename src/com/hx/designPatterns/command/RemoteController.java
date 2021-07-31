package com.hx.designPatterns.command;

public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new BlankCommand();
            offCommands[i] = new BlankCommand();
        }
    }

    public void setCommand(int number, Command onCommand, Command offCommand) {
        onCommands[number] = onCommand;
        offCommands[number] = offCommand;
    }

    public void onButtonPushed(int no){
        onCommands[no].execute();
        undoCommand = onCommands[no];
    }
    public void offButtonPushed(int no){
        offCommands[no].execute();
        undoCommand = offCommands[no];
    }

    public void undoButtonPushed(){
        undoCommand.undo();
    }
}
