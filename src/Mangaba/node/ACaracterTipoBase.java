/* This file was generated by SableCC (http://www.sablecc.org/). */

package Mangaba.node;

import Mangaba.analysis.*;

@SuppressWarnings("nls")
public final class ACaracterTipoBase extends PTipoBase
{
    private TCaractere _caractere_;

    public ACaracterTipoBase()
    {
        // Constructor
    }

    public ACaracterTipoBase(
        @SuppressWarnings("hiding") TCaractere _caractere_)
    {
        // Constructor
        setCaractere(_caractere_);

    }

    @Override
    public Object clone()
    {
        return new ACaracterTipoBase(
            cloneNode(this._caractere_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACaracterTipoBase(this);
    }

    public TCaractere getCaractere()
    {
        return this._caractere_;
    }

    public void setCaractere(TCaractere node)
    {
        if(this._caractere_ != null)
        {
            this._caractere_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._caractere_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._caractere_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._caractere_ == child)
        {
            this._caractere_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._caractere_ == oldChild)
        {
            setCaractere((TCaractere) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}