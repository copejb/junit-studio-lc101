package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;


public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void bracketsTrueOne(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsTrueTwo(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bracketsTrueThree(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketsTrueFour(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void bracketFalseOne(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void bracketFalseTwo(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void bracketFalseThree(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code"));
    }

    @Test
    public void bracketFalseFour(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void bracketFalseFive(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void bracketFalseSix(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[ [[]] ]]]]]]] ["));
    }





    //     * These strings have balanced brackets:
//             *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
//             *
//             * While these do not:
//             *   "[LaunchCode", "Launch]Code[", "[", "]["
}
