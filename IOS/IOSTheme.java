package FactoryPattern.IOS;

import FactoryPattern.Base.Theme;
import FactoryPattern.Base.ThemeComponentFactory;

public class IOSTheme extends Theme {
    @Override
    public ThemeComponentFactory createThemeComponentFactory() {
        return new IOSThemeCompnentFactory();
    }
}
