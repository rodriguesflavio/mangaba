/* This file was generated by SableCC (http://www.sablecc.org/). */

package Mangaba.node;

import Mangaba.analysis.*;

@SuppressWarnings("nls")
public final class AAtribListaAtrib extends PListaAtrib
{
    private PAtrib _atrib_;

    public AAtribListaAtrib()
    {
        // Constructor
    }

    public AAtribListaAtrib(
        @SuppressWarnings("hiding") PAtrib _atrib_)
    {
        // Constructor
        setAtrib(_atrib_);

    }

    @Override
    public Object clone()
    {
        return new AAtribListaAtrib(
            cloneNode(this._atrib_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAtribListaAtrib(this);
    }

    public PAtrib getAtrib()
    {
        return this._atrib_;
    }

    public void setAtrib(PAtrib node)
    {
        if(this._atrib_ != null)
        {
            this._atrib_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._atrib_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._atrib_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._atrib_ == child)
        {
            this._atrib_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._atrib_ == oldChild)
        {
            setAtrib((PAtrib) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
