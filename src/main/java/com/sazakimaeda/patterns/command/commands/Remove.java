package com.sazakimaeda.patterns.command.commands;

import com.sazakimaeda.patterns.command.client.Database;
import com.sazakimaeda.patterns.command.commands.i.ICommand;

public class Remove implements ICommand {
    private final Database database;

    public Remove(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.removeCommand();
    }
}
