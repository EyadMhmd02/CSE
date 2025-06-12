import java.util.ArrayList;
import java.util.Date;

// Abstract Appointment class (base class for all appointment types)
public abstract class Appointment {
    private int appointmentID;
    private Date startTime;
    
    public Appointment(int appointmentID, Date startTime) {
        this.appointmentID = appointmentID;
        this.startTime = startTime;
    }
    
    public int getID() {
        return appointmentID;
    }
    
    public Date getStartTime() {
        return startTime;
    }
}

// Online Appointment class (inherits from Appointment)
public class OnlineAppointment extends Appointment {
    private String linkURL;
    
    public OnlineAppointment(int appointmentID, Date startTime) {
        super(appointmentID, startTime);
        this.linkURL = "https://meeting.asu.edu/" + appointmentID; // Generate a default link
    }
    
    public String getLink() {
        return linkURL;
    }
}

// Campus Appointment class (inherits from Appointment)
public class CampusAppointment extends Appointment {
    private tutoringRoom room;
    
    public CampusAppointment(int appointmentID, Date startTime, tutoringRoom room) {
        super(appointmentID, startTime);
        this.room = room;
    }
    
    public tutoringRoom getRoom() {
        return room;
    }
}

// Tutoring Room class
public class tutoringRoom {
    private static final int CAPACITY = 5; // Maximum capacity for a room
    private String roomName;
    
    public tutoringRoom(String roomName) {
        this.roomName = roomName;
    }
    
    public int getCapacity() {
        return CAPACITY;
    }
    
    public String getRoomName() {
        return roomName;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        tutoringRoom that = (tutoringRoom) obj;
        return roomName.equals(that.roomName);
    }
}

// Tutor Data class
public class TutorData {
    private String email;
    private String name;
    private ArrayList<Appointment> appointments;
    
    public TutorData(String email, String name) {
        this.email = email;
        this.name = name;
        this.appointments = new ArrayList<>();
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getName() {
        return name;
    }
    
    public void addAppointment(Appointment appt) {
        appointments.add(appt);
    }
    
    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }
}

// Manage Accounts control class
public class ManageAccounts {
    private ArrayList<TutorData> tutors;
    
    public ManageAccounts() {
        tutors = new ArrayList<>();
    }
    
    public void addTutor(TutorData tutor) {
        tutors.add(tutor);
    }
    
    public TutorData getTutor(String email) {
        for (TutorData tutor : tutors) {
            if (tutor.getEmail().equals(email)) {
                return tutor;
            }
        }
        return null; // No tutor found with the given email
    }
}

// Manage Appointments control class
public class ManageAppts {
    private ArrayList<tutoringRoom> rooms;
    private ArrayList<Appointment> appointments;
    private ManageAccounts accountManager;
    private static int nextAppointmentID = 1; // For generating unique IDs
    
    public ManageAppts(ManageAccounts accountManager) {
        this.rooms = new ArrayList<>();
        this.appointments = new ArrayList<>();
        this.accountManager = accountManager;
        
        // Initialize with a default room
        rooms.add(new tutoringRoom("Main Tutoring Room"));
    }
    
    /**
     * Creates an appointment for a tutor.
     * 
     * @param email The email of the tutor
     * @param time The time of the appointment
     * @param online Whether the appointment is online or on campus
     * @return true if the appointment was created successfully, false otherwise
     */
    public boolean createAppointment(String email, Date time, boolean online) {
        // Step 2: Get the tutor from ManageAccounts
        TutorData tutor = accountManager.getTutor(email);
        
        // Check if tutor exists
        if (tutor == null) {
            System.out.println("Tutor not found with email: " + email);
            return false;
        }
        
        // Step 4: Get a tutoring room
        tutoringRoom room = getRoom();
        
        // Step 5: Check if there are already 5 appointments at this time in this room
        boolean already5 = checkAppointments(time, room);
        
        Appointment appointment;
        
        // Step 6a: Create online appointment (always allowed)
        if (online) {
            appointment = new OnlineAppointment(generateAppointmentID(), time);
            appointments.add(appointment);
            
            // Step 7: Add appointment to tutor
            tutor.addAppointment(appointment);
            
            System.out.println("Appointment created");
            return true;
        } 
        // Step 6b: Create campus appointment if room is not at capacity
        else if (!already5) {
            appointment = new CampusAppointment(generateAppointmentID(), time, room);
            appointments.add(appointment);
            
            // Step 7: Add appointment to tutor
            tutor.addAppointment(appointment);
            
            System.out.println("Appointment created");
            return true;
        } 
        // Room is at capacity
        else {
            System.out.println("Already 5 appointments at this time");
            return false;
        }
    }
    
