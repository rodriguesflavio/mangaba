/* This file was generated by SableCC (http://www.sablecc.org/). */

package Mangaba.node;

import Mangaba.analysis.*;

@SuppressWarnings("nls")
public final class AListaExp extends PListaExp
{

    public AListaExp()
    {
        // Constructor
    }

    @Override
    public Object clone()
    {
        return new AListaExp();
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListaExp(this);
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
