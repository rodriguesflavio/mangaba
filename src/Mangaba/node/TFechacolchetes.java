/* This file was generated by SableCC (http://www.sablecc.org/). */

package Mangaba.node;

import Mangaba.analysis.*;

@SuppressWarnings("nls")
public final class TFechacolchetes extends Token
{
    public TFechacolchetes()
    {
        super.setText("]");
    }

    public TFechacolchetes(int line, int pos)
    {
        super.setText("]");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFechacolchetes(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFechacolchetes(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFechacolchetes text.");
    }
}
