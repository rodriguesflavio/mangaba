/* This file was generated by SableCC (http://www.sablecc.org/). */

package Mangaba.node;

import Mangaba.analysis.*;

@SuppressWarnings("nls")
public final class ACaractTipoEsp extends PTipoEsp
{
    private TCaractereLiteral _caractereLiteral_;

    public ACaractTipoEsp()
    {
        // Constructor
    }

    public ACaractTipoEsp(
        @SuppressWarnings("hiding") TCaractereLiteral _caractereLiteral_)
    {
        // Constructor
        setCaractereLiteral(_caractereLiteral_);

    }

    @Override
    public Object clone()
    {
        return new ACaractTipoEsp(
            cloneNode(this._caractereLiteral_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACaractTipoEsp(this);
    }

    public TCaractereLiteral getCaractereLiteral()
    {
        return this._caractereLiteral_;
    }

    public void setCaractereLiteral(TCaractereLiteral node)
    {
        if(this._caractereLiteral_ != null)
        {
            this._caractereLiteral_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._caractereLiteral_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._caractereLiteral_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._caractereLiteral_ == child)
        {
            this._caractereLiteral_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._caractereLiteral_ == oldChild)
        {
            setCaractereLiteral((TCaractereLiteral) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
