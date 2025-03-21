package com.sazakimaeda.patterns.command;

import com.sazakimaeda.patterns.command.client.Database;
import com.sazakimaeda.patterns.command.client.Invoker.RemoteDatabase;
import com.sazakimaeda.patterns.command.commands.Add;
import com.sazakimaeda.patterns.command.commands.Cut;
import com.sazakimaeda.patterns.command.commands.Move;
import com.sazakimaeda.patterns.command.commands.Remove;
import com.sazakimaeda.patterns.command.commands.i.ICommand;

public class Start {
    public static void main(String[] args) {
        Database db = new Database();

        ICommand add = new Add(db);
        ICommand remove = new Remove(db);
        ICommand move = new Move(db);
        ICommand cut = new Cut(db);

        RemoteDatabase rdb = new RemoteDatabase();

        rdb.createCommand(add);
        rdb.pressCommand();
        rdb.createCommand(remove);
        rdb.pressCommand();

    }
}
