package CreationalDesignPattern.FactoryPattern.Factory;

import CreationalDesignPattern.FactoryPattern.Buttons.Button;
import CreationalDesignPattern.FactoryPattern.Buttons.WindowsButton;

public class WindowDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
