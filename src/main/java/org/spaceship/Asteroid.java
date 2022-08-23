package org.spaceship;

import java.util.Objects;

public class Asteroid extends GraphicalObject {
    private int damage;

    @Override
    public void changePosition( int x, int y, char direction ) {
        setPositionX( x );
        setPositionY( y );
    }

    public Asteroid( char direction, int positionX, int positionY, int damage ) {
        super( direction, positionX, positionY );
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage( int damage ) {
        this.damage = damage;
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        Asteroid asteroid = ( Asteroid ) o;
        return damage == asteroid.damage;
    }

    @Override
    public int hashCode() {
        return Objects.hash( super.hashCode(), damage );
    }

    @Override
    public String toString() {
        return "Asteroid{" +
                "damage=" + damage +
                ", direction=" + direction +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}
