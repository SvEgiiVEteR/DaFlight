package me.dags.daflight.gui;

/**
 * @author dags_ <dags@dags.me>
 */

public class UIToggle extends UIBind
{
    private boolean boolValue = false;
    private String on;
    private String off;

    public UIToggle(int width, int height, String on, String off)
    {
        super(width, height);
        this.on = on;
        this.off = off;
    }

    @Override
    public UIToggle left(int left)
    {
        super.left(left);
        return this;
    }

    @Override
    public String getText()
    {
        return boolValue ? on : off;
    }

    public UIToggle set(boolean value)
    {
        this.boolValue = value;
        return this;
    }

    @Override
    public void mouseClick(int mouseX, int mouseY, int button)
    {
        if (mouseOver)
        {
            boolValue = !boolValue;
            super.value = boolValue + "";
            active = true;
        }
    }

    @Override
    public void mouseRelease()
    {
        active = false;
    }

    @Override
    public void keyType(char character, int id)
    {}

    public boolean boolValue()
    {
        return boolValue;
    }
}
