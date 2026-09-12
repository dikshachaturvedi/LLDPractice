package TextEditor;

import java.util.Stack;

public class commandManager {

    Stack<Command> undoStack;

    Stack<Command> redoStack;

    void execute(Command command){

        command.execute();

       // undo.push(command);

        //redo.clear();
    }

    void undo(){

        Command cmd = undo.pop();

        cmd.undo();

       // redo.push(cmd);

    }
}
