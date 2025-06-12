# Operational Pattern for createAppointment

```
Operation = createAppointment
Description = A Tutor tries to create an appointment at a specific time. You can assume the
tutor exists.
Input = email: String, time: Date, online: Boolean
Reads = ma : ManageAppts,
maccount : ManageAccounts with (ma, maccount) ∈ communicates_1,
t : TutorData with (maccount, t) ∈ manages1 ∧ t.email = email,
r : tutoringRoom with (ma, r) ∈ manages3,
manages3, manages1, communicates_1
Changes = campusAppointment, ca : CampusAppointment type, located_in,
onlineAppointment, oa : onlineAppointment type, schedules, knows
Sends = Tutor : {Already 5 appointments at this time, Appointment created}
Pre = implicit
Post = LET
already5 = #{appt : campusAppointment | a.time = time ∧ (appt, r) ∈ located_in} ≥ 5
•
(online ⇒
oa new ∧ oa.time = time ∧ knows' = knows ∪ {(ma, oa)} ∧
schedules' = schedules ∪ {(t, oa)} ∧
∄a : Appointment • a.id = oa.id ∧
is_sent{Appointment created} ∧ no_effect
) ∧
(¬online ⇒
(already5 ⇒
is_sent{Already 5 appointments at this time} ∧ no_effect
) ∧
(¬already5 ⇒
ca new ∧ ca.time = time ∧ knows' = knows ∪ {(ma, ca)} ∧
schedules' = schedules ∪ {(t, ca)} ∧
located_in' = located_in ∪ {(ca, r)} ∧
∄a : Appointment • a.id = ca.id ∧
is_sent{Appointment created} ∧ no_effect
)
)
```

## Explanation of the Operational Pattern

This operational pattern specification describes the behavior of the `createAppointment` operation:

1. **Operation**: Creating an appointment by a tutor.

2. **Input Parameters**:
   - `email`: The email address of the tutor
   - `time`: The date and time of the appointment
   - `online`: Boolean indicating if the appointment is online (true) or on campus (false)

3. **Reads**:
   - The relevant control and entity objects, ensuring proper relationships between them

4. **Changes**:
   - For online appointments: creates a new OnlineAppointment and updates the relationships
   - For campus appointments: creates a new CampusAppointment and updates the relationships, including the room association

5. **Sends**:
   - Success message when appointment is created
   - Error message when trying to create a campus appointment when the room is already at capacity (5 appointments)

6. **Post-condition**:
   - The pattern checks whether the appointment is online or on campus
   - For online appointments, it creates a new online appointment
   - For campus appointments, it checks if there are already 5 appointments at this time in this room
   - If there are already 5 appointments, it sends an error message
   - If there are fewer than 5 appointments, it creates a new campus appointment

The variable `already5` is used to determine if the room is at capacity for the requested time.
