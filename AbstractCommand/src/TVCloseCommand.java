public class TVCloseCommand implements AbstractCommand {
    private Television tv;
    public TVCloseCommand()
    {
        tv=new Television();
    }

    @Override
    public void execute() {
        tv.close();
    }
}
