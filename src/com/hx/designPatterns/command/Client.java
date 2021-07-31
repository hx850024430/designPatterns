package com.hx.designPatterns.command;

public class Client {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();
        LightReceiver lightReceiver = new LightReceiver();
        remoteController.setCommand(0,new LightOnCommand(lightReceiver),new LightOffCommand(lightReceiver));
        remoteController.onButtonPushed(0);
        remoteController.undoButtonPushed();
        remoteController.offButtonPushed(0);
        remoteController.undoButtonPushed();
    }
}
