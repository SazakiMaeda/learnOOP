package com.sazakimaeda.patterns.command.commands;

import com.sazakimaeda.patterns.command.client.Database;
import com.sazakimaeda.patterns.command.commands.i.ICommand;

public class Add implements ICommand {
    private final Database database;

    public Add(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.addCommand();
    }
}
