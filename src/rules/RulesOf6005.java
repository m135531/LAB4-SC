package rules;

/**
 * Implements the collaboration-policy decision used in Lab 04.
 *
 * Code may be used when it was written by the student, OR when external
 * material satisfies all permitted-use conditions:
 *   1. it is available to everyone,
 *   2. it was not produced as another student's course work,
 *   3. the source is cited, and
 *   4. the assignment does not specifically require the student to
 *      implement that code independently.
 */
public final class RulesOf6005 {

    private RulesOf6005() {
        // Utility class; no instances are required.
    }

    public static boolean mayUseCodeInAssignment(
            boolean writtenByYourself,
            boolean availableToOthers,
            boolean writtenAsCourseWork,
            boolean citingYourSource,
            boolean implementationRequired) {

    	return false;
                    
    }

    /**
     * Small demonstration used for the lab's "Run as Java Application" step.
     */
    public static void main(String[] args) {
        boolean ownCode = mayUseCodeInAssignment(
                true, false, false, false, true);

        boolean citedExternalReference = mayUseCodeInAssignment(
                false, true, false, true, false);

        boolean anotherStudentsCoursework = mayUseCodeInAssignment(
                false, true, true, true, false);

        System.out.println("Own code may be used: " + ownCode);
        System.out.println("Permitted cited external code may be used: "
                + citedExternalReference);
        System.out.println("Another student's coursework may be used: "
                + anotherStudentsCoursework);
    }
}
