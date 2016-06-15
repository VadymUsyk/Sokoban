package com.javarush.test.level34.lesson15.big01.model;

import java.awt.*;

/**
 * Created by vadym on 13.06.2016.
 */
public class Player extends CollisionObject implements Movable
{
    public Player(int x, int y)
    {
        super(x, y);
    }

    @Override
    public void draw(Graphics graphics)
    {
        graphics.setColor(Color.GREEN);
        int leftUpperCornerX = getX() - getWidth() / 2;
        int leftUpperCornerY = getY() - getHeight() / 2;
        graphics.drawOval(leftUpperCornerX, leftUpperCornerY, getHeight(), getWidth());
        graphics.fillOval(leftUpperCornerX, leftUpperCornerY, getHeight(),getWidth());
    }

    @Override
    public void move(int x, int y)
    {
        this.setX(getX() + x);
        this.setY(getY() + y);
    }
}
