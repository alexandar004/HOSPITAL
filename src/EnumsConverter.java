public class EnumsConverter {
    public static Inspection enumInspectionFromString(String text) {
        return switch (text) {
            case "SECONDARY" -> Inspection.SECONDARY;
            case "INITIAL" -> Inspection.INITIAL;
            case "CONSULTATION" -> Inspection.CONSULTATION;
            case "PROCEDURE" -> Inspection.PROCEDURE;
            default -> null;
        };
    }

    public static Speciality enumSpecialityFromString(String text) {
        return switch (text) {
            case "ANESTHESIOLOGY" -> Speciality.ANESTHESIOLOGY;
            case "INTERNALDISEASES" -> Speciality.INTERNALDISEASES;
            case "GASTROENTEROLOGY" -> Speciality.GASTROENTEROLOGY;
            case "ENDOCRINOLOGY" -> Speciality.ENDOCRINOLOGY;
            case "CARDIOLOGY" -> Speciality.CARDIOLOGY;
            case "DERMATOLOGY" -> Speciality.DERMATOLOGY;
            case "NEUROLOGY" -> Speciality.NEUROLOGY;
            case "NEPHROLOGY" -> Speciality.NEPHROLOGY;
            case "PSYCHIATRY" -> Speciality.PSYCHIATRY;
            case "RHEUMATOLOGY" -> Speciality.RHEUMATOLOGY;
            case "GYNECOLOGY" -> Speciality.GYNECOLOGY;
            case "ORTHOPEDICS" -> Speciality.ORTHOPEDICS;
            case "OPHTHALMOLOGY" -> Speciality.OPHTHALMOLOGY;
            case "UROLOGY" -> Speciality.UROLOGY;
            case "SURGERY" -> Speciality.SURGERY;
            default -> null;
        };
    }
}