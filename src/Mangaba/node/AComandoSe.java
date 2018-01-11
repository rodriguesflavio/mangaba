/* This file was generated by SableCC (http://www.sablecc.org/). */

package Mangaba.node;

import Mangaba.analysis.*;

@SuppressWarnings("nls")
public final class AComandoSe extends PComandoSe
{
    private TSe _se_;
    private TAbreparenteses _abreparenteses_;
    private PExpr _expr_;
    private TFechaparenteses _fechaparenteses_;
    private PComando _comando_;

    public AComandoSe()
    {
        // Constructor
    }

    public AComandoSe(
        @SuppressWarnings("hiding") TSe _se_,
        @SuppressWarnings("hiding") TAbreparenteses _abreparenteses_,
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") TFechaparenteses _fechaparenteses_,
        @SuppressWarnings("hiding") PComando _comando_)
    {
        // Constructor
        setSe(_se_);

        setAbreparenteses(_abreparenteses_);

        setExpr(_expr_);

        setFechaparenteses(_fechaparenteses_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new AComandoSe(
            cloneNode(this._se_),
            cloneNode(this._abreparenteses_),
            cloneNode(this._expr_),
            cloneNode(this._fechaparenteses_),
            cloneNode(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComandoSe(this);
    }

    public TSe getSe()
    {
        return this._se_;
    }

    public void setSe(TSe node)
    {
        if(this._se_ != null)
        {
            this._se_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._se_ = node;
    }

    public TAbreparenteses getAbreparenteses()
    {
        return this._abreparenteses_;
    }

    public void setAbreparenteses(TAbreparenteses node)
    {
        if(this._abreparenteses_ != null)
        {
            this._abreparenteses_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._abreparenteses_ = node;
    }

    public PExpr getExpr()
    {
        return this._expr_;
    }

    public void setExpr(PExpr node)
    {
        if(this._expr_ != null)
        {
            this._expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expr_ = node;
    }

    public TFechaparenteses getFechaparenteses()
    {
        return this._fechaparenteses_;
    }

    public void setFechaparenteses(TFechaparenteses node)
    {
        if(this._fechaparenteses_ != null)
        {
            this._fechaparenteses_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fechaparenteses_ = node;
    }

    public PComando getComando()
    {
        return this._comando_;
    }

    public void setComando(PComando node)
    {
        if(this._comando_ != null)
        {
            this._comando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comando_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._se_)
            + toString(this._abreparenteses_)
            + toString(this._expr_)
            + toString(this._fechaparenteses_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._se_ == child)
        {
            this._se_ = null;
            return;
        }

        if(this._abreparenteses_ == child)
        {
            this._abreparenteses_ = null;
            return;
        }

        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        if(this._fechaparenteses_ == child)
        {
            this._fechaparenteses_ = null;
            return;
        }

        if(this._comando_ == child)
        {
            this._comando_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._se_ == oldChild)
        {
            setSe((TSe) newChild);
            return;
        }

        if(this._abreparenteses_ == oldChild)
        {
            setAbreparenteses((TAbreparenteses) newChild);
            return;
        }

        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(this._fechaparenteses_ == oldChild)
        {
            setFechaparenteses((TFechaparenteses) newChild);
            return;
        }

        if(this._comando_ == oldChild)
        {
            setComando((PComando) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
