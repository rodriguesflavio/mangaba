/* This file was generated by SableCC (http://www.sablecc.org/). */

package Mangaba.node;

import Mangaba.analysis.*;

@SuppressWarnings("nls")
public final class AParamsParametros extends PParametros
{
    private PParametros _parametros_;
    private TBarra _barra_;
    private PParametro _parametro_;

    public AParamsParametros()
    {
        // Constructor
    }

    public AParamsParametros(
        @SuppressWarnings("hiding") PParametros _parametros_,
        @SuppressWarnings("hiding") TBarra _barra_,
        @SuppressWarnings("hiding") PParametro _parametro_)
    {
        // Constructor
        setParametros(_parametros_);

        setBarra(_barra_);

        setParametro(_parametro_);

    }

    @Override
    public Object clone()
    {
        return new AParamsParametros(
            cloneNode(this._parametros_),
            cloneNode(this._barra_),
            cloneNode(this._parametro_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParamsParametros(this);
    }

    public PParametros getParametros()
    {
        return this._parametros_;
    }

    public void setParametros(PParametros node)
    {
        if(this._parametros_ != null)
        {
            this._parametros_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parametros_ = node;
    }

    public TBarra getBarra()
    {
        return this._barra_;
    }

    public void setBarra(TBarra node)
    {
        if(this._barra_ != null)
        {
            this._barra_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._barra_ = node;
    }

    public PParametro getParametro()
    {
        return this._parametro_;
    }

    public void setParametro(PParametro node)
    {
        if(this._parametro_ != null)
        {
            this._parametro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parametro_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._parametros_)
            + toString(this._barra_)
            + toString(this._parametro_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._parametros_ == child)
        {
            this._parametros_ = null;
            return;
        }

        if(this._barra_ == child)
        {
            this._barra_ = null;
            return;
        }

        if(this._parametro_ == child)
        {
            this._parametro_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._parametros_ == oldChild)
        {
            setParametros((PParametros) newChild);
            return;
        }

        if(this._barra_ == oldChild)
        {
            setBarra((TBarra) newChild);
            return;
        }

        if(this._parametro_ == oldChild)
        {
            setParametro((PParametro) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
