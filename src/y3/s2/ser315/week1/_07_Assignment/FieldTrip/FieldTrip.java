//package y3.s2.ser315.week1._07_Assignment.FieldTrip;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class FieldTrip {
//    private Course course;
//    private List<RecordedObservation> observations;
//
//    public FieldTrip(Course course) {
//        this.course = course;
//        this.observations = new ArrayList<>();
//    }
//
//    public int makeWrittenObservation(Student stu, String summ, String descr) {
//        RecordedObservation sObservations = getRecordedObservation(stu);
//        return sObservations.writeObservation(summ, descr);
//    }
//
//    public int makePhotoObservation(Student stu, String imgURL, Double dLat, Double dLong) {
//        RecordedObservation sObservations = getRecordedObservation(stu);
//        return sObservations.photoObservation(imgURL, dLat, dLong);
//    }
//
//    public List<String> getStudentNames() {
//        List<String> studentNames = new ArrayList<>();
//        for (RecordedObservation obs: this.observations) {
//            studentNames.add(obs.getStudent().getName());
//        }
//        return studentNames;
//    }
//
//    public List<RecordedObservation> getObservations() {
//        return new ArrayList(this.observations);
//    }
//
//    public int getObservationCount() {
//        int count = 0;
//        for (RecordedObservation obs: this.observations) {
//            count += obs.getObservationCount();
//        }
//        return count;
//    }
//
//    private RecordedObservation getRecordedObservation(Student stu) {
//        RecordedObservation studentObs = null;
//        for (RecordedObservation obs: this.observations) {
//            if (obs.getStudent().equals(stu)) {
//                studentObs = obs;
//                break;
//            }
//        }
//        if (studentObs == null) {
//            studentObs = new RecordedObservation(stu);
//            this.observations.add(studentObs);
//        }
//        return studentObs;
//    }
//
//}
