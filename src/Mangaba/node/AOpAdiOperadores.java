/* This file was generated by SableCC (http://www.sablecc.org/). */

package Mangaba.node;

import Mangaba.analysis.*;

@SuppressWarnings("nls")
public final class AOpAdiOperadores extends POperadores
{
    private PExpr _expr_;
    private POpAdi _opAdi_;
    private PFator _fator_;

    public AOpAdiOperadores()
    {
        // Constructor
    }

    public AOpAdiOperadores(
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") POpAdi _opAdi_,
        @SuppressWarnings("hiding") PFator _fator_)
    {
        // Constructor
        setExpr(_expr_);

        setOpAdi(_opAdi_);

        setFator(_fator_);

    }

    @Override
    public Object clone()
    {
        return new AOpAdiOperadores(
            cloneNode(this._expr_),
            cloneNode(this._opAdi_),
            cloneNode(this._fator_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOpAdiOperadores(this);
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

    public POpAdi getOpAdi()
    {
        return this._opAdi_;
    }

    public void setOpAdi(POpAdi node)
    {
        if(this._opAdi_ != null)
        {
            this._opAdi_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._opAdi_ = node;
    }

    public PFator getFator()
    {
        return this._fator_;
    }

    public void setFator(PFator node)
    {
        if(this._fator_ != null)
        {
            this._fator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fator_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expr_)
            + toString(this._opAdi_)
            + toString(this._fator_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        if(this._opAdi_ == child)
        {
            this._opAdi_ = null;
            return;
        }

        if(this._fator_ == child)
        {
            this._fator_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(this._opAdi_ == oldChild)
        {
            setOpAdi((POpAdi) newChild);
            return;
        }

        if(this._fator_ == oldChild)
        {
            setFator((PFator) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
