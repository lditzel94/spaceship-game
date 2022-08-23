package org.spaceship;

import java.util.Objects;

public abstract class GraphicalObject {

    protected char direction;
    protected int positionX;
    protected int positionY;

    public abstract void changePosition( int x, int y, char direction );

    public GraphicalObject( char direction, int positionX, int positionY ) {
        this.direction = direction;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection( char direction ) {
        this.direction = direction;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX( int positionX ) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY( int positionY ) {
        this.positionY = positionY;
    }


    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        GraphicalObject that = ( GraphicalObject ) o;
        return positionX == that.positionX && positionY == that.positionY;
    }

    @Override
    public int hashCode() {
        return Objects.hash( positionX, positionY );
    }

    @Override
    public String toString() {
        return "GraphicalObject { " +
                "direction=" + direction +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                " }";
    }


}
