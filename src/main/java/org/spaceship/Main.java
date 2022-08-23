package org.spaceship;

public class Main {
    public static void main( String[] args ) {
        Ship ship = new Ship( 'S', 20, 30 );
        Asteroid asteroid = new Asteroid( 'N', 50, 40, 10 );

        ship.loseLife( asteroid.getDamage() );
        System.out.println( ship );
        System.out.println( asteroid );

    }
}