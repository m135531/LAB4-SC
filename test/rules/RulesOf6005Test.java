package rules;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests for RulesOf6005.mayUseCodeInAssignment.
 *
 * The tests deliberately cover distinct rules rather than repeating the
 * same case with different values.
 */
public class RulesOf6005Test {

    @Test
    public void testStudentMayUseOwnCode() {
        assertTrue(RulesOf6005.mayUseCodeInAssignment(
                true, false, false, false, true));
    }

    @Test
    public void testProperlyCitedExternalCodeMayBeUsedWhenImplementationNotRequired() {
        assertTrue(RulesOf6005.mayUseCodeInAssignment(
                false, true, false, true, false));
    }

    @Test
    public void testAnotherStudentsCourseworkMayNotBeUsed() {
        assertFalse(RulesOf6005.mayUseCodeInAssignment(
                false, true, true, true, false));
    }

    @Test
    public void testExternalCodeMayNotBeUsedWhenImplementationIsRequired() {
        assertFalse(RulesOf6005.mayUseCodeInAssignment(
                false, true, false, true, true));
    }

    @Test
    public void testUncitedExternalCodeMayNotBeUsed() {
        assertFalse(RulesOf6005.mayUseCodeInAssignment(
                false, true, false, false, false));
    }

    @Test
    public void testUnavailableExternalCodeMayNotBeUsed() {
        assertFalse(RulesOf6005.mayUseCodeInAssignment(
                false, false, false, true, false));
    }
    
    @Test
    public void testOwnCodeAllowedEvenWhenImplementationRequired() {
        assertTrue(RulesOf6005.mayUseCodeInAssignment(
                true,
                false,
                false,
                false,
                true));
    }
}
