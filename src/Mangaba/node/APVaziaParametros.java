/* This file was generated by SableCC (http://www.sablecc.org/). */

package Mangaba.node;

import Mangaba.analysis.*;

@SuppressWarnings("nls")
public final class APVaziaParametros extends PParametros
{

    public APVaziaParametros()
    {
        // Constructor
    }

    @Override
    public Object clone()
    {
        return new APVaziaParametros();
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPVaziaParametros(this);
    }

    @Override
    public String toString()
    {
        return "";
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        throw new RuntimeException("Not a child.");
    }
}
