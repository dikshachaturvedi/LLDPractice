import TextEditor.Command;

class InsertTextCommand implements Command {

    private document document;

    private int position;

    private String text;


    @Override
    public void execute() {
        document.insert(position,text);
    }

    @Override
    public void undo() {
        document.delete(position,text.length());
    }
}