import Enums.Speciality;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static final String SPLIT_REGEX = ",";
    FileManager fileManager = new FileManager();

    public List<Doctor> convertToDoctor(List<String> text) {
        List<Doctor> doctor = new ArrayList<>();
        for (String line : text) {
            String[] doctorText = line.split(SPLIT_REGEX);
Doctor currentDoctor = null;
            currentDoctor = new Doctor(doctorText[1], doctorText[2], Integer.parseInt(doctorText[0]), Speciality.GASTROENTEROLOGY);
                doctor.add(currentDoctor);
        }
        return doctor;
    }

}
