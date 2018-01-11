/* This file was generated by SableCC (http://www.sablecc.org/). */

package Mangaba.node;

import Mangaba.analysis.*;

@SuppressWarnings("nls")
public final class AOprsExpr extends PExpr
{
    private POperadores _operadores_;

    public AOprsExpr()
    {
        // Constructor
    }

    public AOprsExpr(
        @SuppressWarnings("hiding") POperadores _operadores_)
    {
        // Constructor
        setOperadores(_operadores_);

    }

    @Override
    public Object clone()
    {
        return new AOprsExpr(
            cloneNode(this._operadores_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOprsExpr(this);
    }

    public POperadores getOperadores()
    {
        return this._operadores_;
    }

    public void setOperadores(POperadores node)
    {
        if(this._operadores_ != null)
        {
            this._operadores_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._operadores_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._operadores_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._operadores_ == child)
        {
            this._operadores_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._operadores_ == oldChild)
        {
            setOperadores((POperadores) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
