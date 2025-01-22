package Session17.SMS;

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
    public static Major fromString(String major) throws InvalidMajorException {
        try {
            return Major.valueOf(major.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new InvalidMajorException("Invalid major: " + major);
        }
    }
}