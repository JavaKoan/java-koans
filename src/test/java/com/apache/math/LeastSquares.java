package com.apache.math;


import org.apache.commons.math.MathException;
import org.apache.commons.math.stat.regression.SimpleRegression;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 14/06/13
 * Time: 13:36
 * To change this template use File | Settings | File Templates.
 */
public class LeastSquares {


    @Test
    public void shouldFindRelationshipBetweenValues() throws MathException {

        SimpleRegression sr = new SimpleRegression( );

        // Add data points
        sr.addData( 0, 0 );
        sr.addData( 1, 1.2 );
        sr.addData( 2, 2.6 );
        sr.addData( 3, 3.2 );
        sr.addData( 4, 4 );
        sr.addData( 5, 5 );

        // Print the value of y when line intersects the y axis
        System.out.println( "Intercept: " + sr.getIntercept( ) );

        // Print the number of data points
        System.out.println( "N: " + sr.getN( ) );

        // Print the Slope and the Slop Confidence
        System.out.println( "Slope: " + sr.getSlope( ) );
        System.out.println( "Slope Confidence: " + sr.getSlopeConfidenceInterval( ) );

        // Print RSquare a measure of relatedness
        System.out.println( "RSquare: " + sr.getRSquare( ) );
    }

    @Test
    public void shouldFindNoRelationshipBetweenValues() throws MathException {

        SimpleRegression sr = new SimpleRegression( );
        sr.addData( 400, 100 );
        sr.addData( 300, 105 );
        sr.addData( 350, 70 );
        sr.addData( 200, 50 );
        sr.addData( 150, 300 );
        sr.addData( 50, 500 );

        System.out.println( "Intercept: " + sr.getIntercept( ) );
        System.out.println( "N: " + sr.getN( ) );
        System.out.println( "Slope: " + sr.getSlope( ) );
        System.out.println( "Slope Confidence: " + sr.getSlopeConfidenceInterval( ) );
        System.out.println( "RSquare: " + sr.getRSquare( ) );
    }

}
