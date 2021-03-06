/* This file was generated by SableCC (http://www.sablecc.org/). */

package Mangaba.node;

import Mangaba.analysis.*;

@SuppressWarnings("nls")
public final class AP2ListaPontoVirgula extends PListaPontoVirgula
{
    private TPontoevirgula _pontoevirgula_;
    private PAtrib _atrib_;

    public AP2ListaPontoVirgula()
    {
        // Constructor
    }

    public AP2ListaPontoVirgula(
        @SuppressWarnings("hiding") TPontoevirgula _pontoevirgula_,
        @SuppressWarnings("hiding") PAtrib _atrib_)
    {
        // Constructor
        setPontoevirgula(_pontoevirgula_);

        setAtrib(_atrib_);

    }

    @Override
    public Object clone()
    {
        return new AP2ListaPontoVirgula(
            cloneNode(this._pontoevirgula_),
            cloneNode(this._atrib_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP2ListaPontoVirgula(this);
    }

    public TPontoevirgula getPontoevirgula()
    {
        return this._pontoevirgula_;
    }

    public void setPontoevirgula(TPontoevirgula node)
    {
        if(this._pontoevirgula_ != null)
        {
            this._pontoevirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pontoevirgula_ = node;
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
            + toString(this._pontoevirgula_)
            + toString(this._atrib_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pontoevirgula_ == child)
        {
            this._pontoevirgula_ = null;
            return;
        }

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
        if(this._pontoevirgula_ == oldChild)
        {
            setPontoevirgula((TPontoevirgula) newChild);
            return;
        }

        if(this._atrib_ == oldChild)
        {
            setAtrib((PAtrib) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
