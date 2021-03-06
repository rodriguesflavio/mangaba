/* This file was generated by SableCC (http://www.sablecc.org/). */

package Mangaba.node;

import Mangaba.analysis.*;

@SuppressWarnings("nls")
public final class TCaractereLiteral extends Token
{
    public TCaractereLiteral(String text)
    {
        setText(text);
    }

    public TCaractereLiteral(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCaractereLiteral(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCaractereLiteral(this);
    }
}
