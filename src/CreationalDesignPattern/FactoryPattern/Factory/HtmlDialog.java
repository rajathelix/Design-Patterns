package CreationalDesignPattern.FactoryPattern.Factory;

import CreationalDesignPattern.FactoryPattern.Buttons.Button;
import CreationalDesignPattern.FactoryPattern.Buttons.HtmlButton;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
