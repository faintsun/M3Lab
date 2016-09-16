package model;

/**
 * Created by Sarah Veith on 9/15/2016.
 * This enumeration represents a student's class standing.
 */
public enum ClassStanding {
    FR("FRESHMAN", "FR"),
    SO("SOPHOMORE", "SO"),
    JR("JUNIOR", "JR"),
    SR("SENIOR", "SR");


    /**
     * string representation of a student's class standing
     */
    private final String name;

    /**
     * string representation of a student's class standing abbreviation
     */
    private final String code;

    /**
     * Constructor for enum
     *
     * @param name full name of student's class standing
     * @param code letter abbreviation of student's class standing
     */
    ClassStanding(String name, String code) {
        this.name = name;
        this.code = code;
    }

    /**
     * @return student's class standing
     */
    public String getName() {
        return name;
    }

    /**
     * @return abbreviation for student's class standing
     */
    public String getCode() {
        return code;
    }

    /**
     * @return the display string representation of class standing
     */
    public String toString() {
        return code;
    }
}
