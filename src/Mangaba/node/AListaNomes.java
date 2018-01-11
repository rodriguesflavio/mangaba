/* This file was generated by SableCC (http://www.sablecc.org/). */

package Mangaba.node;

import Mangaba.analysis.*;

@SuppressWarnings("nls")
public final class AListaNomes extends PListaNomes
{
    private PListaNomes _listaNomes_;
    private TVirgula _virgula_;
    private TIdentificador _identificador_;

    public AListaNomes()
    {
        // Constructor
    }

    public AListaNomes(
        @SuppressWarnings("hiding") PListaNomes _listaNomes_,
        @SuppressWarnings("hiding") TVirgula _virgula_,
        @SuppressWarnings("hiding") TIdentificador _identificador_)
    {
        // Constructor
        setListaNomes(_listaNomes_);

        setVirgula(_virgula_);

        setIdentificador(_identificador_);

    }

    @Override
    public Object clone()
    {
        return new AListaNomes(
            cloneNode(this._listaNomes_),
            cloneNode(this._virgula_),
            cloneNode(this._identificador_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListaNomes(this);
    }

    public PListaNomes getListaNomes()
    {
        return this._listaNomes_;
    }

    public void setListaNomes(PListaNomes node)
    {
        if(this._listaNomes_ != null)
        {
            this._listaNomes_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listaNomes_ = node;
    }

    public TVirgula getVirgula()
    {
        return this._virgula_;
    }

    public void setVirgula(TVirgula node)
    {
        if(this._virgula_ != null)
        {
            this._virgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._virgula_ = node;
    }

    public TIdentificador getIdentificador()
    {
        return this._identificador_;
    }

    public void setIdentificador(TIdentificador node)
    {
        if(this._identificador_ != null)
        {
            this._identificador_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identificador_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._listaNomes_)
            + toString(this._virgula_)
            + toString(this._identificador_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._listaNomes_ == child)
        {
            this._listaNomes_ = null;
            return;
        }

        if(this._virgula_ == child)
        {
            this._virgula_ = null;
            return;
        }

        if(this._identificador_ == child)
        {
            this._identificador_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._listaNomes_ == oldChild)
        {
            setListaNomes((PListaNomes) newChild);
            return;
        }

        if(this._virgula_ == oldChild)
        {
            setVirgula((TVirgula) newChild);
            return;
        }

        if(this._identificador_ == oldChild)
        {
            setIdentificador((TIdentificador) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