    /**
     * Checks if there are already 5 appointments at the given time in the given room.
     * 
     * @param time The time to check
     * @param room The room to check
     * @return true if there are already 5 appointments, false otherwise
     */
    private boolean checkAppointments(Date time, tutoringRoom room) {
        int count = 0;
        
        for (Appointment appt : appointments) {
            if (appt instanceof CampusAppointment) {
                CampusAppointment campusAppt = (CampusAppointment) appt;
                
                // Check if appointment is at same time and room
                if (campusAppt.getStartTime().equals(time) && 
                    campusAppt.getRoom().equals(room)) {
                    count++;
                }
            }
        }
        
        // Return true if room is already at capacity
        return count >= 5;
    }
    
    /**
     * Gets a tutoring room (returns the first one for simplicity).
     * 
     * @return A tutoring room
     */
    public tutoringRoom getRoom() {
        // For simplicity, return the first room
        if (rooms.isEmpty()) {
            return null;
        }
        return rooms.get(0);
    }
    
    /**
     * Generates a unique appointment ID.
     * 
     * @return A unique appointment ID
     */
    private int generateAppointmentID() {
        return nextAppointmentID++;
    }
    
    /**
     * Gets all appointments.
     * 
     * @return All appointments
     */
    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }
}

// Main class for testing
public class Main {
    public static void main(String[] args) {
        // Create control instances
        ManageAccounts accountManager = new ManageAccounts();
        ManageAppts appointmentManager = new ManageAppts(accountManager);
        
        // Create tutors
        TutorData david = new TutorData("david@asu.edu", "David");
        TutorData jacob = new TutorData("jacob@asu.edu", "Jacob");
        TutorData joe = new TutorData("joe@asu.edu", "Joe");
        TutorData kelly = new TutorData("kelly@asu.edu", "Kelly");
        
        // Add tutors to account manager
        accountManager.addTutor(david);
        accountManager.addTutor(jacob);
        accountManager.addTutor(joe);
        accountManager.addTutor(kelly);
        
        // Test appointment creation
        Date time1 = new Date(); // Current time
        Date time2 = new Date(time1.getTime() + 3600000); // Current time + 1 hour
        
        System.out.println("=== Testing Online Appointment Creation ===");
        boolean result1 = appointmentManager.createAppointment("david@asu.edu", time1, true);
        System.out.println("Online appointment for David created: " + result1);
        
        System.out.println("\n=== Testing Campus Appointment Creation ===");
        boolean result2 = appointmentManager.createAppointment("jacob@asu.edu", time1, false);
        System.out.println("Campus appointment for Jacob created: " + result2);
        
        System.out.println("\n=== Testing Multiple Campus Appointments at Same Time ===");
        // Create 5 more campus appointments at the same time to test capacity limit
        for (int i = 0; i < 5; i++) {
            boolean res = appointmentManager.createAppointment("joe@asu.edu", time1, false);
            System.out.println("Campus appointment " + (i+1) + " for Joe created: " + res);
        }
        
        System.out.println("\n=== Testing Invalid Tutor Email ===");
        boolean result3 = appointmentManager.createAppointment("nonexistent@asu.edu", time2, true);
        System.out.println("Appointment for nonexistent email created: " + result3);
        
        System.out.println("\n=== Current State of Appointments ===");
        displayAppointments(appointmentManager.getAppointments());
        
        System.out.println("\n=== Tutors' Appointments ===");
        displayTutorAppointments(david);
        displayTutorAppointments(jacob);
        displayTutorAppointments(joe);
        displayTutorAppointments(kelly);
    }
    
    // Helper method to display all appointments
    private static void displayAppointments(ArrayList<Appointment> appointments) {
        System.out.println("Total appointments: " + appointments.size());
        for (Appointment appt : appointments) {
            String type = appt instanceof OnlineAppointment ? "Online" : "Campus";
            System.out.println("ID: " + appt.getID() + ", Time: " + appt.getStartTime() + ", Type: " + type);
        }
    }
    
    // Helper method to display a tutor's appointments
    private static void displayTutorAppointments(TutorData tutor) {
        ArrayList<Appointment> appointments = tutor.getAppointments();
        System.out.println(tutor.getName() + "'s appointments: " + appointments.size());
        for (Appointment appt : appointments) {
            String type = appt instanceof OnlineAppointment ? "Online" : "Campus";
            System.out.println("ID: " + appt.getID() + ", Time: " + appt.getStartTime() + ", Type: " + type);
        }
    }