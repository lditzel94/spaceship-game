package org.spaceship;

import java.util.Objects;

public class Ship extends GraphicalObject {
    private int life;
    private double speed;

    @Override
    public void changePosition( int x, int y, char direction ) {
        rotate( direction );
        setPositionX( x );
        setPositionY( y );
    }

    public void rotate( char direction ) {
        setDirection( direction );
    }

    public void loseLife( int damage ) {
        setLife( getLife() - damage );
    }

    public Ship( char direction, int positionX, int positionY ) {
        super( direction, positionX, positionY );
        life = 50;
        speed = 100;
    }

    public int getLife() {
        return life;
    }

    public void setLife( int life ) {
        this.life = life;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed( double speed ) {
        this.speed = speed;
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        Ship ship = ( Ship ) o;
        return life == ship.life && Double.compare( ship.speed, speed ) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash( super.hashCode(), life, speed );
    }

    @Override
    public String toString() {
        return "Ship{" +
                "life=" + life +
                ", speed=" + speed +
                ", direction=" + direction +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}
