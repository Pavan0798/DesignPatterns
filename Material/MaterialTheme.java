package FactoryPattern.Material;

import FactoryPattern.Base.Theme;
import FactoryPattern.Base.ThemeComponentFactory;

public class MaterialTheme extends Theme {
    @Override
    public ThemeComponentFactory createThemeComponentFactory() {
        return new MaterialThemeFactory();
    }
}
