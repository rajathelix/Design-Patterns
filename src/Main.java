import CreationalDesignPattern.FactoryPattern.Factory.Dialog;
import CreationalDesignPattern.FactoryPattern.Factory.HtmlDialog;
import CreationalDesignPattern.FactoryPattern.Factory.WindowDialog;

public class Main {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure(){
        if(System.getProperty("os.name").equals("Windows 11")){
            dialog = new WindowDialog();
        }
        else{
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic(){
        dialog.renderWindow();
    }
}