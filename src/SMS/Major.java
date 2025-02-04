package SMS;

import SMS.InvalidMajorException;

/**
 * Enum representing the different majors a student can have.
 */
public enum Major {
    /**
     * Major in Art.
     */
    ART,

    /**
     * Major in Economics.
     */
    ECONOMICS,

    /**
     * Major in Math.
     */
    MATH;

    public static SMS.Major fromString(String major) throws SMS.InvalidMajorException {
        try {
            return SMS.Major.valueOf(major.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new InvalidMajorException("Invalid major: " + major);
        }
    }
}