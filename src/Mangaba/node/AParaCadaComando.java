/* This file was generated by SableCC (http://www.sablecc.org/). */

package Mangaba.node;

import Mangaba.analysis.*;

@SuppressWarnings("nls")
public final class AParaCadaComando extends PComando
{
    private PComandoParaCada _comandoParaCada_;

    public AParaCadaComando()
    {
        // Constructor
    }

    public AParaCadaComando(
        @SuppressWarnings("hiding") PComandoParaCada _comandoParaCada_)
    {
        // Constructor
        setComandoParaCada(_comandoParaCada_);

    }

    @Override
    public Object clone()
    {
        return new AParaCadaComando(
            cloneNode(this._comandoParaCada_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParaCadaComando(this);
    }

    public PComandoParaCada getComandoParaCada()
    {
        return this._comandoParaCada_;
    }

    public void setComandoParaCada(PComandoParaCada node)
    {
        if(this._comandoParaCada_ != null)
        {
            this._comandoParaCada_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comandoParaCada_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comandoParaCada_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comandoParaCada_ == child)
        {
            this._comandoParaCada_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._comandoParaCada_ == oldChild)
        {
            setComandoParaCada((PComandoParaCada) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
