package FactoryPattern.Base;

import FactoryPattern.IOS.IOSTheme;
import FactoryPattern.Material.MaterialButton;
import FactoryPattern.Material.MaterialTheme;

public class ThemeFactory {

    public static Theme getComponentFactory(String componentType)
    {
        if(componentType.equals("material"))
        {
            return new  MaterialTheme();
        }
        else
        {
            return new IOSTheme();
        }
    }

}
