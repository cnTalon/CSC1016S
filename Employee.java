// Assignment 5
// 3 September 2022

import java.util.*;

public class Employee {
    String name;
    String uid;
    CalendarTime signIn, signOut;
    private List<Shift> shifts;

    // create employee
    public Employee(String name, String uid) {
        this.name = name;
        this.uid = uid;
        signIn = null;
        signOut = null;
        this.shifts = new ArrayList<>();
    }

    // obtain name
    public String name() {
        return name;
    }

    // obtain id
    public String UID() {
        return uid;
    }

    // record sign in
    public void signIn(Date d, Time t) {
        CalendarTime signIn = new CalendarTime(d, t);
        this.signIn = signIn;
        //shifts.add(signIn.Shift());
    }

    // record sign out
    public void signOut(Date d, Time t) {
        CalendarTime signOut = new CalendarTime(d, t);
        this.signOut = signOut;
        shifts.add(new Shift(signIn, signOut));
    }

    // determine if working currently
    public boolean present() {
        if (signIn == null) {
            return false;
        }
        else if (signIn != null && signIn == null) {
            return false;
        }
        else if (signOut != null) {
            return false;
        }
        return true;
    }

    // determine if worked shift at particular date
    public boolean worked(Date d) {
        for (Shift i : shifts) {
            if (i.includesDate(d)) {
                return true;
            }
        }
        return false;
    }

    // determine if worked shift on particular week
    public boolean worked(Week w) {
        for (Shift j : shifts) {
            if (j.inWeek(w)) {
                return true;
            }
        }
        return false;
    }

    // obtain shifts worked on given date
    public List<Shift> get(Date d) {
        List shiftsD = new ArrayList<>();
        for (Shift k : shifts) {
            if (k.includesDate(d)) {
                shiftsD.add(k);
            }
        }
        return shiftsD;
    }

    // obtain shifts worked in given week
    public List<Shift> get(Week w) {
        List shiftsW = new ArrayList<>();
        for (Shift l : shifts) {
            if (l.inWeek(w)) {
                shiftsW.add(l);
            }
        }
        return shiftsW;
    }

    // returns time worked
    public Duration hours(Week w) {
        Duration duration = new Duration(0);
        for (Shift p : shifts) {
            if (p.inWeek(w)) {
                duration = duration.add(p.length());
            }
        }
        return duration;
    }
}
