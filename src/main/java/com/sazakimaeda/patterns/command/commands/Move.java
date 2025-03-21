package com.sazakimaeda.patterns.command.commands;

import com.sazakimaeda.patterns.command.client.Database;
import com.sazakimaeda.patterns.command.commands.i.ICommand;


public class Move implements ICommand {
    private final Database database;

    public Move(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.moveCommand();
    }
}
