public class EnumsConverter {
    public static Inspection enumInspectionFromString(String text) {
        return switch (text) {
            case "secondary" -> Inspection.SECONDARY;
            case "initial" -> Inspection.INITIAL;
            case "consultation" -> Inspection.CONSULTATION;
            case "procedure" -> Inspection.PROCEDURE;
            default -> null;
        };
    }

    public static Speciality enumSpecialityFromString(String text) {
        return switch (text) {
            case "anesthesiology" -> Speciality.ANESTHESIOLOGY;
            case "internaldiseases" -> Speciality.INTERNALDISEASES;
            case "gastroenterology" -> Speciality.GASTROENTEROLOGY;
            case "endocrinology" -> Speciality.ENDOCRINOLOGY;
            case "cardiology" -> Speciality.CARDIOLOGY;
            case "dermatology" -> Speciality.DERMATOLOGY;
            case "neurology" -> Speciality.NEUROLOGY;
            case "nephrology" -> Speciality.NEPHROLOGY;
            case "psychiatry" -> Speciality.PSYCHIATRY;
            case "rheumatology" -> Speciality.RHEUMATOLOGY;
            case "gynecology" -> Speciality.GYNECOLOGY;
            case "orthopedics" -> Speciality.ORTHOPEDICS;
            case "ophthalmology" -> Speciality.OPHTHALMOLOGY;
            case "urology" -> Speciality.UROLOGY;
            case "surgery" -> Speciality.SURGERY;
            default -> null;
        };
    }
}
