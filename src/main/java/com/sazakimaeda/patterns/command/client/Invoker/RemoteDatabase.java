package com.sazakimaeda.patterns.command.client.Invoker;

import com.sazakimaeda.patterns.command.commands.i.ICommand;

public class RemoteDatabase {
    private ICommand icommand;

    public void createCommand(ICommand icommand) {
        this.icommand = icommand;
    }

    public void pressCommand() {
        icommand.execute();
    }
}
