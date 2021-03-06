/* This file was generated by SableCC (http://www.sablecc.org/). */

package Mangaba.node;

import Mangaba.analysis.*;

@SuppressWarnings("nls")
public final class AAuxParaCada extends PAuxParaCada
{
    private PTipo _tipo_;
    private PListaId _listaId_;

    public AAuxParaCada()
    {
        // Constructor
    }

    public AAuxParaCada(
        @SuppressWarnings("hiding") PTipo _tipo_,
        @SuppressWarnings("hiding") PListaId _listaId_)
    {
        // Constructor
        setTipo(_tipo_);

        setListaId(_listaId_);

    }

    @Override
    public Object clone()
    {
        return new AAuxParaCada(
            cloneNode(this._tipo_),
            cloneNode(this._listaId_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAuxParaCada(this);
    }

    public PTipo getTipo()
    {
        return this._tipo_;
    }

    public void setTipo(PTipo node)
    {
        if(this._tipo_ != null)
        {
            this._tipo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipo_ = node;
    }

    public PListaId getListaId()
    {
        return this._listaId_;
    }

    public void setListaId(PListaId node)
    {
        if(this._listaId_ != null)
        {
            this._listaId_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listaId_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipo_)
            + toString(this._listaId_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipo_ == child)
        {
            this._tipo_ = null;
            return;
        }

        if(this._listaId_ == child)
        {
            this._listaId_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipo_ == oldChild)
        {
            setTipo((PTipo) newChild);
            return;
        }

        if(this._listaId_ == oldChild)
        {
            setListaId((PListaId) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
