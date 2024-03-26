package FactoryPattern.Material;

import FactoryPattern.Base.Button;
import FactoryPattern.Base.Click;
import FactoryPattern.Base.DropDown;
import FactoryPattern.Base.ThemeComponentFactory;

public class MaterialThemeFactory implements ThemeComponentFactory {
    @Override
    public Button button() {
        return null;
    }

    @Override
    public DropDown dropdown() {
        return null;
    }

    @Override
    public Click click() {
        return null;
    }
}
